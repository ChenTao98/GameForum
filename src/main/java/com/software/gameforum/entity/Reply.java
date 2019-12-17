package com.software.gameforum.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * reply
 * @author 
 */
public class Reply implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer messageid;

    private Date time;

    private String replycontent;

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

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
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
        Reply other = (Reply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getMessageid() == null ? other.getMessageid() == null : this.getMessageid().equals(other.getMessageid()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getReplycontent() == null ? other.getReplycontent() == null : this.getReplycontent().equals(other.getReplycontent()))
            && (this.getAddone() == null ? other.getAddone() == null : this.getAddone().equals(other.getAddone()))
            && (this.getAddtwo() == null ? other.getAddtwo() == null : this.getAddtwo().equals(other.getAddtwo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getMessageid() == null) ? 0 : getMessageid().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getReplycontent() == null) ? 0 : getReplycontent().hashCode());
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
        sb.append(", messageid=").append(messageid);
        sb.append(", time=").append(time);
        sb.append(", replycontent=").append(replycontent);
        sb.append(", addone=").append(addone);
        sb.append(", addtwo=").append(addtwo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}