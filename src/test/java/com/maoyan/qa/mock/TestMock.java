/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.maoyan.qa.mock;

import com.maoyan.qa.service.NativeToBeTestCompute;
import com.maoyan.qa.remote.beans.MyNumber;
import com.maoyan.qa.remote.server.RemoteGenNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

/**
 * 1.定义mock实现
 * 2.将RemoteGenNumber注入NativeToBeTestCompute中
 * 3.定义when-then-return：构造假的返回值
 * 4.调用NativeToBeTestCompute的方法
 * 5.必须使用MockitoAnnotations.initMocks(this);或@RunWith(MockitoJUnitRunner.class)进行初始化
 *
 * @author binger
 * @created 2018/8/13
 */
@RunWith(MockitoJUnitRunner.class)
public class TestMock {
    @Mock
    public RemoteGenNumber remoteGenNumber;//定义mock实现

    @InjectMocks
    public NativeToBeTestCompute nativeToBeTestCompute;

    @Test
    public void when_thenReturn(){
        MyNumber myNumber = new MyNumber();
        myNumber.setNum1(3);
        myNumber.setNum2(4);

        when(remoteGenNumber.getNumber()).thenReturn(myNumber);

        Integer sum = nativeToBeTestCompute.add();
        System.out.println(sum);

        assertThat(sum, is(7));
    }
}
