package net.evecom.college.framework.bean;

/**
 * 附件的实体类
 * Created by Ezreal on 2016/12/12.
 */
public class AttachBean {
    //名称
    String name;
    //地址
    String url;

    public AttachBean(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
