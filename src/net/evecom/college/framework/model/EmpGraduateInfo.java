package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_graduate_info", schema = "fzujob", catalog = "")
public class EmpGraduateInfo {
    private int empGraduateQueue;
    private String empStudentNo;
    private String empPoliticalStatus;
    private String empGraduateDate;
    private String empSecondQualification;
    private String empSecondProfession;
    private String empEnglishLevel;
    private String empComPuterLevel;
    private String empTall;
    private String empMail;
    private String empTel;
    private String empHomeTel;
    private String empSeeing;
    private String empFamilyMembers;
    private String empRewords;
    private String empWorks;
    private String empJobIntension;
    private String empScientificStatus;
    private String empState;

    @Basic
    @Column(name = "empGraduateQueue")
    public int getEmpGraduateQueue() {
        return empGraduateQueue;
    }

    public void setEmpGraduateQueue(int empGraduateQueue) {
        this.empGraduateQueue = empGraduateQueue;
    }

    @Basic
    @Column(name = "empStudentNo")
    public String getEmpStudentNo() {
        return empStudentNo;
    }

    public void setEmpStudentNo(String empStudentNo) {
        this.empStudentNo = empStudentNo;
    }

    @Basic
    @Column(name = "empPoliticalStatus")
    public String getEmpPoliticalStatus() {
        return empPoliticalStatus;
    }

    public void setEmpPoliticalStatus(String empPoliticalStatus) {
        this.empPoliticalStatus = empPoliticalStatus;
    }

    @Basic
    @Column(name = "empGraduateDate")
    public String getEmpGraduateDate() {
        return empGraduateDate;
    }

    public void setEmpGraduateDate(String empGraduateDate) {
        this.empGraduateDate = empGraduateDate;
    }

    @Basic
    @Column(name = "empSecondQualification")
    public String getEmpSecondQualification() {
        return empSecondQualification;
    }

    public void setEmpSecondQualification(String empSecondQualification) {
        this.empSecondQualification = empSecondQualification;
    }

    @Basic
    @Column(name = "empSecondProfession")
    public String getEmpSecondProfession() {
        return empSecondProfession;
    }

    public void setEmpSecondProfession(String empSecondProfession) {
        this.empSecondProfession = empSecondProfession;
    }

    @Basic
    @Column(name = "empEnglishLevel")
    public String getEmpEnglishLevel() {
        return empEnglishLevel;
    }

    public void setEmpEnglishLevel(String empEnglishLevel) {
        this.empEnglishLevel = empEnglishLevel;
    }

    @Basic
    @Column(name = "empComPuterLevel")
    public String getEmpComPuterLevel() {
        return empComPuterLevel;
    }

    public void setEmpComPuterLevel(String empComPuterLevel) {
        this.empComPuterLevel = empComPuterLevel;
    }

    @Basic
    @Column(name = "empTall")
    public String getEmpTall() {
        return empTall;
    }

    public void setEmpTall(String empTall) {
        this.empTall = empTall;
    }

    @Basic
    @Column(name = "empMail")
    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

    @Basic
    @Column(name = "empTel")
    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    @Basic
    @Column(name = "empHomeTel")
    public String getEmpHomeTel() {
        return empHomeTel;
    }

    public void setEmpHomeTel(String empHomeTel) {
        this.empHomeTel = empHomeTel;
    }

    @Basic
    @Column(name = "empSeeing")
    public String getEmpSeeing() {
        return empSeeing;
    }

    public void setEmpSeeing(String empSeeing) {
        this.empSeeing = empSeeing;
    }

    @Basic
    @Column(name = "empFamilyMembers")
    public String getEmpFamilyMembers() {
        return empFamilyMembers;
    }

    public void setEmpFamilyMembers(String empFamilyMembers) {
        this.empFamilyMembers = empFamilyMembers;
    }

    @Basic
    @Column(name = "empRewords")
    public String getEmpRewords() {
        return empRewords;
    }

    public void setEmpRewords(String empRewords) {
        this.empRewords = empRewords;
    }

    @Basic
    @Column(name = "empWorks")
    public String getEmpWorks() {
        return empWorks;
    }

    public void setEmpWorks(String empWorks) {
        this.empWorks = empWorks;
    }

    @Basic
    @Column(name = "empJobIntension")
    public String getEmpJobIntension() {
        return empJobIntension;
    }

    public void setEmpJobIntension(String empJobIntension) {
        this.empJobIntension = empJobIntension;
    }

    @Basic
    @Column(name = "empScientificStatus")
    public String getEmpScientificStatus() {
        return empScientificStatus;
    }

    public void setEmpScientificStatus(String empScientificStatus) {
        this.empScientificStatus = empScientificStatus;
    }

    @Basic
    @Column(name = "empState")
    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpGraduateInfo that = (EmpGraduateInfo) o;

        if (empGraduateQueue != that.empGraduateQueue) return false;
        if (empStudentNo != null ? !empStudentNo.equals(that.empStudentNo) : that.empStudentNo != null) return false;
        if (empPoliticalStatus != null ? !empPoliticalStatus.equals(that.empPoliticalStatus) : that.empPoliticalStatus != null)
            return false;
        if (empGraduateDate != null ? !empGraduateDate.equals(that.empGraduateDate) : that.empGraduateDate != null)
            return false;
        if (empSecondQualification != null ? !empSecondQualification.equals(that.empSecondQualification) : that.empSecondQualification != null)
            return false;
        if (empSecondProfession != null ? !empSecondProfession.equals(that.empSecondProfession) : that.empSecondProfession != null)
            return false;
        if (empEnglishLevel != null ? !empEnglishLevel.equals(that.empEnglishLevel) : that.empEnglishLevel != null)
            return false;
        if (empComPuterLevel != null ? !empComPuterLevel.equals(that.empComPuterLevel) : that.empComPuterLevel != null)
            return false;
        if (empTall != null ? !empTall.equals(that.empTall) : that.empTall != null) return false;
        if (empMail != null ? !empMail.equals(that.empMail) : that.empMail != null) return false;
        if (empTel != null ? !empTel.equals(that.empTel) : that.empTel != null) return false;
        if (empHomeTel != null ? !empHomeTel.equals(that.empHomeTel) : that.empHomeTel != null) return false;
        if (empSeeing != null ? !empSeeing.equals(that.empSeeing) : that.empSeeing != null) return false;
        if (empFamilyMembers != null ? !empFamilyMembers.equals(that.empFamilyMembers) : that.empFamilyMembers != null)
            return false;
        if (empRewords != null ? !empRewords.equals(that.empRewords) : that.empRewords != null) return false;
        if (empWorks != null ? !empWorks.equals(that.empWorks) : that.empWorks != null) return false;
        if (empJobIntension != null ? !empJobIntension.equals(that.empJobIntension) : that.empJobIntension != null)
            return false;
        if (empScientificStatus != null ? !empScientificStatus.equals(that.empScientificStatus) : that.empScientificStatus != null)
            return false;
        if (empState != null ? !empState.equals(that.empState) : that.empState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empGraduateQueue;
        result = 31 * result + (empStudentNo != null ? empStudentNo.hashCode() : 0);
        result = 31 * result + (empPoliticalStatus != null ? empPoliticalStatus.hashCode() : 0);
        result = 31 * result + (empGraduateDate != null ? empGraduateDate.hashCode() : 0);
        result = 31 * result + (empSecondQualification != null ? empSecondQualification.hashCode() : 0);
        result = 31 * result + (empSecondProfession != null ? empSecondProfession.hashCode() : 0);
        result = 31 * result + (empEnglishLevel != null ? empEnglishLevel.hashCode() : 0);
        result = 31 * result + (empComPuterLevel != null ? empComPuterLevel.hashCode() : 0);
        result = 31 * result + (empTall != null ? empTall.hashCode() : 0);
        result = 31 * result + (empMail != null ? empMail.hashCode() : 0);
        result = 31 * result + (empTel != null ? empTel.hashCode() : 0);
        result = 31 * result + (empHomeTel != null ? empHomeTel.hashCode() : 0);
        result = 31 * result + (empSeeing != null ? empSeeing.hashCode() : 0);
        result = 31 * result + (empFamilyMembers != null ? empFamilyMembers.hashCode() : 0);
        result = 31 * result + (empRewords != null ? empRewords.hashCode() : 0);
        result = 31 * result + (empWorks != null ? empWorks.hashCode() : 0);
        result = 31 * result + (empJobIntension != null ? empJobIntension.hashCode() : 0);
        result = 31 * result + (empScientificStatus != null ? empScientificStatus.hashCode() : 0);
        result = 31 * result + (empState != null ? empState.hashCode() : 0);
        return result;
    }
}
