package net.evecom.college.framework.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
@Entity
@Table(name = "emp_english_level_index", schema = "fzujob", catalog = "")
public class EmpEnglishLevelIndex {
    private int empEnglishLevelNo;
    private String empEnglishLevelName;

    @Basic
    @Column(name = "empEnglishLevelNo")
    public int getEmpEnglishLevelNo() {
        return empEnglishLevelNo;
    }

    public void setEmpEnglishLevelNo(int empEnglishLevelNo) {
        this.empEnglishLevelNo = empEnglishLevelNo;
    }

    @Basic
    @Column(name = "empEnglishLevelName")
    public String getEmpEnglishLevelName() {
        return empEnglishLevelName;
    }

    public void setEmpEnglishLevelName(String empEnglishLevelName) {
        this.empEnglishLevelName = empEnglishLevelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEnglishLevelIndex that = (EmpEnglishLevelIndex) o;

        if (empEnglishLevelNo != that.empEnglishLevelNo) return false;
        if (empEnglishLevelName != null ? !empEnglishLevelName.equals(that.empEnglishLevelName) : that.empEnglishLevelName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empEnglishLevelNo;
        result = 31 * result + (empEnglishLevelName != null ? empEnglishLevelName.hashCode() : 0);
        return result;
    }
}
