package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_sys_info", schema = "fzujob", catalog = "")
public class EmpSysInfo {
    private int empSysNo;
    private String empSysPass;
    private String empSysName;
    private String empSysSex;
    private String empSysBirthDate;
    private String empSysGegree;
    private String empSysState;

    @Basic
    @Column(name = "empSysNo")
    public int getEmpSysNo() {
        return empSysNo;
    }

    public void setEmpSysNo(int empSysNo) {
        this.empSysNo = empSysNo;
    }

    @Basic
    @Column(name = "empSysPass")
    public String getEmpSysPass() {
        return empSysPass;
    }

    public void setEmpSysPass(String empSysPass) {
        this.empSysPass = empSysPass;
    }

    @Basic
    @Column(name = "empSysName")
    public String getEmpSysName() {
        return empSysName;
    }

    public void setEmpSysName(String empSysName) {
        this.empSysName = empSysName;
    }

    @Basic
    @Column(name = "empSysSex")
    public String getEmpSysSex() {
        return empSysSex;
    }

    public void setEmpSysSex(String empSysSex) {
        this.empSysSex = empSysSex;
    }

    @Basic
    @Column(name = "empSysBirthDate")
    public String getEmpSysBirthDate() {
        return empSysBirthDate;
    }

    public void setEmpSysBirthDate(String empSysBirthDate) {
        this.empSysBirthDate = empSysBirthDate;
    }

    @Basic
    @Column(name = "empSysGegree")
    public String getEmpSysGegree() {
        return empSysGegree;
    }

    public void setEmpSysGegree(String empSysGegree) {
        this.empSysGegree = empSysGegree;
    }

    @Basic
    @Column(name = "empSysState")
    public String getEmpSysState() {
        return empSysState;
    }

    public void setEmpSysState(String empSysState) {
        this.empSysState = empSysState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpSysInfo that = (EmpSysInfo) o;

        if (empSysNo != that.empSysNo) return false;
        if (empSysPass != null ? !empSysPass.equals(that.empSysPass) : that.empSysPass != null) return false;
        if (empSysName != null ? !empSysName.equals(that.empSysName) : that.empSysName != null) return false;
        if (empSysSex != null ? !empSysSex.equals(that.empSysSex) : that.empSysSex != null) return false;
        if (empSysBirthDate != null ? !empSysBirthDate.equals(that.empSysBirthDate) : that.empSysBirthDate != null)
            return false;
        if (empSysGegree != null ? !empSysGegree.equals(that.empSysGegree) : that.empSysGegree != null) return false;
        if (empSysState != null ? !empSysState.equals(that.empSysState) : that.empSysState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empSysNo;
        result = 31 * result + (empSysPass != null ? empSysPass.hashCode() : 0);
        result = 31 * result + (empSysName != null ? empSysName.hashCode() : 0);
        result = 31 * result + (empSysSex != null ? empSysSex.hashCode() : 0);
        result = 31 * result + (empSysBirthDate != null ? empSysBirthDate.hashCode() : 0);
        result = 31 * result + (empSysGegree != null ? empSysGegree.hashCode() : 0);
        result = 31 * result + (empSysState != null ? empSysState.hashCode() : 0);
        return result;
    }
}
