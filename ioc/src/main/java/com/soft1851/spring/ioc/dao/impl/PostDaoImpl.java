package com.soft1851.spring.ioc.dao.impl;

import com.soft1851.spring.ioc.dao.PostDao;
import com.soft1851.spring.ioc.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
@Repository
public class PostDaoImpl implements PostDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Post post) {
        String sql = "INSERT INTO t_post VALUES (NULL,?,?,?,?,?)";
        Object[] args = {post.getForumId(),post.getTitle(),post.getContent(),post.getThumbnail(),post.getCreateTime()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int[] batchInsert(List<Post> posts) {
        final List<Post> postList = posts;
        String sql = "INSERT INTO t_post VALUES (NULL,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,posts.get(i).getForumId());
                preparedStatement.setString(2,posts.get(i).getTitle());
                preparedStatement.setString(3,posts.get(i).getContent());
                preparedStatement.setBytes(4,posts.get(i).getThumbnail());
                preparedStatement.setTimestamp(5,posts.get(i).getCreateTime());
            }

            @Override
            public int getBatchSize() {
                return postList.size();
            }
        });
    }

    @Override
    public int[] batchDelete(int[] ids) {
        final int[] idList = ids;
        String sql = "DELETE FROM t_post WHERE post_id = ?";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,idList[i]);
            }

            @Override
            public int getBatchSize() {
                return idList.length;
            }
        });
    }

    @Override
    public int delete(int postId) {
        String sql = "DELETE FROM t_post WHERE post_id =?";
        Object[] args = {postId};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public List<Post> selectByWords(String words) {
        String sql = "SELECT * FROM t_post WHERE title LIKE '%"+words+"%' OR content LIKE '%" +words+"%'";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public int countPostByForumId(int forumId) {
        String sql = "SELECT * FROM t_post WHERE forum_id="+forumId;
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Post.class)).size();
    }
}
