package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_minority_index", schema = "fzujob", catalog = "")
public class EmpMinorityIndex {
    private int empMinorityNo;
    private String empMinorityName;

    @Basic
    @Column(name = "empMinorityNo")
    public int getEmpMinorityNo() {
        return empMinorityNo;
    }

    public void setEmpMinorityNo(int empMinorityNo) {
        this.empMinorityNo = empMinorityNo;
    }

    @Basic
    @Column(name = "empMinorityName")
    public String getEmpMinorityName() {
        return empMinorityName;
    }

    public void setEmpMinorityName(String empMinorityName) {
        this.empMinorityName = empMinorityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpMinorityIndex that = (EmpMinorityIndex) o;

        if (empMinorityNo != that.empMinorityNo) return false;
        if (empMinorityName != null ? !empMinorityName.equals(that.empMinorityName) : that.empMinorityName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empMinorityNo;
        result = 31 * result + (empMinorityName != null ? empMinorityName.hashCode() : 0);
        return result;
    }
}
