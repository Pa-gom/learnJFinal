package net.evecom.college.framework.routes;

import com.jfinal.config.Routes;
import net.evecom.college.framework.controller.HelloController;
import net.evecom.college.framework.controller.IndexController;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class AdminRoutes extends Routes {

    @Override
    public void config() {
        add("/", HelloController.class);
    }
}
