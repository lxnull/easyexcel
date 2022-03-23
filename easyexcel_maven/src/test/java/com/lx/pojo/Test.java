package com.lx.pojo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.lx.listener.UserListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    static String PATH = "G:\\JavaSpace\\Java进阶\\easyexcel\\";

    @org.junit.Test
    public void test() {
        /*
         * Params:
         * file – 要读的文件的路径。
         * head – 配置excel每行文件导入的类
         * readListener – 读监听器，每读一行内容，都会调用一次该对象的invoke()，invoke()可以操作使用读取的的数据
         * Returns:
         * Excel reader builder.
         */
        // 获取工作簿对象
        ExcelReaderBuilder workbook = EasyExcel.read(PATH + "a.xlsx", User.class, new UserListener());
        // 获取工作表
        ExcelReaderSheetBuilder sheet = workbook.sheet();
        // 读取工作表中的内容
        sheet.doRead();
    }

    @org.junit.Test
    public void testWrite() {
        /*
         * Build excel the write 创建工作簿
         * Params:
         * file – 要写入的文件路径
         * head – 写入要导入excel的类的.class文件
         * Returns:
         * Excel writer builder
         * * */
        ExcelWriterBuilder writeWorkbook = EasyExcel.write(PATH + "b.xlsx", User.class);
        // 工作表对象
        ExcelWriterSheetBuilder sheet = writeWorkbook.sheet();
        // 写
        sheet.doWrite(findAll());
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("张三_" + i);
            user.setIndex(String.valueOf(i));
            user.setCreateTime(new Date());
            user.setPassword(String.valueOf((int)((Math.random()*9+1)*100000)));
            user.setStatus(i % 2 == 0 ? "启用" : "停用");
            users.add(user);
        }
        return users;
    }
}
