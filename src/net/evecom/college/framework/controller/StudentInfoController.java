package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.StudentBaseInfoBean;
import net.evecom.college.framework.model.*;

import java.util.List;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class StudentInfoController extends Controller {

    static String college = "";
    static String profession = "";
    static String grade = "";
    static String stuNum = "";
    static String sex = "";
    static String stuName = "";
    static String level = "";

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
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }

        college = getPara("college") == null ? college : getPara("college");
        profession = getPara("profession") == null ? profession : getPara("profession");
        grade = getPara("grade") == null ? grade : getPara("grade");
        stuNum = getPara("stuNum") == null ? stuNum : getPara("stuNum");
        sex = getPara("sex") == null ? sex : getPara("sex");
        stuName = getPara("stuName") == null ? stuName : getPara("stuName");
        level = getPara("level") == null ? level : getPara("level");
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
        setAttr("studentList", EmpStudentBaseInfo.dao.getStudentList(currentPage, 30, new StudentBaseInfoBean(stuNum, stuName, sex, grade, college, profession, level)));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        setAttr("college", college);
        setAttr("profession", profession);
        setAttr("grade", grade);
        setAttr("stuNum", stuNum);
        setAttr("sex", sex);
        setAttr("stuName", stuName);
        setAttr("level", level);
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
        setAttr("infoCount", infoCount);
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderJson();
    }

    /**
     * 打开添加框
     */
    public void addDialog() {
        setAttr("collegeList", EmpProfessionIndex.dao.getCollegeList());
        setAttr("minorityList", EmpMinorityIndex.dao.getMinorityList());
        setAttr("marryList", EmpStudentMarryIndex.dao.getMarryList());
        setAttr("provinceList", EmpAddress.dao.getProvinceList());
        setAttr("politicalList", EmpPoliticalStatusIndex.dao.getPoliticalList());
        setAttr("examTypeList", EmpExamTypeIndex.dao.getExamTypeList());
        setAttr("entryTypeList", EmpEntryTypeIndex.dao.getEntryTypeList());
        setAttr("levelList", EmpDevelopLevel.dao.getLevelList());
        renderFreeMarker("/admin/dialog/dialogAddStudentBase.jsp");
    }

    /**
     * 打开修改框
     */
    public void modifyDialog() {
        List<EmpStudentBaseInfo> list = EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentNo ='" + getPara(0) + "'");
        EmpStudentBaseInfo info = EmpStudentBaseInfo.dao.findById(list.get(0).getInt("empStudentQueue"));
        setAttr("collegeList", EmpProfessionIndex.dao.getCollegeList());
        setAttr("minorityList", EmpMinorityIndex.dao.getMinorityList());
        setAttr("marryList", EmpStudentMarryIndex.dao.getMarryList());
        setAttr("provinceList", EmpAddress.dao.getProvinceList());
        setAttr("politicalList", EmpPoliticalStatusIndex.dao.getPoliticalList());
        setAttr("examTypeList", EmpExamTypeIndex.dao.getExamTypeList());
        setAttr("entryTypeList", EmpEntryTypeIndex.dao.getEntryTypeList());
        setAttr("levelList", EmpDevelopLevel.dao.getLevelList());
        setAttr("info", info);
        renderFreeMarker("/admin/dialog/dialogModifyStudentBase.jsp");
    }

    /**
     * 保存学生信息
     */
    public void save() {
        String result = "0";
        EmpStudentBaseInfo base = getModel(EmpStudentBaseInfo.class, "stu");
        if (EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentNo ='" + base.getStr("empStudentNo") + "'").size() > 0) {
            result = "1";//学号已存在
        } else if (EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentIdNo ='" + base.getStr("empStudentIdNo") + "'").size() > 0) {
            result = "2";//身份证号已存在
        } else {
            base.save();
        }
        setAttr("saveResult", result);
        renderJson();
    }

    /**
     * 根据传入的省份获取地级市列表
     */
    public void cityJson() {
        setAttr("cityList", EmpAddress.dao.getCityList(getPara("province")));
        renderJson();
    }

    public void delete() {
        String stuNo = getPara("stuNo");
        StudentBaseInfoBean bean = new StudentBaseInfoBean();
        bean.setStuNo(stuNo);
        List<EmpStudentBaseInfo> list = EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentNo ='" + stuNo + "'");
        if (list.size() > 0) {
            EmpStudentBaseInfo.dao.deleteById(list.get(0).getInt("empStudentQueue"));
            setAttr("resultCode", "0");//删除成功
        } else {
            setAttr("resultCode", "1");//删除失败
        }

        renderJson();
    }

    public void deleteList() {
        String[] stuNoList = getPara("stuNo").split(",");
        StudentBaseInfoBean bean;
        for (int i = 0; i < stuNoList.length; i++) {
            bean = new StudentBaseInfoBean();
            bean.setStuNo(stuNoList[i]);
            List<EmpStudentBaseInfo> list = EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentNo ='" + stuNoList[i] + "'");
            if (list.size() > 0) {
                EmpStudentBaseInfo.dao.deleteById(list.get(0).getInt("empStudentQueue"));
                setAttr("resultCode", "0");//删除成功
            } else {
                setAttr("resultCode", "1");//删除失败
            }
        }
        renderJson();
    }
}
