package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import java.util.List;

/**
 * Created by Ezreal on 2016/12/7.
 */

public class EmpProfessionIndex extends Model<EmpProfessionIndex> {
    public static final EmpProfessionIndex dao = new EmpProfessionIndex();

    /**
     * 获取学院列表
     */
    public List<EmpProfessionIndex> getCollegeList() {
        return dao.find("select  distinct empCollegeName from emp_profession_index");
    }

    /**
     * 根据学院名称获取专业列表
     */
    public List<EmpProfessionIndex> getProfessionListByCollegeName(String college) {
        return dao.find("select * from emp_profession_index where empCollegeName ='" + college + "'");
    }
}
