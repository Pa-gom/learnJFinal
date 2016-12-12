package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

/**
 * Created by Ezreal on 2016/12/9.
 *
 * 毕业生生源信息表
 */
public class EmpStudentsInfo extends Model<EmpStudentsInfo> {
    public static final EmpStudentsInfo dao =new EmpStudentsInfo();

    public Page<EmpStudentsInfo> getStudentsInfoList(int pageNum,int pageSize,String typeId){
        return paginate(pageNum,pageSize,"select *","from emp_students_info where empType = '"+typeId+"' order by id desc");
    }

    public EmpStudentsInfo getStudentsInfo(String id){
        return dao.findById(id);
    }


    /**
     * 返回信息条数
     *
     * @return
     */
    public int getStudentInfoCount(String typeId) {
        return dao.find("select * from emp_students_info where empType = '" + typeId + "'").size();
    }
}
