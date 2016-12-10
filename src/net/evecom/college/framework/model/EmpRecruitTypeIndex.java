package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */

public class EmpRecruitTypeIndex extends Model<EmpRecruitTypeIndex> {
    public static final EmpRecruitTypeIndex dao = new EmpRecruitTypeIndex();


    /**
     * 根据类型id获取类型名称
     * @param id
     * @return
     */
    public String getEmpRecruitTypeName(String id){
        return dao.findById(id).getStr("empRecruitTypeName");
    }
}
