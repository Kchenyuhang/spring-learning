package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entity.Rank;
import com.soft1851.spring.web.entity.Topic;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
public interface RankDao {
    /**
     * 查询所有
     *
     * @return list<Rank>
     */
    List<Rank> selectAll();

    /**
     * 批量插入
     *
     * @param ranks
     * @return int
     */
    int[] batchInsert(List<Rank> ranks);

    /**
     * 新增一个rank
     *
     * @param rank
     * @return int
     */
    int insert(Rank rank);
}
