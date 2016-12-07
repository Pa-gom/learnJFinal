package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_place_apply_info", schema = "fzujob", catalog = "")
public class EmpPlaceApplyInfo {
    private int empPlaceNo;
    private String empPlaceName;
    private String empPlaceCompany;
    private String empPlaceCompanyCode;
    private String empPlacePeoPleName;
    private String empPlaceStartDateTime;
    private String empPlaceEndDateTime;
    private String empPlaceApplyReason;
    private String empPlaceApplyState;

    @Basic
    @Column(name = "empPlaceNo")
    public int getEmpPlaceNo() {
        return empPlaceNo;
    }

    public void setEmpPlaceNo(int empPlaceNo) {
        this.empPlaceNo = empPlaceNo;
    }

    @Basic
    @Column(name = "empPlaceName")
    public String getEmpPlaceName() {
        return empPlaceName;
    }

    public void setEmpPlaceName(String empPlaceName) {
        this.empPlaceName = empPlaceName;
    }

    @Basic
    @Column(name = "empPlaceCompany")
    public String getEmpPlaceCompany() {
        return empPlaceCompany;
    }

    public void setEmpPlaceCompany(String empPlaceCompany) {
        this.empPlaceCompany = empPlaceCompany;
    }

    @Basic
    @Column(name = "empPlaceCompanyCode")
    public String getEmpPlaceCompanyCode() {
        return empPlaceCompanyCode;
    }

    public void setEmpPlaceCompanyCode(String empPlaceCompanyCode) {
        this.empPlaceCompanyCode = empPlaceCompanyCode;
    }

    @Basic
    @Column(name = "empPlacePeoPleName")
    public String getEmpPlacePeoPleName() {
        return empPlacePeoPleName;
    }

    public void setEmpPlacePeoPleName(String empPlacePeoPleName) {
        this.empPlacePeoPleName = empPlacePeoPleName;
    }

    @Basic
    @Column(name = "empPlaceStartDateTime")
    public String getEmpPlaceStartDateTime() {
        return empPlaceStartDateTime;
    }

    public void setEmpPlaceStartDateTime(String empPlaceStartDateTime) {
        this.empPlaceStartDateTime = empPlaceStartDateTime;
    }

    @Basic
    @Column(name = "empPlaceEndDateTime")
    public String getEmpPlaceEndDateTime() {
        return empPlaceEndDateTime;
    }

    public void setEmpPlaceEndDateTime(String empPlaceEndDateTime) {
        this.empPlaceEndDateTime = empPlaceEndDateTime;
    }

    @Basic
    @Column(name = "empPlaceApplyReason")
    public String getEmpPlaceApplyReason() {
        return empPlaceApplyReason;
    }

    public void setEmpPlaceApplyReason(String empPlaceApplyReason) {
        this.empPlaceApplyReason = empPlaceApplyReason;
    }

    @Basic
    @Column(name = "empPlaceApplyState")
    public String getEmpPlaceApplyState() {
        return empPlaceApplyState;
    }

    public void setEmpPlaceApplyState(String empPlaceApplyState) {
        this.empPlaceApplyState = empPlaceApplyState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpPlaceApplyInfo that = (EmpPlaceApplyInfo) o;

        if (empPlaceNo != that.empPlaceNo) return false;
        if (empPlaceName != null ? !empPlaceName.equals(that.empPlaceName) : that.empPlaceName != null) return false;
        if (empPlaceCompany != null ? !empPlaceCompany.equals(that.empPlaceCompany) : that.empPlaceCompany != null)
            return false;
        if (empPlaceCompanyCode != null ? !empPlaceCompanyCode.equals(that.empPlaceCompanyCode) : that.empPlaceCompanyCode != null)
            return false;
        if (empPlacePeoPleName != null ? !empPlacePeoPleName.equals(that.empPlacePeoPleName) : that.empPlacePeoPleName != null)
            return false;
        if (empPlaceStartDateTime != null ? !empPlaceStartDateTime.equals(that.empPlaceStartDateTime) : that.empPlaceStartDateTime != null)
            return false;
        if (empPlaceEndDateTime != null ? !empPlaceEndDateTime.equals(that.empPlaceEndDateTime) : that.empPlaceEndDateTime != null)
            return false;
        if (empPlaceApplyReason != null ? !empPlaceApplyReason.equals(that.empPlaceApplyReason) : that.empPlaceApplyReason != null)
            return false;
        if (empPlaceApplyState != null ? !empPlaceApplyState.equals(that.empPlaceApplyState) : that.empPlaceApplyState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empPlaceNo;
        result = 31 * result + (empPlaceName != null ? empPlaceName.hashCode() : 0);
        result = 31 * result + (empPlaceCompany != null ? empPlaceCompany.hashCode() : 0);
        result = 31 * result + (empPlaceCompanyCode != null ? empPlaceCompanyCode.hashCode() : 0);
        result = 31 * result + (empPlacePeoPleName != null ? empPlacePeoPleName.hashCode() : 0);
        result = 31 * result + (empPlaceStartDateTime != null ? empPlaceStartDateTime.hashCode() : 0);
        result = 31 * result + (empPlaceEndDateTime != null ? empPlaceEndDateTime.hashCode() : 0);
        result = 31 * result + (empPlaceApplyReason != null ? empPlaceApplyReason.hashCode() : 0);
        result = 31 * result + (empPlaceApplyState != null ? empPlaceApplyState.hashCode() : 0);
        return result;
    }
}
