package com.ncst.sharding_jdbc_demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Date 2020/7/31 16:52
 * @Author by LiShiYan
 * @Description TODO
 */
@Data
@TableName("t_udict")
public class Udict {
    private Long dictid;
    private String ustatus;
    private String uvalue;

}
