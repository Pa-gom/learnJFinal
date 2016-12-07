package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_jobfair_state_index", schema = "fzujob", catalog = "")
public class EmpJobfairStateIndex {
    private int empJobFairStateNo;
    private String empJobFairStateName;

    @Basic
    @Column(name = "empJobFairStateNo")
    public int getEmpJobFairStateNo() {
        return empJobFairStateNo;
    }

    public void setEmpJobFairStateNo(int empJobFairStateNo) {
        this.empJobFairStateNo = empJobFairStateNo;
    }

    @Basic
    @Column(name = "empJobFairStateName")
    public String getEmpJobFairStateName() {
        return empJobFairStateName;
    }

    public void setEmpJobFairStateName(String empJobFairStateName) {
        this.empJobFairStateName = empJobFairStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpJobfairStateIndex that = (EmpJobfairStateIndex) o;

        if (empJobFairStateNo != that.empJobFairStateNo) return false;
        if (empJobFairStateName != null ? !empJobFairStateName.equals(that.empJobFairStateName) : that.empJobFairStateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empJobFairStateNo;
        result = 31 * result + (empJobFairStateName != null ? empJobFairStateName.hashCode() : 0);
        return result;
    }
}
