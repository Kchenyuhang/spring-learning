package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Rank;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
public interface RankService {
    /**
     * 查询所有
     *
     * @return
     */
    List<Rank> queryAll();

    /**
     * 新增单个
     *
     * @param rank
     */
    void addRank(Rank rank);

    /**
     * 批量增加
     *
     * @param ranks
     * @return
     */

    int[] batchInsert(List<Rank> ranks);
}
