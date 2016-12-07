package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_student_marry_index", schema = "fzujob", catalog = "")
public class EmpStudentMarryIndex {
    private int empStudentMarryNo;
    private String empStudentMarryName;

    @Basic
    @Column(name = "empStudentMarryNo")
    public int getEmpStudentMarryNo() {
        return empStudentMarryNo;
    }

    public void setEmpStudentMarryNo(int empStudentMarryNo) {
        this.empStudentMarryNo = empStudentMarryNo;
    }

    @Basic
    @Column(name = "empStudentMarryName")
    public String getEmpStudentMarryName() {
        return empStudentMarryName;
    }

    public void setEmpStudentMarryName(String empStudentMarryName) {
        this.empStudentMarryName = empStudentMarryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpStudentMarryIndex that = (EmpStudentMarryIndex) o;

        if (empStudentMarryNo != that.empStudentMarryNo) return false;
        if (empStudentMarryName != null ? !empStudentMarryName.equals(that.empStudentMarryName) : that.empStudentMarryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empStudentMarryNo;
        result = 31 * result + (empStudentMarryName != null ? empStudentMarryName.hashCode() : 0);
        return result;
    }
}
