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

public class EmpPoliticalStatusIndex extends Model<EmpPoliticalStatusIndex> {
    public static final EmpPoliticalStatusIndex dao = new EmpPoliticalStatusIndex();

    public List<EmpPoliticalStatusIndex> getPoliticalList() {
        return dao.find("select * from emp_political_status_index");
    }
}
