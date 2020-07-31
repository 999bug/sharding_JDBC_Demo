package com.ncst.sharding_jdbc_demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ncst.ShardingJdbcDemoApplication;
import com.ncst.sharding_jdbc_demo.entity.Course;
import com.ncst.sharding_jdbc_demo.entity.User;
import com.ncst.sharding_jdbc_demo.mapper.ICourseMapper;
import com.ncst.sharding_jdbc_demo.mapper.IUserMapper;
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
public class IUserMApperTest {

   @Autowired
    private IUserMapper userMapper;

   @Test
   public void addUser(){
       User user=new User();

       user.setUsername("李四");
       user.setUstatus("on");
       userMapper.insert(user);
   }

    @Test
    public void findUser(){
       QueryWrapper<User> wrapper=new QueryWrapper<>();
       wrapper.eq("user_id",495996623495626753l);
       User user= userMapper.selectOne(wrapper);
        System.out.println("user = " + user);
    }

}
