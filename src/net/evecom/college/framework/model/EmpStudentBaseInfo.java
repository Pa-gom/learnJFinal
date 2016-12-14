package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.StudentBaseInfoBean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
public class EmpStudentBaseInfo extends Model<EmpStudentBaseInfo> {
    public static final EmpStudentBaseInfo dao = new EmpStudentBaseInfo();

    /**
     * 获取学生基本信息列表
     *
     * @param pageNum
     * @param pageSize
     * @param condition
     * @return
     */
    public Page<EmpStudentBaseInfo> getStudentList(int pageNum, int pageSize, StudentBaseInfoBean condition) {
        String sql = "from emp_student_base_info where 1=1";//避免后续判断何时加入where
        if (condition.getStuNo() != null) {
            sql += "and empStudentNo = '" + condition.getStuNo() + "'";
        } else if (condition.getStuName() != null) {
            sql += "and empStudentName = '" + condition.getStuName() + "'";
        } else if (condition.getStuSex() != null) {
            sql += "and empStudentSex = '" + condition.getStuSex() + "'";
        } else if (condition.getStuMinority() != null) {
            sql += "and empStudentMinority = '" + condition.getStuMinority() + "'";
        } else if (condition.getStuLocation() != null) {
            sql += "and empStudentLocation = '" + condition.getStuLocation() + "'";
        } else if (condition.getStuGrade() != null) {
            sql += "and empStudentGrade = '" + condition.getStuGrade() + "'";
        } else if (condition.getStuCollege() != null) {
            sql += "and empStudentCollege = '" + condition.getStuCollege() + "'";
        } else if (condition.getStuProfession() != null) {
            sql += "and empStudentProfession = '" + condition.getStuProfession() + "'";
        } else if (condition.getStuDevelopLevel() != null) {
            sql += "and empStudentDevelopLevel = '" + condition.getStuDevelopLevel() + "'";
        }

        return paginate(pageNum, pageSize, "select *",sql);
    }

    /**
     * 获得符合条件的学生信息条数
     *
     * @param condition
     * @return
     */
    public int getStudentCount(StudentBaseInfoBean condition) {
        String sql = "select * from emp_student_base_info where 1=1";//避免后续判断何时加入where
        if (condition.getStuNo() != null) {
            sql += "and empStudentNo = '" + condition.getStuNo() + "'";
        } else if (condition.getStuName() != null) {
            sql += "and empStudentName = '" + condition.getStuName() + "'";
        } else if (condition.getStuSex() != null) {
            sql += "and empStudentSex = '" + condition.getStuSex() + "'";
        } else if (condition.getStuMinority() != null) {
            sql += "and empStudentMinority = '" + condition.getStuMinority() + "'";
        } else if (condition.getStuLocation() != null) {
            sql += "and empStudentLocation = '" + condition.getStuLocation() + "'";
        } else if (condition.getStuGrade() != null) {
            sql += "and empStudentGrade = '" + condition.getStuGrade() + "'";
        } else if (condition.getStuCollege() != null) {
            sql += "and empStudentCollege = '" + condition.getStuCollege() + "'";
        } else if (condition.getStuProfession() != null) {
            sql += "and empStudentProfession = '" + condition.getStuProfession() + "'";
        } else if (condition.getStuDevelopLevel() != null) {
            sql += "and empStudentDevelopLevel = '" + condition.getStuDevelopLevel() + "'";
        }

        return dao.find(sql).size();
    }
}
