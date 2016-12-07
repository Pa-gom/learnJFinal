package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_profession_index", schema = "fzujob", catalog = "")
public class EmpProfessionIndex {
    private int empProfessionNo;
    private String empProfessionName;

    @Basic
    @Column(name = "empProfessionNo")
    public int getEmpProfessionNo() {
        return empProfessionNo;
    }

    public void setEmpProfessionNo(int empProfessionNo) {
        this.empProfessionNo = empProfessionNo;
    }

    @Basic
    @Column(name = "empProfessionName")
    public String getEmpProfessionName() {
        return empProfessionName;
    }

    public void setEmpProfessionName(String empProfessionName) {
        this.empProfessionName = empProfessionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpProfessionIndex that = (EmpProfessionIndex) o;

        if (empProfessionNo != that.empProfessionNo) return false;
        if (empProfessionName != null ? !empProfessionName.equals(that.empProfessionName) : that.empProfessionName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empProfessionNo;
        result = 31 * result + (empProfessionName != null ? empProfessionName.hashCode() : 0);
        return result;
    }
}
