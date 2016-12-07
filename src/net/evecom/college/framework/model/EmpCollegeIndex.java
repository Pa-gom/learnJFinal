package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_college_index", schema = "fzujob", catalog = "")
public class EmpCollegeIndex extends Model<EmpCollegeIndex>{
    private int empCollegeNo;
    private String emCollegeName;

    @Basic
    @Column(name = "empCollegeNo")
    public int getEmpCollegeNo() {
        return empCollegeNo;
    }

    public void setEmpCollegeNo(int empCollegeNo) {
        this.empCollegeNo = empCollegeNo;
    }

    @Basic
    @Column(name = "emCollegeName")
    public String getEmCollegeName() {
        return emCollegeName;
    }

    public void setEmCollegeName(String emCollegeName) {
        this.emCollegeName = emCollegeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpCollegeIndex that = (EmpCollegeIndex) o;

        if (empCollegeNo != that.empCollegeNo) return false;
        if (emCollegeName != null ? !emCollegeName.equals(that.emCollegeName) : that.emCollegeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empCollegeNo;
        result = 31 * result + (emCollegeName != null ? emCollegeName.hashCode() : 0);
        return result;
    }
}
