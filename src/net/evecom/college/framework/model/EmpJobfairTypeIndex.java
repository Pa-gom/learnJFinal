package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_jobfair_type_index", schema = "fzujob", catalog = "")
public class EmpJobfairTypeIndex {
    private int empJobFairTypeNo;
    private String empJobFairTypeName;

    @Basic
    @Column(name = "empJobFairTypeNo")
    public int getEmpJobFairTypeNo() {
        return empJobFairTypeNo;
    }

    public void setEmpJobFairTypeNo(int empJobFairTypeNo) {
        this.empJobFairTypeNo = empJobFairTypeNo;
    }

    @Basic
    @Column(name = "empJobFairTypeName")
    public String getEmpJobFairTypeName() {
        return empJobFairTypeName;
    }

    public void setEmpJobFairTypeName(String empJobFairTypeName) {
        this.empJobFairTypeName = empJobFairTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpJobfairTypeIndex that = (EmpJobfairTypeIndex) o;

        if (empJobFairTypeNo != that.empJobFairTypeNo) return false;
        if (empJobFairTypeName != null ? !empJobFairTypeName.equals(that.empJobFairTypeName) : that.empJobFairTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empJobFairTypeNo;
        result = 31 * result + (empJobFairTypeName != null ? empJobFairTypeName.hashCode() : 0);
        return result;
    }
}
