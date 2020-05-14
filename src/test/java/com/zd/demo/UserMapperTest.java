package com.zd.demo;// UserRepository01.java

import com.zd.demo.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserRepository userMapper;

    @Test
    public void testInsert() {


        Pageable pageable = PageRequest.of(1, 10);
        userMapper.findByLastnamze("naem",pageable);
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