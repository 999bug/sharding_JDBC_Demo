package com.ncst.sharding_jdbc_demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ncst.ShardingJdbcDemoApplication;
import com.ncst.sharding_jdbc_demo.entity.Staffs;
import com.ncst.sharding_jdbc_demo.entity.Udict;
import com.ncst.sharding_jdbc_demo.mapper.IStaffsMapper;
import com.ncst.sharding_jdbc_demo.mapper.IUdictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Date 2020/7/30 17:04
 * @Author by LiShiYan
 * @Description TODO
 */
@SpringBootTest(classes = ShardingJdbcDemoApplication.class)
@RunWith(SpringRunner.class)
public class IStaffsMApperTest {

   @Autowired
    private IStaffsMapper udictMapper;

   @Test
   public void addUser(){
       Staffs staffs=new Staffs();
staffs.setAge(12);
staffs.setName("javaaa");
staffs.setPos("666");

       udictMapper.insert(staffs);
   }


    @Test
    public void findUdict(){
        QueryWrapper<Staffs> wrapper=new QueryWrapper<>();
        wrapper.eq("id",9);
        Staffs staffs = udictMapper.selectOne(wrapper);
        System.out.println("staffs = " + staffs);
    }

}
