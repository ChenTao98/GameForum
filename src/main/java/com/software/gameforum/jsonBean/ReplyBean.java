package com.software.gameforum.jsonBean;

import com.software.gameforum.entity.Reply;
import com.software.gameforum.utils.PathUtils;

import java.util.Date;

public class ReplyBean {
    private Integer id;
    private Integer userid;
    private String username;
    private String headpic;
    private Date time;
    private String content;
    private Integer messageid;

    public ReplyBean(Reply reply) {
        if (reply != null) {
            this.id = reply.getId();
            this.userid = reply.getUserid();
            this.username = reply.getUsername();
            this.headpic = PathUtils.USER_HEAD_PIC_PATH_HTML + reply.getHeadpic();
            this.time = reply.getTime();
            this.content = reply.getReplycontent();
            this.messageid = reply.getMessageid();
        }
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

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public ReplyBean() {

    }
}
