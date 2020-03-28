package com.soft1851.spring.web.spider;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.entity.Rank;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
public class BiLiBiLiSpider {
    private static final Integer SUCCESS = 200;

    public static List<Rank> getRanks() {
        List<Rank> ranks = new ArrayList<>();
        //目标地址
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36";
        String url = "https://www.bilibili.com/ranking/bangumi/13/0/3";
        //创建response对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            Thread.sleep(2000);
            //创建get请求
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent", userAgent);
            //创建context请求
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse response = httpClient.execute(httpGet, context);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == SUCCESS) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String res = EntityUtils.toString(entity);
                    Document document = Jsoup.parse(res);
                    Elements scriptes = document.getElementsByTag("script");
                    String wholeData = scriptes.get(5).html();
                    System.out.println(wholeData);
                    String data = wholeData.substring(wholeData.indexOf("rankList") + 10, wholeData.indexOf(
                            "rankRouteParams") - 2);
                    JSONArray jsonArray = JSONArray.parseArray(data);
                    jsonArray.forEach(o -> {
                        JSONObject json = JSONObject.parseObject(o.toString());
                        Rank rank =
                                Rank.builder()
                                        .title(json.getString("title"))
                                        .play(json.getInteger("play"))
                                        .pic(json.getString("pic"))
                                        .barrage(json.getInteger("video_review"))
                                        .build();
                        ranks.add(rank);
                    });
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return ranks;
    }

    public static void main(String[] args) {
        for (Rank r :
                getRanks()) {
            System.out.println(r);
        }
    }
}
