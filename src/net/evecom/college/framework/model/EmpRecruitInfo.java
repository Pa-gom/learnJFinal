package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import net.evecom.college.framework.bean.RecruitInfoBean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * Created by Ezreal on 2016/12/7.
 */
public class EmpRecruitInfo extends Model<EmpRecruitInfo> {
    public static final EmpRecruitInfo dao = new EmpRecruitInfo();

    /**
     * 获取招聘信息列表
     * @param pageNum
     * @param pageSize
     * @param typeId
     * @return
     */
    public Page<EmpRecruitInfo> getEmpRecruitInfoList(int pageNum, int pageSize,int typeId){
        return paginate(pageNum,pageSize,"select *","from emp_recruit_info where empRecruitType = "+typeId+" and empRecruitState = 1 order by empRecruitNo desc");
    }

    /**
     * 获取招聘信息列表
     * @return
     */
    public Page<EmpRecruitInfo> getUncheckEmpRecruitInfoList(int pageNum, int pageSize, int typeId) {
        return paginate(pageNum, pageSize, "select *", "from emp_recruit_info where empRecruitType = " + typeId + " and empRecruitState = 0 order by empRecruitNo desc");
    }


    /**
     * 返回招聘信息条数
     * @return
     */
    public int getEmpRecruitInfoCount(int typeId) {
        return dao.find("select * from emp_recruit_info where empRecruitType = " + typeId + " and empRecruitState = 1").size();
    }


    /**
     * 返回待审核招聘信息条数
     *
     * @return
     */
    public int getUnCheckEmpRecruitInfoCount(int typeId) {
        return dao.find("select * from emp_recruit_info where empRecruitType = " + typeId + " and empRecruitState = 0").size();
    }

    /**
     * 返回被驳回的审核招聘信息条数
     *
     * @return
     */
    public int getRefuseRecruitInfoCount() {
        return dao.find("select * from emp_recruit_info where empRecruitState = 2").size();
    }

    /**
     * 获取招聘信息列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page<EmpRecruitInfo> getRefuseRecruitInfoList(int pageNum, int pageSize) {
        return paginate(pageNum, pageSize, "select *", "from emp_recruit_info where empRecruitState = 2 order by empRecruitNo desc");
    }

    /**
     * 获取单条招聘信息
     * @param id
     * @return
     */
    public EmpRecruitInfo getEmpRecruitInfo(String id){
        return dao.findById(id);
    }

    public String getCurrentColumnName(String id){
        String typeId = getEmpRecruitInfo(id).getStr("empRecruitType");
        return EmpRecruitTypeIndex.dao.getEmpRecruitTypeName(typeId);
    }
}
