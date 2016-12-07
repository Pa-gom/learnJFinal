package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_jobfair_info", schema = "fzujob", catalog = "")
public class EmpJobfairInfo {
    private int empJobFairNo;
    private String empJobFairTitle;
    private String empJobFairType;
    private String empJobFairContent;
    private String empJobFairDateTime;
    private String empJobFairAttach;
    private String empJobFairPublisher;
    private String empJobFairPublishDateTime;
    private Integer empJobFairHits;
    private Integer empJobFairState;

    @Basic
    @Column(name = "empJobFairNo")
    public int getEmpJobFairNo() {
        return empJobFairNo;
    }

    public void setEmpJobFairNo(int empJobFairNo) {
        this.empJobFairNo = empJobFairNo;
    }

    @Basic
    @Column(name = "empJobFairTitle")
    public String getEmpJobFairTitle() {
        return empJobFairTitle;
    }

    public void setEmpJobFairTitle(String empJobFairTitle) {
        this.empJobFairTitle = empJobFairTitle;
    }

    @Basic
    @Column(name = "empJobFairType")
    public String getEmpJobFairType() {
        return empJobFairType;
    }

    public void setEmpJobFairType(String empJobFairType) {
        this.empJobFairType = empJobFairType;
    }

    @Basic
    @Column(name = "empJobFairContent")
    public String getEmpJobFairContent() {
        return empJobFairContent;
    }

    public void setEmpJobFairContent(String empJobFairContent) {
        this.empJobFairContent = empJobFairContent;
    }

    @Basic
    @Column(name = "empJobFairDateTime")
    public String getEmpJobFairDateTime() {
        return empJobFairDateTime;
    }

    public void setEmpJobFairDateTime(String empJobFairDateTime) {
        this.empJobFairDateTime = empJobFairDateTime;
    }

    @Basic
    @Column(name = "empJobFairAttach")
    public String getEmpJobFairAttach() {
        return empJobFairAttach;
    }

    public void setEmpJobFairAttach(String empJobFairAttach) {
        this.empJobFairAttach = empJobFairAttach;
    }

    @Basic
    @Column(name = "empJobFairPublisher")
    public String getEmpJobFairPublisher() {
        return empJobFairPublisher;
    }

    public void setEmpJobFairPublisher(String empJobFairPublisher) {
        this.empJobFairPublisher = empJobFairPublisher;
    }

    @Basic
    @Column(name = "empJobFairPublishDateTime")
    public String getEmpJobFairPublishDateTime() {
        return empJobFairPublishDateTime;
    }

    public void setEmpJobFairPublishDateTime(String empJobFairPublishDateTime) {
        this.empJobFairPublishDateTime = empJobFairPublishDateTime;
    }

    @Basic
    @Column(name = "empJobFairHits")
    public Integer getEmpJobFairHits() {
        return empJobFairHits;
    }

    public void setEmpJobFairHits(Integer empJobFairHits) {
        this.empJobFairHits = empJobFairHits;
    }

    @Basic
    @Column(name = "empJobFairState")
    public Integer getEmpJobFairState() {
        return empJobFairState;
    }

    public void setEmpJobFairState(Integer empJobFairState) {
        this.empJobFairState = empJobFairState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpJobfairInfo that = (EmpJobfairInfo) o;

        if (empJobFairNo != that.empJobFairNo) return false;
        if (empJobFairTitle != null ? !empJobFairTitle.equals(that.empJobFairTitle) : that.empJobFairTitle != null)
            return false;
        if (empJobFairType != null ? !empJobFairType.equals(that.empJobFairType) : that.empJobFairType != null)
            return false;
        if (empJobFairContent != null ? !empJobFairContent.equals(that.empJobFairContent) : that.empJobFairContent != null)
            return false;
        if (empJobFairDateTime != null ? !empJobFairDateTime.equals(that.empJobFairDateTime) : that.empJobFairDateTime != null)
            return false;
        if (empJobFairAttach != null ? !empJobFairAttach.equals(that.empJobFairAttach) : that.empJobFairAttach != null)
            return false;
        if (empJobFairPublisher != null ? !empJobFairPublisher.equals(that.empJobFairPublisher) : that.empJobFairPublisher != null)
            return false;
        if (empJobFairPublishDateTime != null ? !empJobFairPublishDateTime.equals(that.empJobFairPublishDateTime) : that.empJobFairPublishDateTime != null)
            return false;
        if (empJobFairHits != null ? !empJobFairHits.equals(that.empJobFairHits) : that.empJobFairHits != null)
            return false;
        if (empJobFairState != null ? !empJobFairState.equals(that.empJobFairState) : that.empJobFairState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empJobFairNo;
        result = 31 * result + (empJobFairTitle != null ? empJobFairTitle.hashCode() : 0);
        result = 31 * result + (empJobFairType != null ? empJobFairType.hashCode() : 0);
        result = 31 * result + (empJobFairContent != null ? empJobFairContent.hashCode() : 0);
        result = 31 * result + (empJobFairDateTime != null ? empJobFairDateTime.hashCode() : 0);
        result = 31 * result + (empJobFairAttach != null ? empJobFairAttach.hashCode() : 0);
        result = 31 * result + (empJobFairPublisher != null ? empJobFairPublisher.hashCode() : 0);
        result = 31 * result + (empJobFairPublishDateTime != null ? empJobFairPublishDateTime.hashCode() : 0);
        result = 31 * result + (empJobFairHits != null ? empJobFairHits.hashCode() : 0);
        result = 31 * result + (empJobFairState != null ? empJobFairState.hashCode() : 0);
        return result;
    }
}
