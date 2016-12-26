package net.evecom.college.framework.mobileController;

import com.jfinal.core.Controller;
import net.evecom.college.framework.model.EmpStudentBaseInfo;

/**
 * Created by Ezreal on 2016/12/24.
 */
public class Login extends Controller {
    public void login() {

        if (EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentNo='" + getPara("user") + "' and empStudentPass='" + getPara("pass") + "'").size() > 0) {
            setAttr("result", "1");
        } else {
            setAttr("result", "2");
        }
        renderJson();
    }

    public void userInfo() {
        EmpStudentBaseInfo baseInfo = EmpStudentBaseInfo.dao.find("select * from emp_student_base_info where empStudentNo='" + getPara(0) + "'").get(0);
        setAttr("info", baseInfo);
        renderJson();
    }
}
