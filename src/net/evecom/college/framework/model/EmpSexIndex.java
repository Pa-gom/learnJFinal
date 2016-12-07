package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_sex_index", schema = "fzujob", catalog = "")
public class EmpSexIndex {
    private int empSexNo;
    private String empSexName;

    @Basic
    @Column(name = "empSexNo")
    public int getEmpSexNo() {
        return empSexNo;
    }

    public void setEmpSexNo(int empSexNo) {
        this.empSexNo = empSexNo;
    }

    @Basic
    @Column(name = "empSexName")
    public String getEmpSexName() {
        return empSexName;
    }

    public void setEmpSexName(String empSexName) {
        this.empSexName = empSexName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpSexIndex that = (EmpSexIndex) o;

        if (empSexNo != that.empSexNo) return false;
        if (empSexName != null ? !empSexName.equals(that.empSexName) : that.empSexName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empSexNo;
        result = 31 * result + (empSexName != null ? empSexName.hashCode() : 0);
        return result;
    }
}
