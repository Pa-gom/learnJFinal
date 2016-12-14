package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

/**
 * Created by Ezreal on 2016/12/12.
 */
public class EmpDownloadInfo extends Model<EmpDownloadInfo> {
    public static final EmpDownloadInfo dao = new EmpDownloadInfo();


    /**
     * 获取下载专区列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page<EmpDownloadInfo> getDownloadInfoList(int pageNum, int pageSize) {
        return paginate(pageNum, pageSize, "select *", "from emp_download_info ");
    }

    /**
     * 根据Id获取下载专区文件内容
     *
     * @param id
     * @return
     */
    public EmpDownloadInfo getDownloadInfo(String id) {
        return dao.findById(id);
    }


    /**
     * 返回信息条数
     *
     * @return
     */
    public int getDownloadInfoCount() {
        return dao.find("select * from emp_download_info").size();
    }
}
