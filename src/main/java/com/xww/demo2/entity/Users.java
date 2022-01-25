package com.xww.demo2.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Users {

    @TableId
    private Integer id;
    private String username;
    private String password;
}
