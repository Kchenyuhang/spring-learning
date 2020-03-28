package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.entity.Topic;
import com.soft1851.spring.web.service.TopicService;
import com.soft1851.spring.web.spider.JueJinSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
//WebAppConfiguration逐季雷默认为webapp目录，需要切换到src/main/resources目录
@WebAppConfiguration("src/main/resources")
public class TopicServiceImplTest {

    @Resource
    private TopicService topicService;

    @Test
    public void queryAll() {
        List<Topic> topics = topicService.queryAll();
        assertEquals(3,topics.size());
//        System.out.println(topicService.queryAll());
    }

    @Test
    public void batchInsert() {
        int[] ints = topicService.batchInsert(JueJinSpider.getTopics());
        assertEquals(JueJinSpider.getTopics().size(),ints.length);
    }

    @Test
    public void addTopic() {
        Topic topic = Topic.builder()
                .id("0001")
                .followed(true)
                .topicName("test")
                .topicIcon("test")
                .description("test")
                .msgCount(14)
                .followersCount(15)
                .build();
        topicService.addTopic(topic);
    }
}