package net.evecom.college.framework.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class IndexController extends Controller{
    public void index(){
        renderText("The index page which included by tomcat!");
    }
}
