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
public class EmpIndustryIndex extends Model<EmpIndustryIndex> {
    public static final EmpIndustryIndex dao = new EmpIndustryIndex();

    /**
     * 获取行业类别列表
     */
    public List<EmpIndustryIndex> getIndustryList() {
        return dao.find("select * from emp_industry_index");
    }
}
