package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import net.evecom.college.framework.bean.ContractInfoBean;
import net.evecom.college.framework.model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Ezreal on 2016/12/26.
 */
public class ContractInfoController extends Controller {

    static String college = "";
    static String profession = "";
    static String grade = "";
    static String stuNum = "";
    static String sex = "";
    static String stuName = "";

    public void index() {
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
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //签约协议信息条数
        int infoCount = EmpContractInfo.dao.getContractCount(new ContractInfoBean(stuNum, stuName, sex, grade, college, profession));
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("collegeList", EmpProfessionIndex.dao.getCollegeList());
        setAttr("infoList", EmpContractInfo.dao.getContractList(currentPage, 30, new ContractInfoBean(stuNum, stuName, sex, grade, college, profession)));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        setAttr("college", college);
        setAttr("profession", profession);
        setAttr("grade", grade);
        setAttr("stuNum", stuNum);
        setAttr("sex", sex);
        setAttr("stuName", stuName);
        renderFreeMarker("/admin/contract/contractInfo.jsp");
    }


    public void delete() {
        String stuNo = getPara("contractNo");
        List<EmpContractInfo> list = EmpContractInfo.dao.find("select * from emp_contract_info where empContractNo ='" + stuNo + "'");
        if (list.size() > 0) {
            EmpContractInfo.dao.deleteById(list.get(0).getInt("empContractNo"));
            setAttr("resultCode", "0");//删除成功
        } else {
            setAttr("resultCode", "1");//删除失败
        }

        renderJson();
    }

    public void deleteList() {
        String[] noList = getPara("contractNo").split(",");
        for (int i = 0; i < noList.length; i++) {
            List<EmpContractInfo> list = EmpContractInfo.dao.find("select * from emp_contract_info where empContractNo ='" + noList[i] + "'");
            if (list.size() > 0) {
                EmpContractInfo.dao.deleteById(list.get(0).getInt("empContractNo"));
                setAttr("resultCode", "0");//删除成功
            } else {
                setAttr("resultCode", "1");//删除失败
            }
        }
        renderJson();
    }

    /**
     * 打开添加框
     */
    public void addDialog() {
        Calendar a = Calendar.getInstance();
        int currentYear = a.get(Calendar.YEAR);//得到年
        ArrayList<Integer> gradeList = new ArrayList<>();
        for (int i = -5; i < 5; i++) {
            gradeList.add(currentYear + i);
        }
        setAttr("gradeList", gradeList);
        setAttr("compangTypeList", EmpCompanyTypeIndex.dao.getCompanyTypeList());
        setAttr("industryList", EmpIndustryIndex.dao.getIndustryList());
        setAttr("collegeList", EmpProfessionIndex.dao.getCollegeList());
        setAttr("minorityList", EmpMinorityIndex.dao.getMinorityList());
        setAttr("marryList", EmpStudentMarryIndex.dao.getMarryList());
        setAttr("provinceList", EmpAddress.dao.getProvinceList());
        setAttr("politicalList", EmpPoliticalStatusIndex.dao.getPoliticalList());
        setAttr("examTypeList", EmpExamTypeIndex.dao.getExamTypeList());
        setAttr("entryTypeList", EmpEntryTypeIndex.dao.getEntryTypeList());
        setAttr("levelList", EmpDevelopLevel.dao.getLevelList());
        renderFreeMarker("/admin/dialog/dialogAddContract.jsp");
    }


    /**
     * 打开修改框
     */
    public void modifyDialog() {
        Calendar a = Calendar.getInstance();
        int currentYear = a.get(Calendar.YEAR);//得到年
        ArrayList<Integer> gradeList = new ArrayList<>();
        EmpContractInfo info = EmpContractInfo.dao.findById(getPara(0));
        String province = info.getStr("empCompanyJobAddress").split(",")[0];
        String city = info.getStr("empCompanyJobAddress").split(",")[1];
        for (int i = -5; i < 5; i++) {
            gradeList.add(currentYear + i);
        }
        setAttr("gradeList", gradeList);
        setAttr("contract", info);
        setAttr("province", province);
        setAttr("city", city);
        setAttr("compangTypeList", EmpCompanyTypeIndex.dao.getCompanyTypeList());
        setAttr("industryList", EmpIndustryIndex.dao.getIndustryList());
        setAttr("collegeList", EmpProfessionIndex.dao.getCollegeList());
        setAttr("minorityList", EmpMinorityIndex.dao.getMinorityList());
        setAttr("marryList", EmpStudentMarryIndex.dao.getMarryList());
        setAttr("provinceList", EmpAddress.dao.getProvinceList());
        setAttr("politicalList", EmpPoliticalStatusIndex.dao.getPoliticalList());
        setAttr("examTypeList", EmpExamTypeIndex.dao.getExamTypeList());
        setAttr("entryTypeList", EmpEntryTypeIndex.dao.getEntryTypeList());
        setAttr("levelList", EmpDevelopLevel.dao.getLevelList());
        renderFreeMarker("/admin/dialog/dialogModifyContract.jsp");
    }

    public void save() {
        String result = "0";
        EmpContractInfo base = getModel(EmpContractInfo.class, "contract");
        if (EmpContractInfo.dao.find("select * from emp_contract_info where empContractNo ='" + base.getStr("empContractNo") + "'").size() > 0) {
            result = "1";//协议已存在
        } else if (EmpContractInfo.dao.find("select * from emp_contract_info where empContractStudentIdCode ='" + base.getStr("empContractStudentIdCode") + "'").size() > 0) {
            result = "2";//身份证号已存在
        } else {
            base.save();
        }
        setAttr("saveResult", result);
        renderJson();
    }

    public void update() {
        EmpContractInfo base = getModel(EmpContractInfo.class, "contract");
        base.update();
        setAttr("saveResult", 0);
        renderJson();
    }
}
