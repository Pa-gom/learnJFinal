package net.evecom.college.framework.bean;

/**
 * 用于记录查询条件
 * Created by Ezreal on 2016/12/13.
 */
public class StudentBaseInfoBean {
    /**
     * 学号
     */
    private String stuNo;

    /**
     * 姓名
     */
    private String stuName;
    /**
     * 性别
     */
    private String stuSex;
    /**
     * 民族
     */
    private String stuMinority;

    /**
     * 生源地
     */
    private String stuLocation;

    /**
     * 年级
     */
    private String stuGrade;

    /**
     * 学院
     */
    private String stuCollege;

    /**
     * 专业
     */
    private String stuProfession;

    /**
     * 培养层次
     */
    private String stuDevelopLevel;


    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuMinority() {
        return stuMinority;
    }

    public void setStuMinority(String stuMinority) {
        this.stuMinority = stuMinority;
    }

    public String getStuLocation() {
        return stuLocation;
    }

    public void setStuLocation(String stuLocation) {
        this.stuLocation = stuLocation;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuCollege() {
        return stuCollege;
    }

    public void setStuCollege(String stuCollege) {
        this.stuCollege = stuCollege;
    }

    public String getStuProfession() {
        return stuProfession;
    }

    public void setStuProfession(String stuProfession) {
        this.stuProfession = stuProfession;
    }

    public String getStuDevelopLevel() {
        return stuDevelopLevel;
    }

    public void setStuDevelopLevel(String stuDevelopLevel) {
        this.stuDevelopLevel = stuDevelopLevel;
    }
}
