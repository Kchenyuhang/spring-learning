package com.soft1851.spring.aop.picture;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/6
 */
public class PictureAdvice {
    public void text(){
        System.out.println("复制前加上水印");
    }
    public void tilt(){
        System.out.println("复制之后会被翻转");
    }
}
