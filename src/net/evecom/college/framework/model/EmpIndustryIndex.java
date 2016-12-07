package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_industry_index", schema = "fzujob", catalog = "")
public class EmpIndustryIndex {
    private int empIndustryNo;
    private String empIndustryName;

    @Basic
    @Column(name = "empIndustryNo")
    public int getEmpIndustryNo() {
        return empIndustryNo;
    }

    public void setEmpIndustryNo(int empIndustryNo) {
        this.empIndustryNo = empIndustryNo;
    }

    @Basic
    @Column(name = "empIndustryName")
    public String getEmpIndustryName() {
        return empIndustryName;
    }

    public void setEmpIndustryName(String empIndustryName) {
        this.empIndustryName = empIndustryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpIndustryIndex that = (EmpIndustryIndex) o;

        if (empIndustryNo != that.empIndustryNo) return false;
        if (empIndustryName != null ? !empIndustryName.equals(that.empIndustryName) : that.empIndustryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empIndustryNo;
        result = 31 * result + (empIndustryName != null ? empIndustryName.hashCode() : 0);
        return result;
    }
}
