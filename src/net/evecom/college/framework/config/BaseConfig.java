package net.evecom.college.framework.config;

import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import net.evecom.college.framework.controller.*;
import net.evecom.college.framework.mobileController.Login;
import net.evecom.college.framework.mobileController.MobileRecruitInfo;
import net.evecom.college.framework.model.*;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class BaseConfig extends JFinalConfig{
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setEncoding("utf-8");
        me.setViewType(ViewType.JSP);
        //me.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/",IndexController.class);
        me.add("/student", StudentInfoController.class);
        me.add("/contract", ContractInfoController.class);
        me.add("/recruit", RecruitInfoController.class);
        me.add("/uncheckRecruit", UncheckRecruitInfoController.class);
        me.add("/mobile", Login.class);
        me.add("/mRecruit", MobileRecruitInfo.class);
        //me.add(new FrontRoutes());
    }

    @Override
    public void configPlugin(Plugins me) {
        loadPropertyFile("a_little_config.txt");
        C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"),  getProperty("user"), getProperty("password"));
        me.add(c3p0Plugin);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
        me.add(arp);
        arp.addMapping("emp_college_index","empCollegeNo", User.class);
        arp.addMapping("emp_recruit_info", "empRecruitNo", EmpRecruitInfo.class);
        arp.addMapping("emp_recruit_type_index","empRecruitTypeNo", EmpRecruitTypeIndex.class);
        arp.addMapping("emp_jobfair_info","empJobFairNo", EmpJobfairInfo.class);
        arp.addMapping("emp_jobfair_type_index","empJobFairTypeNo", EmpJobfairTypeIndex.class);
        arp.addMapping("emp_students_info",EmpStudentsInfo.class);
        arp.addMapping("emp_download_info", EmpDownloadInfo.class);
        arp.addMapping("emp_student_base_info", "empStudentQueue", EmpStudentBaseInfo.class);
        arp.addMapping("emp_profession_index", EmpProfessionIndex.class);
        arp.addMapping("emp_minority_index", "empMinorityNo", EmpMinorityIndex.class);
        arp.addMapping("emp_student_marry_index", "empStudentMarryNo", EmpStudentMarryIndex.class);
        arp.addMapping("emp_address", EmpAddress.class);
        arp.addMapping("emp_entry_type_index", "empEntryTypeNo", EmpEntryTypeIndex.class);
        arp.addMapping("emp_exam_type_index", "empExamTypeNo", EmpExamTypeIndex.class);
        arp.addMapping("emp_political_status_index", "empPoliticalStatusNo", EmpPoliticalStatusIndex.class);
        arp.addMapping("emp_develop_level", EmpDevelopLevel.class);
        arp.addMapping("emp_contract_info", "empContractNo", EmpContractInfo.class);
        arp.addMapping("emp_industry_index", "empIndustryNo", EmpIndustryIndex.class);
        arp.addMapping("emp_company_type_index", "empCompanyTypeNo", EmpCompanyTypeIndex.class);
        arp.addMapping("emp_stuff_info", "empStuffNo", EmpStuffInfo.class);

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("basePath"));
    }
}
