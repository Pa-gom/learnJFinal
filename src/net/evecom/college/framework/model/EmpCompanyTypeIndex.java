package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_company_type_index", schema = "fzujob", catalog = "")
public class EmpCompanyTypeIndex {
    private int empCompanyTypeNo;
    private String empCompanyTypeName;

    @Basic
    @Column(name = "empCompanyTypeNo")
    public int getEmpCompanyTypeNo() {
        return empCompanyTypeNo;
    }

    public void setEmpCompanyTypeNo(int empCompanyTypeNo) {
        this.empCompanyTypeNo = empCompanyTypeNo;
    }

    @Basic
    @Column(name = "empCompanyTypeName")
    public String getEmpCompanyTypeName() {
        return empCompanyTypeName;
    }

    public void setEmpCompanyTypeName(String empCompanyTypeName) {
        this.empCompanyTypeName = empCompanyTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpCompanyTypeIndex that = (EmpCompanyTypeIndex) o;

        if (empCompanyTypeNo != that.empCompanyTypeNo) return false;
        if (empCompanyTypeName != null ? !empCompanyTypeName.equals(that.empCompanyTypeName) : that.empCompanyTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empCompanyTypeNo;
        result = 31 * result + (empCompanyTypeName != null ? empCompanyTypeName.hashCode() : 0);
        return result;
    }
}
