package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import java.util.List;

/**
 * Created by Ezreal on 2016/12/16.
 */
public class EmpDevelopLevel extends Model<EmpDevelopLevel> {
    public static final EmpDevelopLevel dao = new EmpDevelopLevel();

    public List<EmpDevelopLevel> getLevelList() {
        return dao.find("select * from emp_develop_level");
    }
}
