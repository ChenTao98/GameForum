package com.software.gameforum.jsonBean;

import com.software.gameforum.entity.Message;
import com.software.gameforum.utils.PathUtils;

import java.util.Date;

public class MessageBean {
    private Integer id;
    private Integer userid;
    private String username;
    private String headpic;
    private Date time;
    private String content;
    private Integer postid;

    public MessageBean(Message message) {
        if (message != null) {
            this.id = message.getId();
            this.userid = message.getUserid();
            this.username = message.getUsername();
            this.headpic = PathUtils.USER_HEAD_PIC_PATH_HTML + message.getHeadpic();
            this.time = message.getTime();
            this.content = message.getMessagecontent();
            this.postid = message.getPostid();
        }
    }

    public MessageBean() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
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

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }
}
