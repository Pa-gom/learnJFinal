package net.evecom.college.framework.config;

import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import net.evecom.college.framework.controller.HelloController;
import net.evecom.college.framework.controller.IndexController;
import net.evecom.college.framework.model.EmpCollegeIndex;
import net.evecom.college.framework.model.EmpRecruitInfo;
import net.evecom.college.framework.model.User;
import net.evecom.college.framework.routes.AdminRoutes;
import net.evecom.college.framework.routes.FrontRoutes;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class BaseConfig extends JFinalConfig{
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType.JSP);
        //me.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/",IndexController.class);
        //me.add(new FrontRoutes());
    }

    @Override
    public void configPlugin(Plugins me) {
        loadPropertyFile("a_little_config.txt");
        C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"),  getProperty("user"), getProperty("password"));
        me.add(c3p0Plugin);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
        me.add(arp);
        arp.addMapping("emp_college_index","empCollegeNo", User.class);
        arp.addMapping("emp_recruit_info", "empRecruitNo", EmpRecruitInfo.class);
    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("basePath"));
    }
}
