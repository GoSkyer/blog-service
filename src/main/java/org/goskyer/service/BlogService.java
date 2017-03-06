package org.goskyer.service;

public interface BlogService {

    /**
     * 创建博文
     *
     * @param title
     * @param content
     */
    void createBlog(String authorId, String author, String title, String content);

    /**
     * 修改博文
     *
     * @param id
     * @param blogId
     * @param title
     * @param content
     */
    void updateBlog(String id, String blogId, String title, String content);

    /**
     * 删除博文
     *
     * @param id
     * @param blogId
     */
    void deleteBlog(String id, String blogId);

    /**
     * 获取博文
     *
     * @param blogId
     */
    void findBlog(String blogId);

    /**
     * 增加博文浏览次数
     *
     * @param blogId
     */
    void addViewCount(String blogId);

    /**
     * 增加博文赞同次数
     *
     * @param blogId
     */
    void addApproveCount(String blogId);

    /**
     * @param blogId        博文id
     * @param commentBodyId 评论人id
     * @param toBodyId      需要@的人id
     * @param commentMsg    评论内容
     */
    void addComment(String blogId, String commentBodyId, String toBodyId, String commentMsg);

    /**
     * 删除评论
     *
     * @param blogId 博文id
     * @param bodyId 操作人id
     */
    void deleteComment(String blogId, String bodyId);

}
