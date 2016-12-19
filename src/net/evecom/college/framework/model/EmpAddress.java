package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import java.util.List;

/**
 * Created by Ezreal on 2016/12/16.
 */
public class EmpAddress extends Model<EmpAddress> {
    public static final EmpAddress dao = new EmpAddress();

    public List<EmpAddress> getProvinceList() {
        return dao.find("select distinct province from emp_address");
    }

    public List<EmpAddress> getCityList(String province) {
        return dao.find("select distinct city from emp_address where province ='" + province + "'");
    }

    public List<EmpAddress> getCountyList(String province, String city) {
        return dao.find("select distinct county from emp_address where province ='" + province + "' and city ='" + city + "'");
    }

    public List<EmpAddress> getStreetList(String province, String city, String county) {
        return dao.find("select distinct street from emp_address where province ='" + province + "' and city ='" + city + "' and county ='" + county + "'");
    }
}
