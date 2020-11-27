package com.jsgygujun.springbootconfig.service;

import org.springframework.stereotype.Service;

/**
 * @author GuJun
 * @date 2020/11/27
 */
@Service
public class SomeService {
    static {
        System.out.println("创建SomeService");
    }
}
