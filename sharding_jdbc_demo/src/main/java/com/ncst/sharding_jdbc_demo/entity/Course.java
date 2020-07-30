package com.ncst.sharding_jdbc_demo.entity;

import lombok.Data;

/**
 * @Date 2020/7/30 16:45
 * @Author by LiShiYan
 * @Description TODO
 */
@Data
public class Course {
    private Long cid;
    private String cname;
    private Long user_id;
    private String cstatus;
}
