package org.goskyer.domain;

/**
 * Created by zohar on 2017/5/3.
 * desc:
 */
public class Tag {
    private int id;
    private int postId;
    private int tagId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", postId=" + postId +
                ", tagId=" + tagId +
                '}';
    }
}
