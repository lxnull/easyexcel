package com.lx.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
public class User {

    @ExcelProperty("编号")
    private String index;
    @ExcelProperty("状态")
    private String status;
    @ExcelProperty("用户名")
    private String name;
    @ExcelProperty("密码")
    private String password;
    @ExcelProperty("创建日期")
    private Date createTime;

}
