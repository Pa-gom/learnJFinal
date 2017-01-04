package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.StudentBaseInfoBean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

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
        String sql = "from emp_student_base_info where 1=1 ";//避免后续判断何时加入where
        if (condition.getStuNo() != null && !condition.getStuNo().isEmpty()) {
            sql += " and empStudentNo like '%" + condition.getStuNo() + "%'";
        }
        if (condition.getStuName() != null && !condition.getStuName().isEmpty()) {
            sql += " and empStudentName like '%" + condition.getStuName() + "%'";
        }
        if (condition.getStuSex() != null && !condition.getStuSex().isEmpty()) {
            sql += " and empStudentSex like '%" + condition.getStuSex() + "%'";
        }
        if (condition.getStuMinority() != null && !condition.getStuMinority().isEmpty()) {
            sql += " and empStudentMinority like '%" + condition.getStuMinority() + "%'";
        }
        if (condition.getStuLocation() != null && !condition.getStuLocation().isEmpty()) {
            sql += " and empStudentLocation like '%" + condition.getStuLocation() + "%'";
        }
        if (condition.getStuGrade() != null && !condition.getStuGrade().isEmpty()) {
            sql += " and empStudentGrade like '%" + condition.getStuGrade() + "%'";
        }
        if (condition.getStuCollege() != null && !condition.getStuCollege().isEmpty()) {
            sql += " and empStudentCollege like '%" + condition.getStuCollege() + "%'";
        }
        if (condition.getStuProfession() != null && !condition.getStuProfession().isEmpty()) {
            sql += " and empStudentProfession like '%" + condition.getStuProfession() + "%'";
        }
        if (condition.getStuDevelopLevel() != null && !condition.getStuDevelopLevel().isEmpty()) {
            sql += " and empStudentDevelopLevel like '%" + condition.getStuDevelopLevel() + "%'";
        }
        System.out.print(sql);
        return paginate(pageNum, pageSize, "select * ", sql);
    }

    /**
     * 获得符合条件的学生信息条数
     *
     * @param condition
     * @return
     */
    public int getStudentCount(StudentBaseInfoBean condition) {
        String sql = "select * from emp_student_base_info where 1=1 ";//避免后续判断何时加入where
        if (condition.getStuNo() != null && !condition.getStuNo().isEmpty()) {
            sql += " and empStudentNo like '%" + condition.getStuNo() + "%'";
        }
        if (condition.getStuName() != null && !condition.getStuName().isEmpty()) {
            sql += " and empStudentName like '%" + condition.getStuName() + "%'";
        }
        if (condition.getStuSex() != null && !condition.getStuSex().isEmpty()) {
            sql += " and empStudentSex like '%" + condition.getStuSex() + "%'";
        }
        if (condition.getStuMinority() != null && !condition.getStuMinority().isEmpty()) {
            sql += " and empStudentMinority like '%" + condition.getStuMinority() + "%'";
        }
        if (condition.getStuLocation() != null && !condition.getStuLocation().isEmpty()) {
            sql += " and empStudentLocation like '%" + condition.getStuLocation() + "%'";
        }
        if (condition.getStuGrade() != null && !condition.getStuGrade().isEmpty()) {
            sql += " and empStudentGrade like '%" + condition.getStuGrade() + "%'";
        }
        if (condition.getStuCollege() != null && !condition.getStuCollege().isEmpty()) {
            sql += " and empStudentCollege like '%" + condition.getStuCollege() + "%'";
        }
        if (condition.getStuProfession() != null && !condition.getStuProfession().isEmpty()) {
            sql += " and empStudentProfession like '%" + condition.getStuProfession() + "%'";
        }
        if (condition.getStuDevelopLevel() != null && !condition.getStuDevelopLevel().isEmpty()) {
            sql += " and empStudentDevelopLevel like '%" + condition.getStuDevelopLevel() + "%'";
        }

        return dao.find(sql).size();
    }

    public String saveExcelList(ArrayList<String[]> list) {
        EmpStudentBaseInfo info = null;
        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i);
            info = new EmpStudentBaseInfo();
            info.set("empStudentNo", str[0]);
            info.set("empStudentPass", str[1]);
            info.set("empStudentName", str[2]);
            info.set("empStudentHeadIcon", str[3]);
            info.set("empStudentOldName", str[4]);
            info.set("empStudentNameAlphaSpell", str[5]);
            info.set("empStudentSex", str[6]);
            info.set("empStudentMinority", str[7]);
            info.set("empStudentLocation", str[8]);
            info.set("empStudentPoliticalStatus", str[9]);
            info.set("empStudentMarry", str[10]);
            info.set("empStudentStuLocation", str[11]);
            info.set("empStudentAddress", str[12]);
            info.set("empStudentTel", str[13]);
            info.set("empStudentPostCode", str[14]);
            info.set("empStudentIdNo", str[15]);
            info.set("empStudentExamNo", str[16]);
            info.set("empStudentExamType", str[17]);
            info.set("empStudentEntryStudyDate", str[18]);
            info.set("empStudentCollege", str[19]);
            info.set("empStudentProfession", str[20]);
            info.set("empStudentGrade", str[21]);
            info.set("empStudentOldProfession", str[22]);
            info.set("empStudentLevelStudyDate", str[23]);
            info.set("empStudentEmail", str[24]);
            info.set("empStudentDevelopLevel", str[25]);
            info.set("empStudentEntryStudyType", str[26]);
            info.set("empStudentStudyAspect", str[27]);
            info.save();
        }
        return "success";
    }

}
