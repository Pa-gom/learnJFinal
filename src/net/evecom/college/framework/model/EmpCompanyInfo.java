package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_company_info", schema = "fzujob", catalog = "")
public class EmpCompanyInfo {
    private int empCompanyNo;
    private String empCompanyName;
    private String empCompanyCode;
    private String empCompanyPass;
    private String empCompanyPresident;
    private String empCompanyType;
    private String empCompanyMoney;
    private String empCompanyRange;
    private String empCompanyCreateDate;
    private String empCompanyRegister;
    private String empCompanyLocate;
    private String empCompanyContacter;
    private String empCompanyContacterTel;
    private String empCompanyMail;
    private String empCompanyState;
    private String empCompanyCredit;
    private String empCompanyCreditMaker;

    @Basic
    @Column(name = "empCompanyNo")
    public int getEmpCompanyNo() {
        return empCompanyNo;
    }

    public void setEmpCompanyNo(int empCompanyNo) {
        this.empCompanyNo = empCompanyNo;
    }

    @Basic
    @Column(name = "empCompanyName")
    public String getEmpCompanyName() {
        return empCompanyName;
    }

    public void setEmpCompanyName(String empCompanyName) {
        this.empCompanyName = empCompanyName;
    }

    @Basic
    @Column(name = "empCompanyCode")
    public String getEmpCompanyCode() {
        return empCompanyCode;
    }

    public void setEmpCompanyCode(String empCompanyCode) {
        this.empCompanyCode = empCompanyCode;
    }

    @Basic
    @Column(name = "empCompanyPass")
    public String getEmpCompanyPass() {
        return empCompanyPass;
    }

    public void setEmpCompanyPass(String empCompanyPass) {
        this.empCompanyPass = empCompanyPass;
    }

    @Basic
    @Column(name = "empCompanyPresident")
    public String getEmpCompanyPresident() {
        return empCompanyPresident;
    }

    public void setEmpCompanyPresident(String empCompanyPresident) {
        this.empCompanyPresident = empCompanyPresident;
    }

    @Basic
    @Column(name = "empCompanyType")
    public String getEmpCompanyType() {
        return empCompanyType;
    }

    public void setEmpCompanyType(String empCompanyType) {
        this.empCompanyType = empCompanyType;
    }

    @Basic
    @Column(name = "empCompanyMoney")
    public String getEmpCompanyMoney() {
        return empCompanyMoney;
    }

    public void setEmpCompanyMoney(String empCompanyMoney) {
        this.empCompanyMoney = empCompanyMoney;
    }

    @Basic
    @Column(name = "empCompanyRange")
    public String getEmpCompanyRange() {
        return empCompanyRange;
    }

    public void setEmpCompanyRange(String empCompanyRange) {
        this.empCompanyRange = empCompanyRange;
    }

    @Basic
    @Column(name = "empCompanyCreateDate")
    public String getEmpCompanyCreateDate() {
        return empCompanyCreateDate;
    }

    public void setEmpCompanyCreateDate(String empCompanyCreateDate) {
        this.empCompanyCreateDate = empCompanyCreateDate;
    }

    @Basic
    @Column(name = "empCompanyRegister")
    public String getEmpCompanyRegister() {
        return empCompanyRegister;
    }

    public void setEmpCompanyRegister(String empCompanyRegister) {
        this.empCompanyRegister = empCompanyRegister;
    }

    @Basic
    @Column(name = "empCompanyLocate")
    public String getEmpCompanyLocate() {
        return empCompanyLocate;
    }

    public void setEmpCompanyLocate(String empCompanyLocate) {
        this.empCompanyLocate = empCompanyLocate;
    }

    @Basic
    @Column(name = "empCompanyContacter")
    public String getEmpCompanyContacter() {
        return empCompanyContacter;
    }

    public void setEmpCompanyContacter(String empCompanyContacter) {
        this.empCompanyContacter = empCompanyContacter;
    }

    @Basic
    @Column(name = "empCompanyContacterTel")
    public String getEmpCompanyContacterTel() {
        return empCompanyContacterTel;
    }

    public void setEmpCompanyContacterTel(String empCompanyContacterTel) {
        this.empCompanyContacterTel = empCompanyContacterTel;
    }

    @Basic
    @Column(name = "empCompanyMail")
    public String getEmpCompanyMail() {
        return empCompanyMail;
    }

    public void setEmpCompanyMail(String empCompanyMail) {
        this.empCompanyMail = empCompanyMail;
    }

    @Basic
    @Column(name = "empCompanyState")
    public String getEmpCompanyState() {
        return empCompanyState;
    }

    public void setEmpCompanyState(String empCompanyState) {
        this.empCompanyState = empCompanyState;
    }

    @Basic
    @Column(name = "empCompanyCredit")
    public String getEmpCompanyCredit() {
        return empCompanyCredit;
    }

    public void setEmpCompanyCredit(String empCompanyCredit) {
        this.empCompanyCredit = empCompanyCredit;
    }

    @Basic
    @Column(name = "empCompanyCreditMaker")
    public String getEmpCompanyCreditMaker() {
        return empCompanyCreditMaker;
    }

    public void setEmpCompanyCreditMaker(String empCompanyCreditMaker) {
        this.empCompanyCreditMaker = empCompanyCreditMaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpCompanyInfo that = (EmpCompanyInfo) o;

        if (empCompanyNo != that.empCompanyNo) return false;
        if (empCompanyName != null ? !empCompanyName.equals(that.empCompanyName) : that.empCompanyName != null)
            return false;
        if (empCompanyCode != null ? !empCompanyCode.equals(that.empCompanyCode) : that.empCompanyCode != null)
            return false;
        if (empCompanyPass != null ? !empCompanyPass.equals(that.empCompanyPass) : that.empCompanyPass != null)
            return false;
        if (empCompanyPresident != null ? !empCompanyPresident.equals(that.empCompanyPresident) : that.empCompanyPresident != null)
            return false;
        if (empCompanyType != null ? !empCompanyType.equals(that.empCompanyType) : that.empCompanyType != null)
            return false;
        if (empCompanyMoney != null ? !empCompanyMoney.equals(that.empCompanyMoney) : that.empCompanyMoney != null)
            return false;
        if (empCompanyRange != null ? !empCompanyRange.equals(that.empCompanyRange) : that.empCompanyRange != null)
            return false;
        if (empCompanyCreateDate != null ? !empCompanyCreateDate.equals(that.empCompanyCreateDate) : that.empCompanyCreateDate != null)
            return false;
        if (empCompanyRegister != null ? !empCompanyRegister.equals(that.empCompanyRegister) : that.empCompanyRegister != null)
            return false;
        if (empCompanyLocate != null ? !empCompanyLocate.equals(that.empCompanyLocate) : that.empCompanyLocate != null)
            return false;
        if (empCompanyContacter != null ? !empCompanyContacter.equals(that.empCompanyContacter) : that.empCompanyContacter != null)
            return false;
        if (empCompanyContacterTel != null ? !empCompanyContacterTel.equals(that.empCompanyContacterTel) : that.empCompanyContacterTel != null)
            return false;
        if (empCompanyMail != null ? !empCompanyMail.equals(that.empCompanyMail) : that.empCompanyMail != null)
            return false;
        if (empCompanyState != null ? !empCompanyState.equals(that.empCompanyState) : that.empCompanyState != null)
            return false;
        if (empCompanyCredit != null ? !empCompanyCredit.equals(that.empCompanyCredit) : that.empCompanyCredit != null)
            return false;
        if (empCompanyCreditMaker != null ? !empCompanyCreditMaker.equals(that.empCompanyCreditMaker) : that.empCompanyCreditMaker != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empCompanyNo;
        result = 31 * result + (empCompanyName != null ? empCompanyName.hashCode() : 0);
        result = 31 * result + (empCompanyCode != null ? empCompanyCode.hashCode() : 0);
        result = 31 * result + (empCompanyPass != null ? empCompanyPass.hashCode() : 0);
        result = 31 * result + (empCompanyPresident != null ? empCompanyPresident.hashCode() : 0);
        result = 31 * result + (empCompanyType != null ? empCompanyType.hashCode() : 0);
        result = 31 * result + (empCompanyMoney != null ? empCompanyMoney.hashCode() : 0);
        result = 31 * result + (empCompanyRange != null ? empCompanyRange.hashCode() : 0);
        result = 31 * result + (empCompanyCreateDate != null ? empCompanyCreateDate.hashCode() : 0);
        result = 31 * result + (empCompanyRegister != null ? empCompanyRegister.hashCode() : 0);
        result = 31 * result + (empCompanyLocate != null ? empCompanyLocate.hashCode() : 0);
        result = 31 * result + (empCompanyContacter != null ? empCompanyContacter.hashCode() : 0);
        result = 31 * result + (empCompanyContacterTel != null ? empCompanyContacterTel.hashCode() : 0);
        result = 31 * result + (empCompanyMail != null ? empCompanyMail.hashCode() : 0);
        result = 31 * result + (empCompanyState != null ? empCompanyState.hashCode() : 0);
        result = 31 * result + (empCompanyCredit != null ? empCompanyCredit.hashCode() : 0);
        result = 31 * result + (empCompanyCreditMaker != null ? empCompanyCreditMaker.hashCode() : 0);
        return result;
    }
}
