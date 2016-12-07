package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_stuff_info", schema = "fzujob", catalog = "")
public class EmpStuffInfo {
    private int empStuffNo;
    private String empStuffPass;
    private String empStuffName;
    private String empStuffSex;
    private String empStuffBirthDate;
    private String empStuffPost;
    private String empStuffGegree;
    private String empStuffStuffState;

    @Basic
    @Column(name = "empStuffNo")
    public int getEmpStuffNo() {
        return empStuffNo;
    }

    public void setEmpStuffNo(int empStuffNo) {
        this.empStuffNo = empStuffNo;
    }

    @Basic
    @Column(name = "empStuffPass")
    public String getEmpStuffPass() {
        return empStuffPass;
    }

    public void setEmpStuffPass(String empStuffPass) {
        this.empStuffPass = empStuffPass;
    }

    @Basic
    @Column(name = "empStuffName")
    public String getEmpStuffName() {
        return empStuffName;
    }

    public void setEmpStuffName(String empStuffName) {
        this.empStuffName = empStuffName;
    }

    @Basic
    @Column(name = "empStuffSex")
    public String getEmpStuffSex() {
        return empStuffSex;
    }

    public void setEmpStuffSex(String empStuffSex) {
        this.empStuffSex = empStuffSex;
    }

    @Basic
    @Column(name = "empStuffBirthDate")
    public String getEmpStuffBirthDate() {
        return empStuffBirthDate;
    }

    public void setEmpStuffBirthDate(String empStuffBirthDate) {
        this.empStuffBirthDate = empStuffBirthDate;
    }

    @Basic
    @Column(name = "empStuffPost")
    public String getEmpStuffPost() {
        return empStuffPost;
    }

    public void setEmpStuffPost(String empStuffPost) {
        this.empStuffPost = empStuffPost;
    }

    @Basic
    @Column(name = "empStuffGegree")
    public String getEmpStuffGegree() {
        return empStuffGegree;
    }

    public void setEmpStuffGegree(String empStuffGegree) {
        this.empStuffGegree = empStuffGegree;
    }

    @Basic
    @Column(name = "empStuffStuffState")
    public String getEmpStuffStuffState() {
        return empStuffStuffState;
    }

    public void setEmpStuffStuffState(String empStuffStuffState) {
        this.empStuffStuffState = empStuffStuffState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpStuffInfo that = (EmpStuffInfo) o;

        if (empStuffNo != that.empStuffNo) return false;
        if (empStuffPass != null ? !empStuffPass.equals(that.empStuffPass) : that.empStuffPass != null) return false;
        if (empStuffName != null ? !empStuffName.equals(that.empStuffName) : that.empStuffName != null) return false;
        if (empStuffSex != null ? !empStuffSex.equals(that.empStuffSex) : that.empStuffSex != null) return false;
        if (empStuffBirthDate != null ? !empStuffBirthDate.equals(that.empStuffBirthDate) : that.empStuffBirthDate != null)
            return false;
        if (empStuffPost != null ? !empStuffPost.equals(that.empStuffPost) : that.empStuffPost != null) return false;
        if (empStuffGegree != null ? !empStuffGegree.equals(that.empStuffGegree) : that.empStuffGegree != null)
            return false;
        if (empStuffStuffState != null ? !empStuffStuffState.equals(that.empStuffStuffState) : that.empStuffStuffState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empStuffNo;
        result = 31 * result + (empStuffPass != null ? empStuffPass.hashCode() : 0);
        result = 31 * result + (empStuffName != null ? empStuffName.hashCode() : 0);
        result = 31 * result + (empStuffSex != null ? empStuffSex.hashCode() : 0);
        result = 31 * result + (empStuffBirthDate != null ? empStuffBirthDate.hashCode() : 0);
        result = 31 * result + (empStuffPost != null ? empStuffPost.hashCode() : 0);
        result = 31 * result + (empStuffGegree != null ? empStuffGegree.hashCode() : 0);
        result = 31 * result + (empStuffStuffState != null ? empStuffStuffState.hashCode() : 0);
        return result;
    }
}
