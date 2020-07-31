package com.ncst.sharding_jdbc_demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ncst.ShardingJdbcDemoApplication;
import com.ncst.sharding_jdbc_demo.entity.Udict;
import com.ncst.sharding_jdbc_demo.entity.User;
import com.ncst.sharding_jdbc_demo.mapper.IUdictMapper;
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
public class IUdictMApperTest {

   @Autowired
    private IUdictMapper udictMapper;

   @Test
   public void addUser(){
       Udict user=new Udict();

       user.setUvalue("添加");
       user.setUstatus("on");
       udictMapper.insert(user);
   }

    @Test
    public void deleteUdict(){
       QueryWrapper<Udict> wrapper=new QueryWrapper<>();
       wrapper.eq("dictid",496002750232920065l);
      udictMapper.delete(wrapper);
    }
    @Test
    public void findUdict(){
        QueryWrapper<Udict> wrapper=new QueryWrapper<>();
        wrapper.eq("dictid",496003650829680641l);
        Udict udict = udictMapper.selectOne(wrapper);
        System.out.println("udict = " + udict);
    }

}
