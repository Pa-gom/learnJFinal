package net.evecom.college.framework.bean;

/**
 * Created by Ezreal on 2016/12/26.
 */
public class ContractInfoBean {
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


    public ContractInfoBean() {

    }

    public ContractInfoBean(String stuNo, String stuName, String stuSex, String stuGrade, String stuCollege, String stuProfession) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuGrade = stuGrade;
        this.stuCollege = stuCollege;
        this.stuProfession = stuProfession;
    }

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

}
