package com.software.gameforum.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * message
 * @author 
 */
public class Message implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer postid;

    private Date time;

    private String messagecontent;

    private Integer addone;

    private String addtwo;

    private static final long serialVersionUID = 1L;

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

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public Integer getAddone() {
        return addone;
    }

    public void setAddone(Integer addone) {
        this.addone = addone;
    }

    public String getAddtwo() {
        return addtwo;
    }

    public void setAddtwo(String addtwo) {
        this.addtwo = addtwo;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Message other = (Message) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getPostid() == null ? other.getPostid() == null : this.getPostid().equals(other.getPostid()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getMessagecontent() == null ? other.getMessagecontent() == null : this.getMessagecontent().equals(other.getMessagecontent()))
            && (this.getAddone() == null ? other.getAddone() == null : this.getAddone().equals(other.getAddone()))
            && (this.getAddtwo() == null ? other.getAddtwo() == null : this.getAddtwo().equals(other.getAddtwo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getPostid() == null) ? 0 : getPostid().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getMessagecontent() == null) ? 0 : getMessagecontent().hashCode());
        result = prime * result + ((getAddone() == null) ? 0 : getAddone().hashCode());
        result = prime * result + ((getAddtwo() == null) ? 0 : getAddtwo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", postid=").append(postid);
        sb.append(", time=").append(time);
        sb.append(", messagecontent=").append(messagecontent);
        sb.append(", addone=").append(addone);
        sb.append(", addtwo=").append(addtwo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}