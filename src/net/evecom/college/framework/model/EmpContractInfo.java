package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.ContractInfoBean;
import net.evecom.college.framework.bean.StudentBaseInfoBean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */
public class EmpContractInfo extends Model<EmpContractInfo> {
    public static final EmpContractInfo dao = new EmpContractInfo();

    /**
     * 获得签约列表
     *
     * @param pageNum
     * @param pageSize
     * @param condition
     * @return
     */

    public Page<EmpContractInfo> getContractList(int pageNum, int pageSize, ContractInfoBean condition) {
        String sql = "from emp_contract_info where 1=1 ";//避免后续判断何时加入where
        if (condition.getStuNo() != null && !condition.getStuNo().isEmpty()) {
            sql += " and empContractStudentNo like '%" + condition.getStuNo() + "%'";
        }
        if (condition.getStuName() != null && !condition.getStuName().isEmpty()) {
            sql += " and empContractStudentName like '%" + condition.getStuName() + "%'";
        }
        if (condition.getStuSex() != null && !condition.getStuSex().isEmpty()) {
            sql += " and empContractStudentSex like '%" + condition.getStuSex() + "%'";
        }
        if (condition.getStuGrade() != null && !condition.getStuGrade().isEmpty()) {
            sql += " and empContractStudentGrade like '%" + condition.getStuGrade() + "%'";
        }
        if (condition.getStuCollege() != null && !condition.getStuCollege().isEmpty()) {
            sql += " and empContractStudentCollege like '%" + condition.getStuCollege() + "%'";
        }
        if (condition.getStuProfession() != null && !condition.getStuProfession().isEmpty()) {
            sql += " and empContractStudentProfession like '%" + condition.getStuProfession() + "%'";
        }
        return paginate(pageNum, pageSize, "select * ", sql + "order by empContractNo desc");
    }

    /**
     * 获得符合条件的签约信息条数
     *
     * @param condition
     * @return
     */
    public int getContractCount(ContractInfoBean condition) {
        String sql = "select * from emp_contract_info where 1=1 ";//避免后续判断何时加入where
        if (condition.getStuNo() != null && !condition.getStuNo().isEmpty()) {
            sql += " and empContractStudentNo like '%" + condition.getStuNo() + "%'";
        }
        if (condition.getStuName() != null && !condition.getStuName().isEmpty()) {
            sql += " and empContractStudentName like '%" + condition.getStuName() + "%'";
        }
        if (condition.getStuSex() != null && !condition.getStuSex().isEmpty()) {
            sql += " and empContractStudentSex like '%" + condition.getStuSex() + "%'";
        }
        if (condition.getStuGrade() != null && !condition.getStuGrade().isEmpty()) {
            sql += " and empContractStudentGrade like '%" + condition.getStuGrade() + "%'";
        }
        if (condition.getStuCollege() != null && !condition.getStuCollege().isEmpty()) {
            sql += " and empContractStudentCollege like '%" + condition.getStuCollege() + "%'";
        }
        if (condition.getStuProfession() != null && !condition.getStuProfession().isEmpty()) {
            sql += " and empContractStudentProfession like '%" + condition.getStuProfession() + "%'";
        }
        return dao.find(sql).size();
    }
}
