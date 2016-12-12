package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import net.evecom.college.framework.model.EmpJobfairInfo;
import net.evecom.college.framework.model.EmpRecruitInfo;
import net.evecom.college.framework.model.EmpStudentsInfo;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class IndexController extends Controller{

    /**
     * 初始化首页的数据
     */
    public void index(){
        //校园招聘列表
        setAttr("schoolList", EmpRecruitInfo.dao.getEmpRecruitInfoList(getParaToInt(0,1),4,1));
        //实习招聘列表
        setAttr("practiceList",EmpRecruitInfo.dao.getEmpRecruitInfoList(getParaToInt(0,1),11,2));
        //网络招聘列表
        setAttr("netList",EmpRecruitInfo.dao.getEmpRecruitInfoList(getParaToInt(0,1),11,3));
        //通知一
        setAttr("firstNotice",EmpRecruitInfo.dao.getEmpRecruitInfoList(1,1,4).getList().get(0));
        //通知二
        setAttr("secondNotice",EmpRecruitInfo.dao.getEmpRecruitInfoList(2,1,4).getList().get(0));
        //大型招聘会一
        setAttr("firstJobFair", EmpJobfairInfo.dao.getEmpJodFairInfoList(1,1,1).getList().get(0));
        //大型招聘会二
        setAttr("secondJobFair", EmpJobfairInfo.dao.getEmpJodFairInfoList(2,1,1).getList().get(0));
        renderFreeMarker("/index.jsp");
    }

    /**
     * 根据用户点击的文章跳转到详情页面展示内容
     */
    public void detail(){
        String id = getPara(0);
        setAttr("recruit",EmpRecruitInfo.dao.getEmpRecruitInfo(id));
        setAttr("currentColumnName", EmpRecruitInfo.dao.getCurrentColumnName(id));
        renderFreeMarker("/content.jsp");
    }

    /**
     * 跳转到显示招聘会详情页面
     */
    public void jobfairDetail(){
        String id = getPara(0);
        setAttr("jobfair",EmpJobfairInfo.dao.getEmpJobFairInfo(id));
        setAttr("currentColumnName", "大型招聘会");
        renderFreeMarker("/jobfairContent.jsp");
    }

    /**
     * 显示招聘或通知列表
     */
    public void list(){
        String id = getPara(0);
        int typeId = getParaToInt(1);
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara(2) != null) {
            currentPage = getParaToInt(2);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getEmpRecruitInfoCount(typeId);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 10 == 0) {
            pageCount = infoCount / 10;
        } else {
            pageCount = infoCount / 10 + 1;
        }
        setAttr("infoList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, typeId));
        setAttr("currentColumnName", EmpRecruitInfo.dao.getCurrentColumnName(id));
        setAttr("infoId", id);
        setAttr("typeId", typeId);
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/list.jsp");
    }

    /**
     * 显示大型招聘会列表
     */
    public void jobfairList(){

        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //信息条数
        int infoCount = EmpJobfairInfo.dao.getEmpJobfairInfoCount();
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 10 == 0) {
            pageCount = infoCount / 10;
        } else {
            pageCount = infoCount / 10 + 1;
        }
        setAttr("infoList", EmpJobfairInfo.dao.getAllEmpJodFairInfoList(currentPage, 10));
        setAttr("currentColumnName", "大型招聘会");
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/jobfairList.jsp");
    }

    /**
     * 生源信息列表
     */
    public void studentsInfo(){
        String typeId = getPara(0);
        String typeName;
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara(1) != null) {
            currentPage = getParaToInt(1);
        }
        //信息条数
        int infoCount = EmpStudentsInfo.dao.getStudentInfoCount(typeId);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 10 == 0) {
            pageCount = infoCount / 10;
        } else {
            pageCount = infoCount / 10 + 1;
        }

        switch (typeId){
            case "1":
                typeName = "本科生生源信息";
                break;
            case "2":
                typeName = "硕士生生源信息";
                break;
            case "3":
                typeName = "博士生生源信息";
                break;
            case "4":
                typeName = "国家政策";
                break;
            case "5":
                typeName = "学校政策";
                break;
            default:
                typeName = "本科生生源信息";
                break;
        }
        setAttr("studentsInfoList", EmpStudentsInfo.dao.getStudentsInfoList(currentPage, 10, typeId));
        setAttr("currentColumnName", typeName);
        setAttr("typeId", typeId);
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/studentsInfoList.jsp");
    }

    /**
     * 生源信息详情界面
     */
    public void studentsInfoDetail(){
        String id = getPara(0);
        EmpStudentsInfo info = EmpStudentsInfo.dao.getStudentsInfo(id);
        String typeName;
        switch (info.getStr("empType")){
            case "1":
                typeName = "本科生生源信息";
                break;
            case "2":
                typeName = "硕士生生源信息";
                break;
            case "3":
                typeName = "博士生生源信息";
                break;
            case "4":
                typeName = "国家政策";
                break;
            case "5":
                typeName = "学校政策";
                break;
            default:
                typeName = "本科生生源信息";
                break;
        }
        setAttr("studentsInfo", info);
        setAttr("currentColumnName",typeName);
        renderFreeMarker("/studentsInfoContent.jsp");
    }
}
