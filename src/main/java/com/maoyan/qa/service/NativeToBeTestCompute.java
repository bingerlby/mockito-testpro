/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.maoyan.qa.service;

import com.maoyan.qa.remote.beans.MyNumber;
import com.maoyan.qa.remote.server.RemoteGenNumber;

/**
 * 在这里编写类的功能描述
 *
 * @author binger
 * @created 2018/8/13
 */
public class NativeToBeTestCompute {
    private RemoteGenNumber remoteGenNumber;

    public Integer add() {
        MyNumber myNumber = remoteGenNumber.getNumber();
        Integer num1 = myNumber.getNum1();
        Integer num2 = myNumber.getNum2();
        return num1 + num2;
    }
}
