package com.zd.demo;// UserRepository01.java

import com.zd.demo.dao.UserRepository01;
import com.zd.demo.entity.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest1 {

    @Autowired
    private UserRepository01 userMapper;

    @Test
    public void testInsert() {
        UserDO user = new UserDO();
        user.setUsername(UUID.randomUUID().toString());
        user  .setCreateTime(new Date());
        user.setPassword("zz");
        userMapper.save(user);
    }
//
//    @Test
//    public void testUpdateById() {
//        UserDO updateUser = new UserDO().setId(1)
//                .setPassword("wobucai");
//        userMapper.updateById(updateUser);
//    }
//
//    @Test
//    public void testDeleteById() {
//        userMapper.deleteById(2);
//    }
//
//    @Test
//    public void testSelectById() {
//        userMapper.selectById(1);
//    }
//
//    @Test
//    public void testSelectByUsername() {
//        userMapper.selectByUsername("yunai");
//    }
//
//    @Test
//    public void testSelectByIds() {
//        List<UserDO> users = userMapper.selectByIds(Arrays.asList(1, 3));
//        System.out.println("users：" + users.size());
//    }

}