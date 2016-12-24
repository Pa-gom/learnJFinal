package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import net.evecom.college.framework.model.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Ezreal on 2016/12/20.
 */
public class RecruitInfoController extends Controller {


    /**
     * 校园招聘
     */
    public void school() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getEmpRecruitInfoCount(1);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 30, 1));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/schoolRecruitInfo.jsp");
    }

    /**
     * 实习招聘
     */
    public void practice() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getEmpRecruitInfoCount(2);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 30, 2));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/practiceRecruitInfo.jsp");
    }

    /**
     * 网络招聘
     */
    public void network() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getEmpRecruitInfoCount(3);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 30, 3));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/networkRecruitInfo.jsp");
    }

    /**
     * 通知公告
     */
    public void notice() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getEmpRecruitInfoCount(4);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 30, 4));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/noticeRecruitInfo.jsp");
    }


    /**
     * 驳回信息查看
     */
    public void refuse() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getRefuseRecruitInfoCount();
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getRefuseRecruitInfoList(currentPage, 30));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/refuseRecruitInfo.jsp");
    }


    public void delete() {
        String recruitNo = getPara("recruitNo");
        EmpRecruitInfo.dao.deleteById(recruitNo);
        setAttr("resultCode", "0");
        renderJson();
    }

    public void deleteList() {
        String[] recruitNoList = getPara("recruitNo").split(",");
        for (int i = 0; i < recruitNoList.length; i++) {
            EmpRecruitInfo.dao.deleteById(recruitNoList[i]);
        }
        setAttr("resultCode", "0");//删除成功
        renderJson();
    }

    /**
     * 打开添加框
     */
    public void addDialog() {
        int typeId = getParaToInt(0);
        switch (typeId) {
            case 1:
                setAttr("type", "校园招聘");
                break;
            case 2:
                setAttr("type", "实习招聘");
                break;
            case 3:
                setAttr("type", "网络招聘");
                break;
            case 4:
                setAttr("type", "通知公告");
                break;
            default:
                break;
        }
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();//日历对象
        calendar.setTime(date);//设置当前日期

        calendar.add(Calendar.DATE, 1);//日期加一
        setAttr("minDate", format.format(calendar.getTime()));


        calendar.setTime(date);//设置当前日期
        calendar.add(Calendar.MONTH, 1);//月份加一
        setAttr("maxDate", format.format(calendar.getTime()));

        setAttr("typeId", typeId);
        if (typeId == 4) {
            renderFreeMarker("/admin/dialog/dialogAddNoticeInfo.jsp");
        } else {
            renderFreeMarker("/admin/dialog/dialogAddRecruitInfo.jsp");
        }
    }

    /**
     * 打开修改框
     */
    public void modifyDialog() {
        int typeId = getParaToInt(0);
        List<EmpRecruitInfo> list = EmpRecruitInfo.dao.find("select * from emp_recruit_info where empRecruitNo ='" + getPara(1) + "'");
        EmpRecruitInfo info = EmpRecruitInfo.dao.findById(list.get(0).getInt("empRecruitNo"));
        switch (typeId) {
            case 1:
                setAttr("type", "校园招聘");
                break;
            case 2:
                setAttr("type", "实习招聘");
                break;
            case 3:
                setAttr("type", "网络招聘");
                break;
            case 4:
                setAttr("type", "通知公告");
                break;
            default:
                break;
        }
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();//日历对象
        calendar.setTime(date);//设置当前日期

        calendar.add(Calendar.DATE, 1);//日期加一
        setAttr("minDate", format.format(calendar.getTime()));


        calendar.setTime(date);//设置当前日期
        calendar.add(Calendar.MONTH, 1);//月份加一
        setAttr("maxDate", format.format(calendar.getTime()));
        setAttr("info", info);
        setAttr("typeId", typeId);

        if (typeId == 4) {
            renderFreeMarker("/admin/dialog/dialogModifyNoticeInfo.jsp");
        } else {
            renderFreeMarker("/admin/dialog/dialogModifyRecruitInfo.jsp");
        }
    }

    /**
     * 打开审核对话框
     */
    public void checkDialog() {
        int typeId = getParaToInt(0);
        List<EmpRecruitInfo> list = EmpRecruitInfo.dao.find("select * from emp_recruit_info where empRecruitNo ='" + getPara(1) + "'");
        EmpRecruitInfo info = EmpRecruitInfo.dao.findById(list.get(0).getInt("empRecruitNo"));
        switch (typeId) {
            case 1:
                setAttr("type", "校园招聘");
                break;
            case 2:
                setAttr("type", "实习招聘");
                break;
            case 3:
                setAttr("type", "网络招聘");
                break;
            case 4:
                setAttr("type", "通知公告");
                break;
            default:
                break;
        }
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();//日历对象
        calendar.setTime(date);//设置当前日期

        calendar.add(Calendar.DATE, 1);//日期加一
        setAttr("minDate", format.format(calendar.getTime()));


        calendar.setTime(date);//设置当前日期
        calendar.add(Calendar.MONTH, 1);//月份加一
        setAttr("maxDate", format.format(calendar.getTime()));
        setAttr("info", info);
        setAttr("typeId", typeId);

        if (typeId == 4) {
            renderFreeMarker("/admin/dialog/dialogCheckNoticeInfo.jsp");
        } else {
            renderFreeMarker("/admin/dialog/dialogCheckRecruitInfo.jsp");
        }
    }

    /**
     * 保存招聘信息
     */
    public void save() {
        String result = "0";
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        EmpRecruitInfo base = getModel(EmpRecruitInfo.class, "school");
        base.set("empRecruitPublishDateTime", time);
        base.set("empRecruitState", "1");
        base.save();
        setAttr("saveResult", result);
        renderJson();
    }

    /**
     * 修改招聘信息
     */
    public void update() {
        String result = "0";
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        EmpRecruitInfo base = getModel(EmpRecruitInfo.class, "school");
        base.set("empRecruitPublishDateTime", time);
        base.set("empRecruitState", "1");
        base.update();
        setAttr("saveResult", result);
        renderJson();
    }

    public void check() {
        String result = "0";
        EmpRecruitInfo base = getModel(EmpRecruitInfo.class, "school");

        base.update();
        setAttr("saveResult", result);
        renderJson();
    }

    public void reason() {
        renderFreeMarker("/admin/dialog/refuseReason.jsp");
    }


    /**
     * 打开审核对话框
     */
    public void getDetail() {
        int typeId = getParaToInt(0);
        List<EmpRecruitInfo> list = EmpRecruitInfo.dao.find("select * from emp_recruit_info where empRecruitNo ='" + getPara(0) + "'");
        EmpRecruitInfo info = EmpRecruitInfo.dao.findById(list.get(0).getInt("empRecruitNo"));
        switch (Integer.parseInt(info.getStr("empRecruitType"))) {
            case 1:
                setAttr("type", "校园招聘");
                break;
            case 2:
                setAttr("type", "实习招聘");
                break;
            case 3:
                setAttr("type", "网络招聘");
                break;
            case 4:
                setAttr("type", "通知公告");
                break;
            default:
                break;
        }
        setAttr("info", info);
        setAttr("typeId", typeId);
        renderFreeMarker("/admin/dialog/dialogDetailRecruitInfo.jsp");
    }
}
