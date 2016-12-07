package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import net.evecom.college.framework.model.EmpRecruitInfo;

/**
 * Created by Ezreal on 2016/11/25.
 */
public class IndexController extends Controller{

    /**
     * 初始化首页的数据
     */
    public void index(){
        System.out.print(EmpRecruitInfo.dao.getEmpRecruitInfoList(getParaToInt(0,1),10).getList().size()+"");
        setAttr("schoolList", EmpRecruitInfo.dao.getEmpRecruitInfoList(getParaToInt(0,1),10));
        renderFreeMarker("/index.jsp");
        //this.renderText("Welcome to the World of JFinal!");
    }

    /**
     * 根据用户点击的文章跳转到详情页面展示内容
     */
    public void detail(){

        render("/content.jsp");
    }
}
