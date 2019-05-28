package com.yunzhen.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project Name:springboot_lomnok_demo <br/>
 * Package Name:com.nasus.entity <br/>
 * Date:2019/1/23 0023 14:32 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="mailto:chenzy@eastcom-sw.com">chenzy</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2019 =======================================================
 */
@Data //自动生成set/get方法，toString方法，equals方法，hashCode方法，不带参数的构造方法
@AllArgsConstructor //自动生成构造方法
@NoArgsConstructor //自动生成构造方法
public class Student {

    private String id;
    private String name;
    private int age;

}