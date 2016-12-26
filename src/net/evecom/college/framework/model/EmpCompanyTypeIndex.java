package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Ezreal on 2016/12/7.
 */

public class EmpCompanyTypeIndex extends Model<EmpCompanyTypeIndex> {
    public static final EmpCompanyTypeIndex dao = new EmpCompanyTypeIndex();


    /**
     * 获取企业类别列表
     */
    public List<EmpCompanyTypeIndex> getCompanyTypeList() {
        return dao.find("select * from emp_company_type_index");
    }

}
