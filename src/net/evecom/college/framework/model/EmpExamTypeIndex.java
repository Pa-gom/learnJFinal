package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_exam_type_index", schema = "fzujob", catalog = "")
public class EmpExamTypeIndex {
    private int empExamTypeNo;
    private String empExamTypeName;

    @Basic
    @Column(name = "empExamTypeNo")
    public int getEmpExamTypeNo() {
        return empExamTypeNo;
    }

    public void setEmpExamTypeNo(int empExamTypeNo) {
        this.empExamTypeNo = empExamTypeNo;
    }

    @Basic
    @Column(name = "empExamTypeName")
    public String getEmpExamTypeName() {
        return empExamTypeName;
    }

    public void setEmpExamTypeName(String empExamTypeName) {
        this.empExamTypeName = empExamTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpExamTypeIndex that = (EmpExamTypeIndex) o;

        if (empExamTypeNo != that.empExamTypeNo) return false;
        if (empExamTypeName != null ? !empExamTypeName.equals(that.empExamTypeName) : that.empExamTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empExamTypeNo;
        result = 31 * result + (empExamTypeName != null ? empExamTypeName.hashCode() : 0);
        return result;
    }
}
