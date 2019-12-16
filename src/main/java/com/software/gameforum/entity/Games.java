package com.software.gameforum.entity;

import java.io.Serializable;
import java.util.List;

/**
 * games
 *
 * @author
 */
public class Games implements Serializable {
    private Integer id;

    private String url;

    private String gamename;

    private String icon;

    private String introduction;

    private String help;

    private Integer postnum;

    private Integer addone;

    private String addtwo;


    private List<Posts> posts;

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }


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

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
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
        Games other = (Games) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getGamename() == null ? other.getGamename() == null : this.getGamename().equals(other.getGamename()))
                && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
                && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
                && (this.getHelp() == null ? other.getHelp() == null : this.getHelp().equals(other.getHelp()))
                && (this.getPostnum() == null ? other.getPostnum() == null : this.getPostnum().equals(other.getPostnum()))
                && (this.getAddone() == null ? other.getAddone() == null : this.getAddone().equals(other.getAddone()))
                && (this.getAddtwo() == null ? other.getAddtwo() == null : this.getAddtwo().equals(other.getAddtwo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getGamename() == null) ? 0 : getGamename().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getHelp() == null) ? 0 : getHelp().hashCode());
        result = prime * result + ((getPostnum() == null) ? 0 : getPostnum().hashCode());
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
        sb.append(", gamename=").append(gamename);
        sb.append(", icon=").append(icon);
        sb.append(", introduction=").append(introduction);
        sb.append(", help=").append(help);
        sb.append(", postnum=").append(postnum);
        sb.append(", addone=").append(addone);
        sb.append(", addtwo=").append(addtwo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}