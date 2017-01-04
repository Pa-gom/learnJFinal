package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;

/**
 * Created by Ezreal on 2017/1/4.
 */
public class ExitController extends Controller {
    public void index() {
        render("/index.jsp");
    }
}
