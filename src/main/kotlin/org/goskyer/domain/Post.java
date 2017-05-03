package org.goskyer.domain;

import java.util.List;

/**
 * Created by zohar on 2017/4/14.
 * desc:
 */
public class Post {
    private long postId;
    private String title;
    private long authId;
    private String md;
    private UserInfo user;
    private List<Tag> tags;


    public Post() {
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getAuthId() {
        return authId;
    }

    public void setAuthId(long authId) {
        this.authId = authId;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }


    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", authId=" + authId +
                ", md='" + md + '\'' +
                ", user=" + user +
                ", tags=" + tags +
                '}';
    }
}
