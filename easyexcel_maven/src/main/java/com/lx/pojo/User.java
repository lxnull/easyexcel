package com.lx.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
//@ContentRowHeight// 内容的行高只能放在类上
//@HeadRowHeight// 表头的行高
public class User {

    @ExcelProperty(value = "编号",index = 0)
    private String index;
    @ExcelProperty(value = "状态",index = 1)
    private String status;
    @ExcelProperty(value = "用户名",index = 2)
    @ColumnWidth(15)
    private String name;
    @ExcelProperty(value = "密码",index = 3)
    private String password;
    @ExcelProperty(value = "创建日期",index = 4)
    @ColumnWidth(20)
    private Date createTime;

}
