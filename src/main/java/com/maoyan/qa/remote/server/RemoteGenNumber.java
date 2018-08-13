/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.maoyan.qa.remote.server;

import com.maoyan.qa.remote.beans.MyNumber;

/**
 * 在这里编写类的功能描述
 *
 * @author binger
 * @created 2018/8/13
 */
public class RemoteGenNumber {

    public MyNumber getNumber() {
        MyNumber myNumber = new MyNumber();
        myNumber.setNum1(1);
        myNumber.setNum2(2);
        return myNumber;
    }
}
