package com.lx.pojo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.lx.listener.UserListener;

public class Test {

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
        String path = "G:\\JavaSpace\\Java进阶\\easyexcel\\a.xlsx";
        // 获取工作簿对象
        ExcelReaderBuilder workbook = EasyExcel.read(path, User.class, new UserListener());
        // 获取工作表
        ExcelReaderSheetBuilder sheet = workbook.sheet();
        // 读取工作表中的内容
        sheet.doRead();
    }
}
