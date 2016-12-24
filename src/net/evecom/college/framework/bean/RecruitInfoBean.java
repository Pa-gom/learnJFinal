package net.evecom.college.framework.bean;

/**
 * 招聘信息查询实体类
 * Created by Ezreal on 2016/12/20.
 */
public class RecruitInfoBean {

    public String title;
    public String recruitDate;
    public String publisher;
    public String publishDate;
    public String type;

    public RecruitInfoBean() {

    }

    public RecruitInfoBean(String title, String recruitDate, String publisher, String publishDate, String type) {
        this.title = title;
        this.recruitDate = recruitDate;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecruitDate() {
        return recruitDate;
    }

    public void setRecruitDate(String recruitDate) {
        this.recruitDate = recruitDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
