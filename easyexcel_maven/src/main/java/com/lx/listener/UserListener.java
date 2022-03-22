package com.lx.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.lx.pojo.User;

public class UserListener extends AnalysisEventListener<User> {

    /*
    * User data:每次读取到的数据封装的对象。
    * */
    @Override
    public void invoke(User data, AnalysisContext context) {
        System.out.println(data.toString());
    }

    /*
    * 读取完整个文档之后调用的方法。
    * */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
