package com.yunzhen.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name:helloworld <br/>
 * Package Name:com.nasus.controller <br/>
 * Date:2019/1/5 13:59 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2019 =======================================================
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello,World!";
    }

}