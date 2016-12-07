package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_contrac_info", schema = "fzujob", catalog = "")
public class EmpContracInfo {
    private int empContractNo;
    private String empCompanyName;
    private String empCompanyCode;
    private String empCompanyPresident;
    private String empCompanyType;
    private String empCompanyContact;
    private String empCompanyContactTel;
    private String empCompanyContactMail;
    private String empCompanyJob;
    private String empCompanyJobAddress;
    private String empCompanyDate;
    private String empCompanyYears;
    private String empCompanyJoinWordDate;
    private String empContractStudentName;
    private String empContractStudentNo;
    private String empContractStudentIdCode;
    private String empContractStudentCollege;
    private String empContractStudentIndustry;
    private String empContractStudentTel;
    private String empContractStudentMail;
    private String empContractStudentGrade;
    private String empContractState;

    @Basic
    @Column(name = "empContractNo")
    public int getEmpContractNo() {
        return empContractNo;
    }

    public void setEmpContractNo(int empContractNo) {
        this.empContractNo = empContractNo;
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
    @Column(name = "empCompanyContact")
    public String getEmpCompanyContact() {
        return empCompanyContact;
    }

    public void setEmpCompanyContact(String empCompanyContact) {
        this.empCompanyContact = empCompanyContact;
    }

    @Basic
    @Column(name = "empCompanyContactTel")
    public String getEmpCompanyContactTel() {
        return empCompanyContactTel;
    }

    public void setEmpCompanyContactTel(String empCompanyContactTel) {
        this.empCompanyContactTel = empCompanyContactTel;
    }

    @Basic
    @Column(name = "empCompanyContactMail")
    public String getEmpCompanyContactMail() {
        return empCompanyContactMail;
    }

    public void setEmpCompanyContactMail(String empCompanyContactMail) {
        this.empCompanyContactMail = empCompanyContactMail;
    }

    @Basic
    @Column(name = "empCompanyJob")
    public String getEmpCompanyJob() {
        return empCompanyJob;
    }

    public void setEmpCompanyJob(String empCompanyJob) {
        this.empCompanyJob = empCompanyJob;
    }

    @Basic
    @Column(name = "empCompanyJobAddress")
    public String getEmpCompanyJobAddress() {
        return empCompanyJobAddress;
    }

    public void setEmpCompanyJobAddress(String empCompanyJobAddress) {
        this.empCompanyJobAddress = empCompanyJobAddress;
    }

    @Basic
    @Column(name = "empCompanyDate")
    public String getEmpCompanyDate() {
        return empCompanyDate;
    }

    public void setEmpCompanyDate(String empCompanyDate) {
        this.empCompanyDate = empCompanyDate;
    }

    @Basic
    @Column(name = "empCompanyYears")
    public String getEmpCompanyYears() {
        return empCompanyYears;
    }

    public void setEmpCompanyYears(String empCompanyYears) {
        this.empCompanyYears = empCompanyYears;
    }

    @Basic
    @Column(name = "empCompanyJoinWordDate")
    public String getEmpCompanyJoinWordDate() {
        return empCompanyJoinWordDate;
    }

    public void setEmpCompanyJoinWordDate(String empCompanyJoinWordDate) {
        this.empCompanyJoinWordDate = empCompanyJoinWordDate;
    }

    @Basic
    @Column(name = "empContractStudentName")
    public String getEmpContractStudentName() {
        return empContractStudentName;
    }

    public void setEmpContractStudentName(String empContractStudentName) {
        this.empContractStudentName = empContractStudentName;
    }

    @Basic
    @Column(name = "empContractStudentNo")
    public String getEmpContractStudentNo() {
        return empContractStudentNo;
    }

    public void setEmpContractStudentNo(String empContractStudentNo) {
        this.empContractStudentNo = empContractStudentNo;
    }

    @Basic
    @Column(name = "empContractStudentIdCode")
    public String getEmpContractStudentIdCode() {
        return empContractStudentIdCode;
    }

    public void setEmpContractStudentIdCode(String empContractStudentIdCode) {
        this.empContractStudentIdCode = empContractStudentIdCode;
    }

    @Basic
    @Column(name = "empContractStudentCollege")
    public String getEmpContractStudentCollege() {
        return empContractStudentCollege;
    }

    public void setEmpContractStudentCollege(String empContractStudentCollege) {
        this.empContractStudentCollege = empContractStudentCollege;
    }

    @Basic
    @Column(name = "empContractStudentIndustry")
    public String getEmpContractStudentIndustry() {
        return empContractStudentIndustry;
    }

    public void setEmpContractStudentIndustry(String empContractStudentIndustry) {
        this.empContractStudentIndustry = empContractStudentIndustry;
    }

    @Basic
    @Column(name = "empContractStudentTel")
    public String getEmpContractStudentTel() {
        return empContractStudentTel;
    }

    public void setEmpContractStudentTel(String empContractStudentTel) {
        this.empContractStudentTel = empContractStudentTel;
    }

    @Basic
    @Column(name = "empContractStudentMail")
    public String getEmpContractStudentMail() {
        return empContractStudentMail;
    }

    public void setEmpContractStudentMail(String empContractStudentMail) {
        this.empContractStudentMail = empContractStudentMail;
    }

    @Basic
    @Column(name = "empContractStudentGrade")
    public String getEmpContractStudentGrade() {
        return empContractStudentGrade;
    }

    public void setEmpContractStudentGrade(String empContractStudentGrade) {
        this.empContractStudentGrade = empContractStudentGrade;
    }

    @Basic
    @Column(name = "empContractState")
    public String getEmpContractState() {
        return empContractState;
    }

    public void setEmpContractState(String empContractState) {
        this.empContractState = empContractState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpContracInfo that = (EmpContracInfo) o;

        if (empContractNo != that.empContractNo) return false;
        if (empCompanyName != null ? !empCompanyName.equals(that.empCompanyName) : that.empCompanyName != null)
            return false;
        if (empCompanyCode != null ? !empCompanyCode.equals(that.empCompanyCode) : that.empCompanyCode != null)
            return false;
        if (empCompanyPresident != null ? !empCompanyPresident.equals(that.empCompanyPresident) : that.empCompanyPresident != null)
            return false;
        if (empCompanyType != null ? !empCompanyType.equals(that.empCompanyType) : that.empCompanyType != null)
            return false;
        if (empCompanyContact != null ? !empCompanyContact.equals(that.empCompanyContact) : that.empCompanyContact != null)
            return false;
        if (empCompanyContactTel != null ? !empCompanyContactTel.equals(that.empCompanyContactTel) : that.empCompanyContactTel != null)
            return false;
        if (empCompanyContactMail != null ? !empCompanyContactMail.equals(that.empCompanyContactMail) : that.empCompanyContactMail != null)
            return false;
        if (empCompanyJob != null ? !empCompanyJob.equals(that.empCompanyJob) : that.empCompanyJob != null)
            return false;
        if (empCompanyJobAddress != null ? !empCompanyJobAddress.equals(that.empCompanyJobAddress) : that.empCompanyJobAddress != null)
            return false;
        if (empCompanyDate != null ? !empCompanyDate.equals(that.empCompanyDate) : that.empCompanyDate != null)
            return false;
        if (empCompanyYears != null ? !empCompanyYears.equals(that.empCompanyYears) : that.empCompanyYears != null)
            return false;
        if (empCompanyJoinWordDate != null ? !empCompanyJoinWordDate.equals(that.empCompanyJoinWordDate) : that.empCompanyJoinWordDate != null)
            return false;
        if (empContractStudentName != null ? !empContractStudentName.equals(that.empContractStudentName) : that.empContractStudentName != null)
            return false;
        if (empContractStudentNo != null ? !empContractStudentNo.equals(that.empContractStudentNo) : that.empContractStudentNo != null)
            return false;
        if (empContractStudentIdCode != null ? !empContractStudentIdCode.equals(that.empContractStudentIdCode) : that.empContractStudentIdCode != null)
            return false;
        if (empContractStudentCollege != null ? !empContractStudentCollege.equals(that.empContractStudentCollege) : that.empContractStudentCollege != null)
            return false;
        if (empContractStudentIndustry != null ? !empContractStudentIndustry.equals(that.empContractStudentIndustry) : that.empContractStudentIndustry != null)
            return false;
        if (empContractStudentTel != null ? !empContractStudentTel.equals(that.empContractStudentTel) : that.empContractStudentTel != null)
            return false;
        if (empContractStudentMail != null ? !empContractStudentMail.equals(that.empContractStudentMail) : that.empContractStudentMail != null)
            return false;
        if (empContractStudentGrade != null ? !empContractStudentGrade.equals(that.empContractStudentGrade) : that.empContractStudentGrade != null)
            return false;
        if (empContractState != null ? !empContractState.equals(that.empContractState) : that.empContractState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empContractNo;
        result = 31 * result + (empCompanyName != null ? empCompanyName.hashCode() : 0);
        result = 31 * result + (empCompanyCode != null ? empCompanyCode.hashCode() : 0);
        result = 31 * result + (empCompanyPresident != null ? empCompanyPresident.hashCode() : 0);
        result = 31 * result + (empCompanyType != null ? empCompanyType.hashCode() : 0);
        result = 31 * result + (empCompanyContact != null ? empCompanyContact.hashCode() : 0);
        result = 31 * result + (empCompanyContactTel != null ? empCompanyContactTel.hashCode() : 0);
        result = 31 * result + (empCompanyContactMail != null ? empCompanyContactMail.hashCode() : 0);
        result = 31 * result + (empCompanyJob != null ? empCompanyJob.hashCode() : 0);
        result = 31 * result + (empCompanyJobAddress != null ? empCompanyJobAddress.hashCode() : 0);
        result = 31 * result + (empCompanyDate != null ? empCompanyDate.hashCode() : 0);
        result = 31 * result + (empCompanyYears != null ? empCompanyYears.hashCode() : 0);
        result = 31 * result + (empCompanyJoinWordDate != null ? empCompanyJoinWordDate.hashCode() : 0);
        result = 31 * result + (empContractStudentName != null ? empContractStudentName.hashCode() : 0);
        result = 31 * result + (empContractStudentNo != null ? empContractStudentNo.hashCode() : 0);
        result = 31 * result + (empContractStudentIdCode != null ? empContractStudentIdCode.hashCode() : 0);
        result = 31 * result + (empContractStudentCollege != null ? empContractStudentCollege.hashCode() : 0);
        result = 31 * result + (empContractStudentIndustry != null ? empContractStudentIndustry.hashCode() : 0);
        result = 31 * result + (empContractStudentTel != null ? empContractStudentTel.hashCode() : 0);
        result = 31 * result + (empContractStudentMail != null ? empContractStudentMail.hashCode() : 0);
        result = 31 * result + (empContractStudentGrade != null ? empContractStudentGrade.hashCode() : 0);
        result = 31 * result + (empContractState != null ? empContractState.hashCode() : 0);
        return result;
    }
}
