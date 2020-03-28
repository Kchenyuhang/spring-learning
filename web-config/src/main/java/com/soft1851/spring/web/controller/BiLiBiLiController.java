package com.soft1851.spring.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.service.RankService;
import com.soft1851.spring.web.service.TopicService;
import com.soft1851.spring.web.util.ResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
@Controller
@RequestMapping(value = "/B")
public class BiLiBiLiController {

    @Resource
    private RankService rankService;

    @GetMapping(value = "ranks", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getRanks() {
        ResponseObject rs = new ResponseObject(1, "success", rankService.queryAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("/rank")
    public String topic(Model model) {
        model.addAttribute("ranks", rankService.queryAll());
        return "rank";
    }
}
