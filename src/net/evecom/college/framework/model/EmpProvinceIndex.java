package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_province_index", schema = "fzujob", catalog = "")
public class EmpProvinceIndex {
    private int empProvinceNo;
    private String empProvinceName;

    @Basic
    @Column(name = "empProvinceNo")
    public int getEmpProvinceNo() {
        return empProvinceNo;
    }

    public void setEmpProvinceNo(int empProvinceNo) {
        this.empProvinceNo = empProvinceNo;
    }

    @Basic
    @Column(name = "empProvinceName")
    public String getEmpProvinceName() {
        return empProvinceName;
    }

    public void setEmpProvinceName(String empProvinceName) {
        this.empProvinceName = empProvinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpProvinceIndex that = (EmpProvinceIndex) o;

        if (empProvinceNo != that.empProvinceNo) return false;
        if (empProvinceName != null ? !empProvinceName.equals(that.empProvinceName) : that.empProvinceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empProvinceNo;
        result = 31 * result + (empProvinceName != null ? empProvinceName.hashCode() : 0);
        return result;
    }
}
