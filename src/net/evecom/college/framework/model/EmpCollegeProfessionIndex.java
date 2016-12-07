package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_college_profession_index", schema = "fzujob", catalog = "")
public class EmpCollegeProfessionIndex {
    private int empProfessionNo;
    private Integer empCollegeNo;

    @Basic
    @Column(name = "empProfessionNo")
    public int getEmpProfessionNo() {
        return empProfessionNo;
    }

    public void setEmpProfessionNo(int empProfessionNo) {
        this.empProfessionNo = empProfessionNo;
    }

    @Basic
    @Column(name = "empCollegeNo")
    public Integer getEmpCollegeNo() {
        return empCollegeNo;
    }

    public void setEmpCollegeNo(Integer empCollegeNo) {
        this.empCollegeNo = empCollegeNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpCollegeProfessionIndex that = (EmpCollegeProfessionIndex) o;

        if (empProfessionNo != that.empProfessionNo) return false;
        if (empCollegeNo != null ? !empCollegeNo.equals(that.empCollegeNo) : that.empCollegeNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empProfessionNo;
        result = 31 * result + (empCollegeNo != null ? empCollegeNo.hashCode() : 0);
        return result;
    }
}
