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

public class EmpExamTypeIndex extends Model<EmpExamTypeIndex> {
    public static final EmpExamTypeIndex dao = new EmpExamTypeIndex();

    public List<EmpExamTypeIndex> getExamTypeList() {
        return dao.find("select * from emp_exam_type_index");
    }
}
