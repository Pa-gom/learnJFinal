package net.evecom.college.framework.controller;

import com.jfinal.core.Controller;
import net.evecom.college.framework.model.EmpRecruitInfo;

/**
 * Created by Ezreal on 2016/12/21.
 */
public class UncheckRecruitInfoController extends Controller {

    /**
     * 校园招聘
     */
    public void school() {
        int currentPage = 1;
        //总页数
        int pageCount = 1;
        if (getPara(0) != null) {
            currentPage = getParaToInt(0);
        }
        //招聘信息条数
        int infoCount = EmpRecruitInfo.dao.getUnCheckEmpRecruitInfoCount(1);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getUncheckEmpRecruitInfoList(currentPage, 30, 1));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/schoolUncheckRecruitInfo.jsp");
    }

    /**
     * 实习招聘
     */
    public void practice() {
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
        int infoCount = EmpRecruitInfo.dao.getUnCheckEmpRecruitInfoCount(2);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getUncheckEmpRecruitInfoList(currentPage, 30, 2));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/practiceUncheckRecruitInfo.jsp");
    }

    /**
     * 网络招聘
     */
    public void network() {
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
        int infoCount = EmpRecruitInfo.dao.getUnCheckEmpRecruitInfoCount(3);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getUncheckEmpRecruitInfoList(currentPage, 30, 3));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/networkUncheckRecruitInfo.jsp");
    }

    /**
     * 通知公告
     */
    public void notice() {
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
        int infoCount = EmpRecruitInfo.dao.getUnCheckEmpRecruitInfoCount(4);
        if (infoCount == 0) {
            pageCount = 0;
        } else if (infoCount % 30 == 0) {
            pageCount = infoCount / 30;
        } else {
            pageCount = infoCount / 30 + 1;
        }
        setAttr("recruitList", EmpRecruitInfo.dao.getUncheckEmpRecruitInfoList(currentPage, 30, 4));
        setAttr("currentPage", currentPage);
        setAttr("pageCount", pageCount);
        renderFreeMarker("/admin/recruit/noticeUncheckRecruitInfo.jsp");
    }


    public void delete() {
        String recruitNo = getPara("recruitNo");
        EmpRecruitInfo.dao.deleteById(recruitNo);
        setAttr("resultCode", "0");
        renderJson();
    }

    public void deleteList() {
        String[] recruitNoList = getPara("recruitNo").split(",");
        for (int i = 0; i < recruitNoList.length; i++) {
            EmpRecruitInfo.dao.deleteById(recruitNoList[i]);
        }
        setAttr("resultCode", "0");//删除成功
        renderJson();
    }
}
