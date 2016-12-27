package net.evecom.college.framework.model;

import com.jfinal.plugin.activerecord.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ezreal on 2016/12/7.
 */

public class EmpStuffInfo extends Model<EmpStuffInfo> {
    public static final EmpStuffInfo dao = new EmpStuffInfo();
}
