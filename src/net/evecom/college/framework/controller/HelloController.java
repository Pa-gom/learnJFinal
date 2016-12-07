package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class HelloController extends Controller{
    public void index(){
        render("/index.jsp");
        //this.renderText("Welcome to the World of JFinal!");
    }
    public void first(){
        render("/index.jsp");
    }
}
