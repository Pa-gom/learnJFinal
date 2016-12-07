package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_recruit_state_index", schema = "fzujob", catalog = "")
public class EmpRecruitStateIndex {
    private int empRecruitStateNo;
    private String empRecruitStateName;

    @Basic
    @Column(name = "empRecruitStateNo")
    public int getEmpRecruitStateNo() {
        return empRecruitStateNo;
    }

    public void setEmpRecruitStateNo(int empRecruitStateNo) {
        this.empRecruitStateNo = empRecruitStateNo;
    }

    @Basic
    @Column(name = "empRecruitStateName")
    public String getEmpRecruitStateName() {
        return empRecruitStateName;
    }

    public void setEmpRecruitStateName(String empRecruitStateName) {
        this.empRecruitStateName = empRecruitStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpRecruitStateIndex that = (EmpRecruitStateIndex) o;

        if (empRecruitStateNo != that.empRecruitStateNo) return false;
        if (empRecruitStateName != null ? !empRecruitStateName.equals(that.empRecruitStateName) : that.empRecruitStateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empRecruitStateNo;
        result = 31 * result + (empRecruitStateName != null ? empRecruitStateName.hashCode() : 0);
        return result;
    }
}
