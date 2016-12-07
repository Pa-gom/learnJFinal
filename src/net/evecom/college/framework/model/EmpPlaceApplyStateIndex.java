package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_place_apply_state_index", schema = "fzujob", catalog = "")
public class EmpPlaceApplyStateIndex {
    private int empPlaceApplyStateNo;
    private String empPlaceApplyStateName;

    @Basic
    @Column(name = "empPlaceApplyStateNo")
    public int getEmpPlaceApplyStateNo() {
        return empPlaceApplyStateNo;
    }

    public void setEmpPlaceApplyStateNo(int empPlaceApplyStateNo) {
        this.empPlaceApplyStateNo = empPlaceApplyStateNo;
    }

    @Basic
    @Column(name = "empPlaceApplyStateName")
    public String getEmpPlaceApplyStateName() {
        return empPlaceApplyStateName;
    }

    public void setEmpPlaceApplyStateName(String empPlaceApplyStateName) {
        this.empPlaceApplyStateName = empPlaceApplyStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpPlaceApplyStateIndex that = (EmpPlaceApplyStateIndex) o;

        if (empPlaceApplyStateNo != that.empPlaceApplyStateNo) return false;
        if (empPlaceApplyStateName != null ? !empPlaceApplyStateName.equals(that.empPlaceApplyStateName) : that.empPlaceApplyStateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empPlaceApplyStateNo;
        result = 31 * result + (empPlaceApplyStateName != null ? empPlaceApplyStateName.hashCode() : 0);
        return result;
    }
}
