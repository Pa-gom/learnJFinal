package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_company_state_index", schema = "fzujob", catalog = "")
public class EmpCompanyStateIndex {
    private int empCompanyStateNo;
    private String empCompanyStateName;

    @Basic
    @Column(name = "empCompanyStateNo")
    public int getEmpCompanyStateNo() {
        return empCompanyStateNo;
    }

    public void setEmpCompanyStateNo(int empCompanyStateNo) {
        this.empCompanyStateNo = empCompanyStateNo;
    }

    @Basic
    @Column(name = "empCompanyStateName")
    public String getEmpCompanyStateName() {
        return empCompanyStateName;
    }

    public void setEmpCompanyStateName(String empCompanyStateName) {
        this.empCompanyStateName = empCompanyStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpCompanyStateIndex that = (EmpCompanyStateIndex) o;

        if (empCompanyStateNo != that.empCompanyStateNo) return false;
        if (empCompanyStateName != null ? !empCompanyStateName.equals(that.empCompanyStateName) : that.empCompanyStateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empCompanyStateNo;
        result = 31 * result + (empCompanyStateName != null ? empCompanyStateName.hashCode() : 0);
        return result;
    }
}
