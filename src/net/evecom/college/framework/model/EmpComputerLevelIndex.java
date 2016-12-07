package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_computer_level_index", schema = "fzujob", catalog = "")
public class EmpComputerLevelIndex {
    private int empComputerLevelNo;
    private String empComputerLevelName;

    @Basic
    @Column(name = "empComputerLevelNo")
    public int getEmpComputerLevelNo() {
        return empComputerLevelNo;
    }

    public void setEmpComputerLevelNo(int empComputerLevelNo) {
        this.empComputerLevelNo = empComputerLevelNo;
    }

    @Basic
    @Column(name = "empComputerLevelName")
    public String getEmpComputerLevelName() {
        return empComputerLevelName;
    }

    public void setEmpComputerLevelName(String empComputerLevelName) {
        this.empComputerLevelName = empComputerLevelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpComputerLevelIndex that = (EmpComputerLevelIndex) o;

        if (empComputerLevelNo != that.empComputerLevelNo) return false;
        if (empComputerLevelName != null ? !empComputerLevelName.equals(that.empComputerLevelName) : that.empComputerLevelName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empComputerLevelNo;
        result = 31 * result + (empComputerLevelName != null ? empComputerLevelName.hashCode() : 0);
        return result;
    }
}
