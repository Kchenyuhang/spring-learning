package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entity.Topic;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/26
 */
public interface TopicDao {
    /**
     * 查询所有topic
     *
     * @return list<Topic></>
     */
    List<Topic> selectAll();

    /**
     * 批量插入
     *
     * @param topics
     * @return int[]
     */
    int[] batchInsert(List<Topic> topics);

    /**
     * 新增一个topic
     *
     * @param topic
     * @return int
     */
    int insert(Topic topic);
}

