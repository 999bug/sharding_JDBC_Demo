package com.ncst.sharding_jdbc_demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ncst.ShardingJdbcDemoApplication;
import com.ncst.sharding_jdbc_demo.entity.Course;
import com.ncst.sharding_jdbc_demo.mapper.ICourseMapper;
import groovy.transform.ASTTest;
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
public class ShardingJdbcDemoApplicationTest {

   @Autowired
    private ICourseMapper courseMapper;

    //==========水平分库=============

    //添加方法，
    @Test
    public void addCourseDb(){
        Course course=new Course();

            course.setCname("javatrt");
            course.setUser_id(1110L);
            course.setCstatus("已发布");
            courseMapper.insert(course);
    }
    //查询方法
    @Test
    public void findCourseDb(){
        QueryWrapper<Course> wrapper=new QueryWrapper<>();
        wrapper.eq("cid",495723958826434561l);
        wrapper.eq("user_id",1110l);
        Course course=courseMapper.selectOne(wrapper);
        System.out.println("course = " + course);
    }

   //==========水平分库=============
   //添加方法，水平分表
    @Test
    public void addCourse(){
        Course course=new Course();
        for (int i = 0; i < 10; i++) {
            course.setCname("java"+i);
            course.setUser_id(111L);
            course.setCstatus("已发布"+i);
            courseMapper.insert(course);
        }
    }
    //查询方法，水平分表
    @Test
    public void findCourse(){
        QueryWrapper<Course> wrapper=new QueryWrapper<>();
        wrapper.eq("cid",495714075032944641l);
        Course course=courseMapper.selectOne(wrapper);
        System.out.println("course = " + course);
    }

}
