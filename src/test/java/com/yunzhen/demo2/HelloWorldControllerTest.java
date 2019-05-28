package com.yunzhen.demo2;


import static org.junit.Assert.assertEquals;

import com.yunzhen.demo2.controller.HelloWorldController;
import org.junit.Test;

/**
 * Project Name:helloworld <br/>
 * Package Name:com.nasus <br/>
 * Date:2019/1/5 14:01 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2019 =======================================================
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }

}