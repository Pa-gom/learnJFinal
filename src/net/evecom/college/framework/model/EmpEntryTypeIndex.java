package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_entry_type_index", schema = "fzujob", catalog = "")
public class EmpEntryTypeIndex {
    private int empEntryTypeNo;
    private String empEntryTypeName;

    @Basic
    @Column(name = "empEntryTypeNo")
    public int getEmpEntryTypeNo() {
        return empEntryTypeNo;
    }

    public void setEmpEntryTypeNo(int empEntryTypeNo) {
        this.empEntryTypeNo = empEntryTypeNo;
    }

    @Basic
    @Column(name = "empEntryTypeName")
    public String getEmpEntryTypeName() {
        return empEntryTypeName;
    }

    public void setEmpEntryTypeName(String empEntryTypeName) {
        this.empEntryTypeName = empEntryTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEntryTypeIndex that = (EmpEntryTypeIndex) o;

        if (empEntryTypeNo != that.empEntryTypeNo) return false;
        if (empEntryTypeName != null ? !empEntryTypeName.equals(that.empEntryTypeName) : that.empEntryTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empEntryTypeNo;
        result = 31 * result + (empEntryTypeName != null ? empEntryTypeName.hashCode() : 0);
        return result;
    }
}
