package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;


/**
 * Created by Ezreal on 2016/12/7.
 */

public class EmpJobfairInfo extends Model<EmpJobfairInfo>{
    public static final EmpJobfairInfo dao = new EmpJobfairInfo();

    /**
     * 获取招聘会信息列表
     * @param pageNum
     * @param pageSize
     * @param typeId
     * @return
     */
    public Page<EmpJobfairInfo> getEmpJodFairInfoList(int pageNum, int pageSize, int typeId){
        return paginate(pageNum,pageSize,"select *","from emp_jobfair_info where empJobFairType = "+typeId+" and empJobFairState = 1 order by empJobFairNo desc");// return paginate(pageNum,pageSize,"select *","from emp_recruit_info where empRecruitType = "+typeId+" and empRecruitState = 1 order by empRecruitNo desc");
    }

    public Page<EmpJobfairInfo> getAllEmpJodFairInfoList(int pageNum,int pageSize){
        return paginate(pageNum,pageSize,"select *","from emp_jobfair_info where empJobFairState = 1 order by empJobFairNo desc");// return paginate(pageNum,pageSize,"select *","from emp_recruit_info where empRecruitType = "+typeId+" and empRecruitState = 1 order by empRecruitNo desc");
    }

    /**
     * 根据id获取单条招聘会信息
     * @param id
     * @return
     */
    public EmpJobfairInfo getEmpJobFairInfo(String id){
        return dao.findById(id);
    }

    /**
     * 获取当前所属栏目名称
     * @param id
     * @return
     */
    public String getCurrentColumnName(String id){
        String typeId = getEmpJobFairInfo(id).getStr("empJobFairType");
        return EmpRecruitTypeIndex.dao.getEmpRecruitTypeName(typeId);
    }
}
