package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_place_info", schema = "fzujob", catalog = "")
public class EmpPlaceInfo {
    private int empPlaceNo;
    private String empPlaceName;
    private String empPlaceFatherNo;
    private String empPlaceMinPlace;
    private String empPlaceCapacity;
    private String empPlaceIntroduce;
    private String empPlaceMedia;
    private String empPlaceLecture;
    private String empPlaceMaster;
    private String empPlaceTel;
    private String empPlaceBack;
    private String empPlaceState;

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
    @Column(name = "empPlaceFatherNo")
    public String getEmpPlaceFatherNo() {
        return empPlaceFatherNo;
    }

    public void setEmpPlaceFatherNo(String empPlaceFatherNo) {
        this.empPlaceFatherNo = empPlaceFatherNo;
    }

    @Basic
    @Column(name = "empPlaceMinPlace")
    public String getEmpPlaceMinPlace() {
        return empPlaceMinPlace;
    }

    public void setEmpPlaceMinPlace(String empPlaceMinPlace) {
        this.empPlaceMinPlace = empPlaceMinPlace;
    }

    @Basic
    @Column(name = "empPlaceCapacity")
    public String getEmpPlaceCapacity() {
        return empPlaceCapacity;
    }

    public void setEmpPlaceCapacity(String empPlaceCapacity) {
        this.empPlaceCapacity = empPlaceCapacity;
    }

    @Basic
    @Column(name = "empPlaceIntroduce")
    public String getEmpPlaceIntroduce() {
        return empPlaceIntroduce;
    }

    public void setEmpPlaceIntroduce(String empPlaceIntroduce) {
        this.empPlaceIntroduce = empPlaceIntroduce;
    }

    @Basic
    @Column(name = "empPlaceMedia")
    public String getEmpPlaceMedia() {
        return empPlaceMedia;
    }

    public void setEmpPlaceMedia(String empPlaceMedia) {
        this.empPlaceMedia = empPlaceMedia;
    }

    @Basic
    @Column(name = "empPlaceLecture")
    public String getEmpPlaceLecture() {
        return empPlaceLecture;
    }

    public void setEmpPlaceLecture(String empPlaceLecture) {
        this.empPlaceLecture = empPlaceLecture;
    }

    @Basic
    @Column(name = "empPlaceMaster")
    public String getEmpPlaceMaster() {
        return empPlaceMaster;
    }

    public void setEmpPlaceMaster(String empPlaceMaster) {
        this.empPlaceMaster = empPlaceMaster;
    }

    @Basic
    @Column(name = "empPlaceTel")
    public String getEmpPlaceTel() {
        return empPlaceTel;
    }

    public void setEmpPlaceTel(String empPlaceTel) {
        this.empPlaceTel = empPlaceTel;
    }

    @Basic
    @Column(name = "empPlaceBack")
    public String getEmpPlaceBack() {
        return empPlaceBack;
    }

    public void setEmpPlaceBack(String empPlaceBack) {
        this.empPlaceBack = empPlaceBack;
    }

    @Basic
    @Column(name = "empPlaceState")
    public String getEmpPlaceState() {
        return empPlaceState;
    }

    public void setEmpPlaceState(String empPlaceState) {
        this.empPlaceState = empPlaceState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpPlaceInfo that = (EmpPlaceInfo) o;

        if (empPlaceNo != that.empPlaceNo) return false;
        if (empPlaceName != null ? !empPlaceName.equals(that.empPlaceName) : that.empPlaceName != null) return false;
        if (empPlaceFatherNo != null ? !empPlaceFatherNo.equals(that.empPlaceFatherNo) : that.empPlaceFatherNo != null)
            return false;
        if (empPlaceMinPlace != null ? !empPlaceMinPlace.equals(that.empPlaceMinPlace) : that.empPlaceMinPlace != null)
            return false;
        if (empPlaceCapacity != null ? !empPlaceCapacity.equals(that.empPlaceCapacity) : that.empPlaceCapacity != null)
            return false;
        if (empPlaceIntroduce != null ? !empPlaceIntroduce.equals(that.empPlaceIntroduce) : that.empPlaceIntroduce != null)
            return false;
        if (empPlaceMedia != null ? !empPlaceMedia.equals(that.empPlaceMedia) : that.empPlaceMedia != null)
            return false;
        if (empPlaceLecture != null ? !empPlaceLecture.equals(that.empPlaceLecture) : that.empPlaceLecture != null)
            return false;
        if (empPlaceMaster != null ? !empPlaceMaster.equals(that.empPlaceMaster) : that.empPlaceMaster != null)
            return false;
        if (empPlaceTel != null ? !empPlaceTel.equals(that.empPlaceTel) : that.empPlaceTel != null) return false;
        if (empPlaceBack != null ? !empPlaceBack.equals(that.empPlaceBack) : that.empPlaceBack != null) return false;
        if (empPlaceState != null ? !empPlaceState.equals(that.empPlaceState) : that.empPlaceState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empPlaceNo;
        result = 31 * result + (empPlaceName != null ? empPlaceName.hashCode() : 0);
        result = 31 * result + (empPlaceFatherNo != null ? empPlaceFatherNo.hashCode() : 0);
        result = 31 * result + (empPlaceMinPlace != null ? empPlaceMinPlace.hashCode() : 0);
        result = 31 * result + (empPlaceCapacity != null ? empPlaceCapacity.hashCode() : 0);
        result = 31 * result + (empPlaceIntroduce != null ? empPlaceIntroduce.hashCode() : 0);
        result = 31 * result + (empPlaceMedia != null ? empPlaceMedia.hashCode() : 0);
        result = 31 * result + (empPlaceLecture != null ? empPlaceLecture.hashCode() : 0);
        result = 31 * result + (empPlaceMaster != null ? empPlaceMaster.hashCode() : 0);
        result = 31 * result + (empPlaceTel != null ? empPlaceTel.hashCode() : 0);
        result = 31 * result + (empPlaceBack != null ? empPlaceBack.hashCode() : 0);
        result = 31 * result + (empPlaceState != null ? empPlaceState.hashCode() : 0);
        return result;
    }
}
