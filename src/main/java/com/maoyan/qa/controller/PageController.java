/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.maoyan.qa.controller;

import com.maoyan.qa.beans.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里编写类的功能描述
 *
 * @author binger
 * @created 2018/8/13
 */
@RestController
public class PageController {
    @Autowired
    UserBean userBean;

    @RequestMapping("/index")
    public String index() {
        return "hello " + userBean.getUsername();
    }
}
