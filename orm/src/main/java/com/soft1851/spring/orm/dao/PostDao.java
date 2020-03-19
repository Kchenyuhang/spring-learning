package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.entity.Post;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public interface PostDao {
    /**
     * 新增Post
     * @param post
     * @return int
     */
    int insert(Post post);

    /**
     * 批量新增Post
     * @param posts
     * @return int[]
     */
    int[] batchInsert(List<Post> posts);

    /**
     * 批量删除Post
     * @param ids
     * @return int[]
     */
    int[] batchDelete(int[] ids);

    /**
     * 根据id删除Post
     * @param postId
     * @return int
     */
    int delete(int postId);

    /**
     * 模糊查询Post
     * @param words
     * @return
     */
    List<Post> selectByWords(String words);

    /**
     * 根据论坛id查询改论坛所拥有的贴子数
     * @param forumId
     * @return
     */
    int countPostByForumId(int forumId);
}
