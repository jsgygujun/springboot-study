package com.jsgygujun.springbootconfig.controller;

import org.springframework.stereotype.Controller;

/**
 * @author GuJun
 * @date 2020/11/27
 */
@Controller
public class SomeController {
    static {
        System.out.println("创建SomeController");
    }
}
