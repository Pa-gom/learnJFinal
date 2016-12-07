package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_recruit_type_index", schema = "fzujob", catalog = "")
public class EmpRecruitTypeIndex {
    private int empRecruitTypeNo;
    private String empRecruitTypeName;

    @Basic
    @Column(name = "empRecruitTypeNo")
    public int getEmpRecruitTypeNo() {
        return empRecruitTypeNo;
    }

    public void setEmpRecruitTypeNo(int empRecruitTypeNo) {
        this.empRecruitTypeNo = empRecruitTypeNo;
    }

    @Basic
    @Column(name = "empRecruitTypeName")
    public String getEmpRecruitTypeName() {
        return empRecruitTypeName;
    }

    public void setEmpRecruitTypeName(String empRecruitTypeName) {
        this.empRecruitTypeName = empRecruitTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpRecruitTypeIndex that = (EmpRecruitTypeIndex) o;

        if (empRecruitTypeNo != that.empRecruitTypeNo) return false;
        if (empRecruitTypeName != null ? !empRecruitTypeName.equals(that.empRecruitTypeName) : that.empRecruitTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empRecruitTypeNo;
        result = 31 * result + (empRecruitTypeName != null ? empRecruitTypeName.hashCode() : 0);
        return result;
    }
}
