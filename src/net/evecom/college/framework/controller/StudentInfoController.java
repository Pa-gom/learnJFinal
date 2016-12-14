package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.StudentBaseInfoBean;
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
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpStudentBaseInfo.dao.getStudentCount(new StudentBaseInfoBean());
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("studentList", EmpStudentBaseInfo.dao.getStudentList(currentPage, 30, new StudentBaseInfoBean()));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/studentBaseInfo.jsp");
    }


}
