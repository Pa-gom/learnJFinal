package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.StudentBaseInfoBean;
import net.evecom.college.framework.model.EmpProfessionIndex;
import net.evecom.college.framework.model.EmpRecruitInfo;
import net.evecom.college.framework.model.EmpStudentBaseInfo;
import net.evecom.college.framework.model.User;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class StudentInfoController extends Controller {

    /**
     * 初始化首页的数据
     */
    public void index(){
        renderFreeMarker("/admin/index.jsp");
    }


    /**
     * 学生基本信息
     */
    public void baseInfo() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        String college = getPara("college");
        String profession = getPara("profession");
        String grade = getPara("grade");
        String stuNum = getPara("stuNum");
        String sex = getPara("sex");
        String stuName = getPara("stuName");
        String level = getPara("level");
        System.out.print(college + profession + grade + stuNum + sex + stuName + level + "dsfds" + getPara(0));
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpStudentBaseInfo.dao.getStudentCount(new StudentBaseInfoBean(stuNum, stuName, sex, grade, college, profession, level));
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("collegeList", EmpProfessionIndex.dao.getCollegeList());
        setAttr("studentList", EmpStudentBaseInfo.dao.getStudentList(currentPage, 30, new StudentBaseInfoBean(stuName, stuName, sex, grade, college, profession, level)));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/studentBaseInfo.jsp");
    }

    /**
     * Json请求，根据学院返回专业列表
     */
    public void professionJson() {
        String college = getPara("college");
        setAttr("professionList", EmpProfessionIndex.dao.getProfessionListByCollegeName(college));
        renderJson();
    }

    /**
     * Json请求，根据条件返回学生信息列表
     */
    public void baseInfoListJson() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        String college = getPara("college");
        String profession = getPara("profession");
        String grade = getPara("grade");
        String stuNum = getPara("stuNum");
        String sex = getPara("sex");
        String stuName = getPara("stuName");
        String level = getPara("level");
        System.out.print(college + profession + grade + stuNum + sex + stuName + level + "dsfds" + getPara(0));
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpStudentBaseInfo.dao.getStudentCount(new StudentBaseInfoBean(stuNum, stuName, sex, grade, college, profession, level));
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("studentList", EmpStudentBaseInfo.dao.getStudentList(currentPage, 30, new StudentBaseInfoBean(stuNum, stuName, sex, grade, college, profession, level)).getList());
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderJson();
    }
}
