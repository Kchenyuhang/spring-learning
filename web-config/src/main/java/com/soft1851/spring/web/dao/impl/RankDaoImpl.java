package com.soft1851.spring.web.dao.impl;

import com.soft1851.spring.web.dao.RankDao;
import com.soft1851.spring.web.entity.Rank;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
@Repository
public class RankDaoImpl implements RankDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Rank> selectAll() {
        String sql = "SELECT * FROM t_rank";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Rank.class));
    }

    @Override
    public int[] batchInsert(List<Rank> ranks) {
        final List<Rank> rankList = ranks;
        String sql = "INSERT INTO t_rank(title, paly, barrage, pic) VALUES (?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                Rank rank = rankList.get(i);
                preparedStatement.setString(1, rank.getTitle());
                preparedStatement.setInt(2, rank.getPlay());
                preparedStatement.setInt(3, rank.getBarrage());
                preparedStatement.setString(4, rank.getPic());
            }

            @Override
            public int getBatchSize() {
                return rankList.size();
            }
        });
    }

    @Override
    public int insert(Rank rank) {
        return 0;
    }
}
