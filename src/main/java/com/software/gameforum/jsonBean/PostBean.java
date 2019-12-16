package com.software.gameforum.jsonBean;

import com.software.gameforum.entity.Posts;
import com.software.gameforum.utils.PathUtils;

import java.util.Date;

public class PostBean {
    private Integer postid;

    private String url;

    private String topic;

    private Date time;

    private String content;

    private Integer msgnum;

    private Integer praisenum;

    private Integer follownum;

    public PostBean() {
    }

    public PostBean(Posts posts) {
        this.postid = posts.getId();
        this.url = PathUtils.POST_URL_PREFIX + postid;
        this.topic = posts.getTopic();
        this.time = posts.getTime();
        this.content = posts.getContent();
        this.msgnum = posts.getMsgnum();
        this.praisenum = posts.getPraisenum();
        this.follownum = posts.getFollownum();
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMsgnum() {
        return msgnum;
    }

    public void setMsgnum(Integer msgnum) {
        this.msgnum = msgnum;
    }

    public Integer getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(Integer praisenum) {
        this.praisenum = praisenum;
    }

    public Integer getFollownum() {
        return follownum;
    }

    public void setFollownum(Integer follownum) {
        this.follownum = follownum;
    }
}