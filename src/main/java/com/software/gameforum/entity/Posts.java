package com.software.gameforum.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * posts
 * @author 
 */
public class Posts implements Serializable {
    private Integer id;

    private String url;

    private String topic;

    private Date time;

    private String content;

    private Integer replynum;

    private Integer addone;

    private String addtwo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getReplynum() {
        return replynum;
    }

    public void setReplynum(Integer replynum) {
        this.replynum = replynum;
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
        Posts other = (Posts) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTopic() == null ? other.getTopic() == null : this.getTopic().equals(other.getTopic()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getReplynum() == null ? other.getReplynum() == null : this.getReplynum().equals(other.getReplynum()))
            && (this.getAddone() == null ? other.getAddone() == null : this.getAddone().equals(other.getAddone()))
            && (this.getAddtwo() == null ? other.getAddtwo() == null : this.getAddtwo().equals(other.getAddtwo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTopic() == null) ? 0 : getTopic().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getReplynum() == null) ? 0 : getReplynum().hashCode());
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
        sb.append(", url=").append(url);
        sb.append(", topic=").append(topic);
        sb.append(", time=").append(time);
        sb.append(", content=").append(content);
        sb.append(", replynum=").append(replynum);
        sb.append(", addone=").append(addone);
        sb.append(", addtwo=").append(addtwo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}