package com.soft1851.spring.aop.hello;

import org.aopalliance.intercept.Joinpoint;

/**
 * @Author yhChen
 * @Description 前置增强类
 * @Date 2020/4/6
 */
public class BeforeAdvice {
    public void beforeMethod(Joinpoint joinpoint) throws Throwable {
        System.out.println("this is a before method...");
    }
}
