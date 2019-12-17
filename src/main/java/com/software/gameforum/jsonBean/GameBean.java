package com.software.gameforum.jsonBean;

import com.software.gameforum.entity.Games;
import com.software.gameforum.entity.Posts;
import com.software.gameforum.utils.PathUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameBean {
    private Integer gameid;

    private String url;

    private String gamename;

    private String icon;

    private String introduction;

    private String help;

    private Integer postnum;

    private List<PostBean> related_posts;

    public GameBean() {
    }

    public GameBean(Games games) {
        if (games != null) {
            this.gameid = games.getId();
            this.url = games.getUrl();
            this.gamename = games.getGamename();
            this.icon = PathUtils.GAME_ICON_PATH_HTML + games.getIcon();
            this.introduction = games.getIntroduction();
            this.help = games.getHelp();
            this.postnum = games.getPostnum();
            List<Posts> postsList = games.getPosts();
            if (postsList != null && postsList.size() != 0) {
                this.related_posts = new ArrayList<>();
                for (Posts posts : postsList) {
                    related_posts.add(new PostBean(posts));
                }
            }
        }
    }

    public GameBean(Games games, Map<Integer, PostBean> map, Integer nPost) {
        this.gameid = games.getId();
        this.url = games.getUrl();
        this.gamename = games.getGamename();
        this.icon = PathUtils.GAME_ICON_PATH_HTML + games.getIcon();
        this.introduction = games.getIntroduction();
        this.help = games.getHelp();
        this.postnum = games.getPostnum();
        List<Posts> postsList = games.getPosts();
        if (postsList != null && postsList.size() != 0) {
            this.related_posts = new ArrayList<>();
            int endIndex = nPost == null ? postsList.size() : Math.min(nPost, postsList.size());
            for (int i = 0; i < endIndex; i++) {
                PostBean postBean = new PostBean(postsList.get(i));
                related_posts.add(postBean);
                if (map != null) {
                    map.put(postBean.getPostid(), postBean);
                }
            }
        }
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
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

    public List<PostBean> getRelated_posts() {
        return related_posts;
    }

    public void setRelated_posts(List<PostBean> related_posts) {
        this.related_posts = related_posts;
    }
}
