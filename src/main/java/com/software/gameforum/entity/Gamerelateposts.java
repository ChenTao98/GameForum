package com.software.gameforum.entity;

import java.io.Serializable;

/**
 * gamerelateposts
 * @author 
 */
public class Gamerelateposts implements Serializable {
    private Integer gameid;

    private Integer postid;

    private static final long serialVersionUID = 1L;

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
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
        Gamerelateposts other = (Gamerelateposts) that;
        return (this.getGameid() == null ? other.getGameid() == null : this.getGameid().equals(other.getGameid()))
            && (this.getPostid() == null ? other.getPostid() == null : this.getPostid().equals(other.getPostid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGameid() == null) ? 0 : getGameid().hashCode());
        result = prime * result + ((getPostid() == null) ? 0 : getPostid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gameid=").append(gameid);
        sb.append(", postid=").append(postid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}