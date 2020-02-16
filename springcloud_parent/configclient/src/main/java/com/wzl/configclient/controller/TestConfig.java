/**
 * Copyright (C), 2020, lywl有限公司
 * FileName: TestConfig
 * Author:   lenovo
 * Date:     2020/2/16 15:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wzl.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author lenovo
 * @create 2020/2/16
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/config")
public class TestConfig {
    @Value("${server.port}")
     private int port;
    @Value("${wzl}")
    private String test;
    @GetMapping(value = "/getport")
    public String getPort(){
        //return "this port == "+port;
        return test;
    }
}
