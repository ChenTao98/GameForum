package com.software.gameforum.jsonBean;

import com.software.gameforum.entity.User;
import com.software.gameforum.utils.PathUtils;

public class UserBean {
    private String username;

    private String phonenum;

    private String email;

    private String headpic;

    public UserBean() {
    }

    public UserBean(User user) {
        if (user != null) {
            this.username = user.getUsername();
            this.phonenum = user.getPhonenum();
            this.email = user.getEmail();
            this.headpic = PathUtils.USER_HEAD_PIC_PATH_HTML + user.getHeadpic();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }
}
