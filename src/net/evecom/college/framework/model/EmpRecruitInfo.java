package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * Created by Ezreal on 2016/12/7.
 */
public class EmpRecruitInfo extends Model<EmpRecruitInfo> {
    public static final EmpRecruitInfo dao = new EmpRecruitInfo();

    public Page<EmpRecruitInfo> getEmpRecruitInfoList(int pageNum, int pageSize){
        return paginate(pageNum,pageSize,"select *","from emp_recruit_info where empRecruitType = 1 and empRecruitState = 1 order by empRecruitNo desc");
    }
}
