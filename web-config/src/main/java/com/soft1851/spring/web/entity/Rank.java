package com.soft1851.spring.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rank {
    private  Integer id;
    private  String title;
    private  Integer play;
    private  Integer barrage;
    private  String pic;

}
