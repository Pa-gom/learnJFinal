package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_company_credit_index", schema = "fzujob", catalog = "")
public class EmpCompanyCreditIndex {
    private int empCompanyCreditNo;
    private String empCompanyCreditName;

    @Basic
    @Column(name = "empCompanyCreditNo")
    public int getEmpCompanyCreditNo() {
        return empCompanyCreditNo;
    }

    public void setEmpCompanyCreditNo(int empCompanyCreditNo) {
        this.empCompanyCreditNo = empCompanyCreditNo;
    }

    @Basic
    @Column(name = "empCompanyCreditName")
    public String getEmpCompanyCreditName() {
        return empCompanyCreditName;
    }

    public void setEmpCompanyCreditName(String empCompanyCreditName) {
        this.empCompanyCreditName = empCompanyCreditName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpCompanyCreditIndex that = (EmpCompanyCreditIndex) o;

        if (empCompanyCreditNo != that.empCompanyCreditNo) return false;
        if (empCompanyCreditName != null ? !empCompanyCreditName.equals(that.empCompanyCreditName) : that.empCompanyCreditName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empCompanyCreditNo;
        result = 31 * result + (empCompanyCreditName != null ? empCompanyCreditName.hashCode() : 0);
        return result;
    }
}
