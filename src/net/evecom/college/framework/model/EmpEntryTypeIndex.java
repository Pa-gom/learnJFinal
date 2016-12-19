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
public class EmpEntryTypeIndex extends Model<EmpEntryTypeIndex> {
    public static final EmpEntryTypeIndex dao = new EmpEntryTypeIndex();

    public List<EmpEntryTypeIndex> getEntryTypeList() {
        return dao.find("select * from emp_entry_type_index");
    }
}
