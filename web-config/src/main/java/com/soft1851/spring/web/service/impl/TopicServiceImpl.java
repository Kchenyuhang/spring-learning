package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.dao.TopicDao;
import com.soft1851.spring.web.entity.Topic;
import com.soft1851.spring.web.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yhChen
 * @Description @Transactional(rollbackFor = Exception.class)如果类加了这个注释，那么这个类方法里面的方法抛出异常 就会回滚 数据库里面的数据也会回滚
 * @Date 2020/3/28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicDao topicDao;

    @Override
    public List<Topic> queryAll() {
        return topicDao.selectAll();
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return  topicDao.batchInsert(topics);
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
    }
}
