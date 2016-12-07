package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_political_status_index", schema = "fzujob", catalog = "")
public class EmpPoliticalStatusIndex {
    private int empPoliticalStatusNo;
    private String empPoliticalStatusName;

    @Basic
    @Column(name = "empPoliticalStatusNo")
    public int getEmpPoliticalStatusNo() {
        return empPoliticalStatusNo;
    }

    public void setEmpPoliticalStatusNo(int empPoliticalStatusNo) {
        this.empPoliticalStatusNo = empPoliticalStatusNo;
    }

    @Basic
    @Column(name = "empPoliticalStatusName")
    public String getEmpPoliticalStatusName() {
        return empPoliticalStatusName;
    }

    public void setEmpPoliticalStatusName(String empPoliticalStatusName) {
        this.empPoliticalStatusName = empPoliticalStatusName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpPoliticalStatusIndex that = (EmpPoliticalStatusIndex) o;

        if (empPoliticalStatusNo != that.empPoliticalStatusNo) return false;
        if (empPoliticalStatusName != null ? !empPoliticalStatusName.equals(that.empPoliticalStatusName) : that.empPoliticalStatusName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empPoliticalStatusNo;
        result = 31 * result + (empPoliticalStatusName != null ? empPoliticalStatusName.hashCode() : 0);
        return result;
    }
}
