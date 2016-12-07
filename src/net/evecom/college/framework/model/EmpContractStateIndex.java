package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_contract_state_index", schema = "fzujob", catalog = "")
public class EmpContractStateIndex {
    private int empContractStateNo;
    private String empContractStateName;

    @Basic
    @Column(name = "empContractStateNo")
    public int getEmpContractStateNo() {
        return empContractStateNo;
    }

    public void setEmpContractStateNo(int empContractStateNo) {
        this.empContractStateNo = empContractStateNo;
    }

    @Basic
    @Column(name = "empContractStateName")
    public String getEmpContractStateName() {
        return empContractStateName;
    }

    public void setEmpContractStateName(String empContractStateName) {
        this.empContractStateName = empContractStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpContractStateIndex that = (EmpContractStateIndex) o;

        if (empContractStateNo != that.empContractStateNo) return false;
        if (empContractStateName != null ? !empContractStateName.equals(that.empContractStateName) : that.empContractStateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empContractStateNo;
        result = 31 * result + (empContractStateName != null ? empContractStateName.hashCode() : 0);
        return result;
    }
}
