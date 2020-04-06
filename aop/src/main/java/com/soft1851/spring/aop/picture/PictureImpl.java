package com.soft1851.spring.aop.picture;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

import java.awt.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/6
 */
public class PictureImpl implements Picture {
    @Override
    public void text() {
        ImgUtil.pressText(
                FileUtil.file("D:\\资源\\pictures\\good.jpg"),
                FileUtil.file("D:\\资源\\pictures\\result1.jpg"),
                "汝何其秀也", Color.WHITE,
                new Font("黑体", Font.BOLD, 100), 0, 0, 0.8f);
    }

    @Override
    public void tilt() {
        ImgUtil.flip(FileUtil.file("D:\\资源\\pictures\\good.jpg"),
                FileUtil.file("D:\\资源\\pictures\\result2.jpg"));
    }
}
