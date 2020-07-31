package com.ncst.sharding_jdbc_demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @Date 2020/7/31 16:14
 * @Author by LiShiYan
 * @Description TODO
 */
@Data
@TableName("t_user")
public class User {
    private Long user_id;
    private String username;
    private String ustatus;
}
