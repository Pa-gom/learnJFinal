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

public class EmpMinorityIndex extends Model<EmpMinorityIndex> {
    public static final EmpMinorityIndex dao = new EmpMinorityIndex();

    /**
     * 获得全部民族列表
     *
     * @return
     */
    public List<EmpMinorityIndex> getMinorityList() {
        return dao.find("select * from emp_minority_index");
    }
}
