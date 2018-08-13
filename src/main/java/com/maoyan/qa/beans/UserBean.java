package com.maoyan.qa.beans;/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置
 *
 * @author binger
 * @created 2018/8/13
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserBean {
    private String username;
    private String userpass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
}
