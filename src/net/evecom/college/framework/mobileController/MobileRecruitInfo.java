package net.evecom.college.framework.mobileController;

import com.jfinal.core.Controller;
import net.evecom.college.framework.model.EmpRecruitInfo;

import javax.sound.sampled.Control;

/**
 * Created by Ezreal on 2016/12/25.
 */
public class MobileRecruitInfo extends Controller {
    public void school() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara("college") == null) {
            System.out.print("空");
        } else if (getPara("college").isEmpty()) {
            System.out.print("无");
        }
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getEmpRecruitInfoCount(1);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        System.out.print(EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 1).getList().size());
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 1).getList());
        renderJson();
    }

    public void practice() {
        int currentPage = 1;
        //总页数
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }

        System.out.print(EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 2).getList().size());
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 2).getList());
        renderJson();
    }

    public void network() {
        int currentPage = 1;
        //总页数
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }

        System.out.print(EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 3).getList().size());
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 3).getList());
        renderJson();
    }

    public void notice() {
        int currentPage = 1;
        //总页数
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }

        System.out.print(EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 4).getList().size());
        setAttr("recruitList", EmpRecruitInfo.dao.getEmpRecruitInfoList(currentPage, 10, 4).getList());
        renderJson();
    }

    public void detail() {
        String no = getPara(0);
        setAttr("detail", EmpRecruitInfo.dao.getEmpRecruitInfo(no));
        renderJson();
    }

    public void detailNotice() {
        String no = getPara(0);
        setAttr("detailNotice", EmpRecruitInfo.dao.getEmpRecruitInfo(no));
        renderJson();
    }
}
