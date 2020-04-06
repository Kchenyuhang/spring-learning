package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.entity.Rank;
import com.soft1851.spring.web.service.RankService;
import com.soft1851.spring.web.spider.BiLiBiLiSpider;
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
public class RankServiceImplTest {
    @Resource
    private RankService rankService;

    @Test
    public void queryAll() {
        List<Rank> ranks = rankService.queryAll();
        ranks.forEach(System.out::println);
    }

    @Test
    public void addRank() {
    }

    @Test
    public void batchInsert() {
        int [] ints=rankService.batchInsert(BiLiBiLiSpider.getRanks());
        assertEquals(BiLiBiLiSpider.getRanks().size(),ints.length);
    }
}