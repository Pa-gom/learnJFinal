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
public class EmpStudentMarryIndex extends Model<EmpStudentMarryIndex> {
    public static final EmpStudentMarryIndex dao = new EmpStudentMarryIndex();

    /**
     * 返回婚姻状态列表
     *
     * @return
     */
    public List<EmpStudentMarryIndex> getMarryList() {
        return dao.find("select * from emp_student_marry_index");
    }

}
