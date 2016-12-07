package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_student_base_info", schema = "fzujob", catalog = "")
public class EmpStudentBaseInfo {
    private int empStudentQueue;
    private String empStudentNo;
    private String empStudentPass;
    private String empStudentName;
    private String empStudentHeadIcon;
    private String empStudentOldName;
    private String empStudentNameAlphaSpell;
    private String empStudentSex;
    private String empStudentMinority;
    private String empStudentLocation;
    private String empStudentPoliticalStatus;
    private String empStudentMarry;
    private String empStudentStuLocation;
    private String empStudentAddress;
    private String empStudentTel;
    private String empStudentPostCode;
    private String empStudentIdNo;
    private String empStudentExamNo;
    private String empStudentExamType;
    private String empStudentEntryStudyDate;
    private String empStudentCollege;
    private String empStudentProfession;
    private String empStudentGrade;
    private String empStudentOldProfession;
    private String empStudentLevelStudyDate;
    private String empStudentEmail;
    private String empStudentDevelopLevel;
    private String empStudentEntryStudyType;
    private String empStudentStudyAspect;
    private String empStudentFecture;
    private String empStudentException;
    private String empStudentRewordsAndPanishments;

    @Basic
    @Column(name = "empStudentQueue")
    public int getEmpStudentQueue() {
        return empStudentQueue;
    }

    public void setEmpStudentQueue(int empStudentQueue) {
        this.empStudentQueue = empStudentQueue;
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
    @Column(name = "empStudentPass")
    public String getEmpStudentPass() {
        return empStudentPass;
    }

    public void setEmpStudentPass(String empStudentPass) {
        this.empStudentPass = empStudentPass;
    }

    @Basic
    @Column(name = "empStudentName")
    public String getEmpStudentName() {
        return empStudentName;
    }

    public void setEmpStudentName(String empStudentName) {
        this.empStudentName = empStudentName;
    }

    @Basic
    @Column(name = "empStudentHeadIcon")
    public String getEmpStudentHeadIcon() {
        return empStudentHeadIcon;
    }

    public void setEmpStudentHeadIcon(String empStudentHeadIcon) {
        this.empStudentHeadIcon = empStudentHeadIcon;
    }

    @Basic
    @Column(name = "empStudentOldName")
    public String getEmpStudentOldName() {
        return empStudentOldName;
    }

    public void setEmpStudentOldName(String empStudentOldName) {
        this.empStudentOldName = empStudentOldName;
    }

    @Basic
    @Column(name = "empStudentNameAlphaSpell")
    public String getEmpStudentNameAlphaSpell() {
        return empStudentNameAlphaSpell;
    }

    public void setEmpStudentNameAlphaSpell(String empStudentNameAlphaSpell) {
        this.empStudentNameAlphaSpell = empStudentNameAlphaSpell;
    }

    @Basic
    @Column(name = "empStudentSex")
    public String getEmpStudentSex() {
        return empStudentSex;
    }

    public void setEmpStudentSex(String empStudentSex) {
        this.empStudentSex = empStudentSex;
    }

    @Basic
    @Column(name = "empStudentMinority")
    public String getEmpStudentMinority() {
        return empStudentMinority;
    }

    public void setEmpStudentMinority(String empStudentMinority) {
        this.empStudentMinority = empStudentMinority;
    }

    @Basic
    @Column(name = "empStudentLocation")
    public String getEmpStudentLocation() {
        return empStudentLocation;
    }

    public void setEmpStudentLocation(String empStudentLocation) {
        this.empStudentLocation = empStudentLocation;
    }

    @Basic
    @Column(name = "empStudentPoliticalStatus")
    public String getEmpStudentPoliticalStatus() {
        return empStudentPoliticalStatus;
    }

    public void setEmpStudentPoliticalStatus(String empStudentPoliticalStatus) {
        this.empStudentPoliticalStatus = empStudentPoliticalStatus;
    }

    @Basic
    @Column(name = "empStudentMarry")
    public String getEmpStudentMarry() {
        return empStudentMarry;
    }

    public void setEmpStudentMarry(String empStudentMarry) {
        this.empStudentMarry = empStudentMarry;
    }

    @Basic
    @Column(name = "empStudentStuLocation")
    public String getEmpStudentStuLocation() {
        return empStudentStuLocation;
    }

    public void setEmpStudentStuLocation(String empStudentStuLocation) {
        this.empStudentStuLocation = empStudentStuLocation;
    }

    @Basic
    @Column(name = "empStudentAddress")
    public String getEmpStudentAddress() {
        return empStudentAddress;
    }

    public void setEmpStudentAddress(String empStudentAddress) {
        this.empStudentAddress = empStudentAddress;
    }

    @Basic
    @Column(name = "empStudentTel")
    public String getEmpStudentTel() {
        return empStudentTel;
    }

    public void setEmpStudentTel(String empStudentTel) {
        this.empStudentTel = empStudentTel;
    }

    @Basic
    @Column(name = "empStudentPostCode")
    public String getEmpStudentPostCode() {
        return empStudentPostCode;
    }

    public void setEmpStudentPostCode(String empStudentPostCode) {
        this.empStudentPostCode = empStudentPostCode;
    }

    @Basic
    @Column(name = "empStudentIdNo")
    public String getEmpStudentIdNo() {
        return empStudentIdNo;
    }

    public void setEmpStudentIdNo(String empStudentIdNo) {
        this.empStudentIdNo = empStudentIdNo;
    }

    @Basic
    @Column(name = "empStudentExamNo")
    public String getEmpStudentExamNo() {
        return empStudentExamNo;
    }

    public void setEmpStudentExamNo(String empStudentExamNo) {
        this.empStudentExamNo = empStudentExamNo;
    }

    @Basic
    @Column(name = "empStudentExamType")
    public String getEmpStudentExamType() {
        return empStudentExamType;
    }

    public void setEmpStudentExamType(String empStudentExamType) {
        this.empStudentExamType = empStudentExamType;
    }

    @Basic
    @Column(name = "empStudentEntryStudyDate")
    public String getEmpStudentEntryStudyDate() {
        return empStudentEntryStudyDate;
    }

    public void setEmpStudentEntryStudyDate(String empStudentEntryStudyDate) {
        this.empStudentEntryStudyDate = empStudentEntryStudyDate;
    }

    @Basic
    @Column(name = "empStudentCollege")
    public String getEmpStudentCollege() {
        return empStudentCollege;
    }

    public void setEmpStudentCollege(String empStudentCollege) {
        this.empStudentCollege = empStudentCollege;
    }

    @Basic
    @Column(name = "empStudentProfession")
    public String getEmpStudentProfession() {
        return empStudentProfession;
    }

    public void setEmpStudentProfession(String empStudentProfession) {
        this.empStudentProfession = empStudentProfession;
    }

    @Basic
    @Column(name = "empStudentGrade")
    public String getEmpStudentGrade() {
        return empStudentGrade;
    }

    public void setEmpStudentGrade(String empStudentGrade) {
        this.empStudentGrade = empStudentGrade;
    }

    @Basic
    @Column(name = "empStudentOldProfession")
    public String getEmpStudentOldProfession() {
        return empStudentOldProfession;
    }

    public void setEmpStudentOldProfession(String empStudentOldProfession) {
        this.empStudentOldProfession = empStudentOldProfession;
    }

    @Basic
    @Column(name = "empStudentLevelStudyDate")
    public String getEmpStudentLevelStudyDate() {
        return empStudentLevelStudyDate;
    }

    public void setEmpStudentLevelStudyDate(String empStudentLevelStudyDate) {
        this.empStudentLevelStudyDate = empStudentLevelStudyDate;
    }

    @Basic
    @Column(name = "empStudentEmail")
    public String getEmpStudentEmail() {
        return empStudentEmail;
    }

    public void setEmpStudentEmail(String empStudentEmail) {
        this.empStudentEmail = empStudentEmail;
    }

    @Basic
    @Column(name = "empStudentDevelopLevel")
    public String getEmpStudentDevelopLevel() {
        return empStudentDevelopLevel;
    }

    public void setEmpStudentDevelopLevel(String empStudentDevelopLevel) {
        this.empStudentDevelopLevel = empStudentDevelopLevel;
    }

    @Basic
    @Column(name = "empStudentEntryStudyType")
    public String getEmpStudentEntryStudyType() {
        return empStudentEntryStudyType;
    }

    public void setEmpStudentEntryStudyType(String empStudentEntryStudyType) {
        this.empStudentEntryStudyType = empStudentEntryStudyType;
    }

    @Basic
    @Column(name = "empStudentStudyAspect")
    public String getEmpStudentStudyAspect() {
        return empStudentStudyAspect;
    }

    public void setEmpStudentStudyAspect(String empStudentStudyAspect) {
        this.empStudentStudyAspect = empStudentStudyAspect;
    }

    @Basic
    @Column(name = "empStudentFecture")
    public String getEmpStudentFecture() {
        return empStudentFecture;
    }

    public void setEmpStudentFecture(String empStudentFecture) {
        this.empStudentFecture = empStudentFecture;
    }

    @Basic
    @Column(name = "empStudentException")
    public String getEmpStudentException() {
        return empStudentException;
    }

    public void setEmpStudentException(String empStudentException) {
        this.empStudentException = empStudentException;
    }

    @Basic
    @Column(name = "empStudentRewordsAndPanishments")
    public String getEmpStudentRewordsAndPanishments() {
        return empStudentRewordsAndPanishments;
    }

    public void setEmpStudentRewordsAndPanishments(String empStudentRewordsAndPanishments) {
        this.empStudentRewordsAndPanishments = empStudentRewordsAndPanishments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpStudentBaseInfo that = (EmpStudentBaseInfo) o;

        if (empStudentQueue != that.empStudentQueue) return false;
        if (empStudentNo != null ? !empStudentNo.equals(that.empStudentNo) : that.empStudentNo != null) return false;
        if (empStudentPass != null ? !empStudentPass.equals(that.empStudentPass) : that.empStudentPass != null)
            return false;
        if (empStudentName != null ? !empStudentName.equals(that.empStudentName) : that.empStudentName != null)
            return false;
        if (empStudentHeadIcon != null ? !empStudentHeadIcon.equals(that.empStudentHeadIcon) : that.empStudentHeadIcon != null)
            return false;
        if (empStudentOldName != null ? !empStudentOldName.equals(that.empStudentOldName) : that.empStudentOldName != null)
            return false;
        if (empStudentNameAlphaSpell != null ? !empStudentNameAlphaSpell.equals(that.empStudentNameAlphaSpell) : that.empStudentNameAlphaSpell != null)
            return false;
        if (empStudentSex != null ? !empStudentSex.equals(that.empStudentSex) : that.empStudentSex != null)
            return false;
        if (empStudentMinority != null ? !empStudentMinority.equals(that.empStudentMinority) : that.empStudentMinority != null)
            return false;
        if (empStudentLocation != null ? !empStudentLocation.equals(that.empStudentLocation) : that.empStudentLocation != null)
            return false;
        if (empStudentPoliticalStatus != null ? !empStudentPoliticalStatus.equals(that.empStudentPoliticalStatus) : that.empStudentPoliticalStatus != null)
            return false;
        if (empStudentMarry != null ? !empStudentMarry.equals(that.empStudentMarry) : that.empStudentMarry != null)
            return false;
        if (empStudentStuLocation != null ? !empStudentStuLocation.equals(that.empStudentStuLocation) : that.empStudentStuLocation != null)
            return false;
        if (empStudentAddress != null ? !empStudentAddress.equals(that.empStudentAddress) : that.empStudentAddress != null)
            return false;
        if (empStudentTel != null ? !empStudentTel.equals(that.empStudentTel) : that.empStudentTel != null)
            return false;
        if (empStudentPostCode != null ? !empStudentPostCode.equals(that.empStudentPostCode) : that.empStudentPostCode != null)
            return false;
        if (empStudentIdNo != null ? !empStudentIdNo.equals(that.empStudentIdNo) : that.empStudentIdNo != null)
            return false;
        if (empStudentExamNo != null ? !empStudentExamNo.equals(that.empStudentExamNo) : that.empStudentExamNo != null)
            return false;
        if (empStudentExamType != null ? !empStudentExamType.equals(that.empStudentExamType) : that.empStudentExamType != null)
            return false;
        if (empStudentEntryStudyDate != null ? !empStudentEntryStudyDate.equals(that.empStudentEntryStudyDate) : that.empStudentEntryStudyDate != null)
            return false;
        if (empStudentCollege != null ? !empStudentCollege.equals(that.empStudentCollege) : that.empStudentCollege != null)
            return false;
        if (empStudentProfession != null ? !empStudentProfession.equals(that.empStudentProfession) : that.empStudentProfession != null)
            return false;
        if (empStudentGrade != null ? !empStudentGrade.equals(that.empStudentGrade) : that.empStudentGrade != null)
            return false;
        if (empStudentOldProfession != null ? !empStudentOldProfession.equals(that.empStudentOldProfession) : that.empStudentOldProfession != null)
            return false;
        if (empStudentLevelStudyDate != null ? !empStudentLevelStudyDate.equals(that.empStudentLevelStudyDate) : that.empStudentLevelStudyDate != null)
            return false;
        if (empStudentEmail != null ? !empStudentEmail.equals(that.empStudentEmail) : that.empStudentEmail != null)
            return false;
        if (empStudentDevelopLevel != null ? !empStudentDevelopLevel.equals(that.empStudentDevelopLevel) : that.empStudentDevelopLevel != null)
            return false;
        if (empStudentEntryStudyType != null ? !empStudentEntryStudyType.equals(that.empStudentEntryStudyType) : that.empStudentEntryStudyType != null)
            return false;
        if (empStudentStudyAspect != null ? !empStudentStudyAspect.equals(that.empStudentStudyAspect) : that.empStudentStudyAspect != null)
            return false;
        if (empStudentFecture != null ? !empStudentFecture.equals(that.empStudentFecture) : that.empStudentFecture != null)
            return false;
        if (empStudentException != null ? !empStudentException.equals(that.empStudentException) : that.empStudentException != null)
            return false;
        if (empStudentRewordsAndPanishments != null ? !empStudentRewordsAndPanishments.equals(that.empStudentRewordsAndPanishments) : that.empStudentRewordsAndPanishments != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empStudentQueue;
        result = 31 * result + (empStudentNo != null ? empStudentNo.hashCode() : 0);
        result = 31 * result + (empStudentPass != null ? empStudentPass.hashCode() : 0);
        result = 31 * result + (empStudentName != null ? empStudentName.hashCode() : 0);
        result = 31 * result + (empStudentHeadIcon != null ? empStudentHeadIcon.hashCode() : 0);
        result = 31 * result + (empStudentOldName != null ? empStudentOldName.hashCode() : 0);
        result = 31 * result + (empStudentNameAlphaSpell != null ? empStudentNameAlphaSpell.hashCode() : 0);
        result = 31 * result + (empStudentSex != null ? empStudentSex.hashCode() : 0);
        result = 31 * result + (empStudentMinority != null ? empStudentMinority.hashCode() : 0);
        result = 31 * result + (empStudentLocation != null ? empStudentLocation.hashCode() : 0);
        result = 31 * result + (empStudentPoliticalStatus != null ? empStudentPoliticalStatus.hashCode() : 0);
        result = 31 * result + (empStudentMarry != null ? empStudentMarry.hashCode() : 0);
        result = 31 * result + (empStudentStuLocation != null ? empStudentStuLocation.hashCode() : 0);
        result = 31 * result + (empStudentAddress != null ? empStudentAddress.hashCode() : 0);
        result = 31 * result + (empStudentTel != null ? empStudentTel.hashCode() : 0);
        result = 31 * result + (empStudentPostCode != null ? empStudentPostCode.hashCode() : 0);
        result = 31 * result + (empStudentIdNo != null ? empStudentIdNo.hashCode() : 0);
        result = 31 * result + (empStudentExamNo != null ? empStudentExamNo.hashCode() : 0);
        result = 31 * result + (empStudentExamType != null ? empStudentExamType.hashCode() : 0);
        result = 31 * result + (empStudentEntryStudyDate != null ? empStudentEntryStudyDate.hashCode() : 0);
        result = 31 * result + (empStudentCollege != null ? empStudentCollege.hashCode() : 0);
        result = 31 * result + (empStudentProfession != null ? empStudentProfession.hashCode() : 0);
        result = 31 * result + (empStudentGrade != null ? empStudentGrade.hashCode() : 0);
        result = 31 * result + (empStudentOldProfession != null ? empStudentOldProfession.hashCode() : 0);
        result = 31 * result + (empStudentLevelStudyDate != null ? empStudentLevelStudyDate.hashCode() : 0);
        result = 31 * result + (empStudentEmail != null ? empStudentEmail.hashCode() : 0);
        result = 31 * result + (empStudentDevelopLevel != null ? empStudentDevelopLevel.hashCode() : 0);
        result = 31 * result + (empStudentEntryStudyType != null ? empStudentEntryStudyType.hashCode() : 0);
        result = 31 * result + (empStudentStudyAspect != null ? empStudentStudyAspect.hashCode() : 0);
        result = 31 * result + (empStudentFecture != null ? empStudentFecture.hashCode() : 0);
        result = 31 * result + (empStudentException != null ? empStudentException.hashCode() : 0);
        result = 31 * result + (empStudentRewordsAndPanishments != null ? empStudentRewordsAndPanishments.hashCode() : 0);
        return result;
    }
}
