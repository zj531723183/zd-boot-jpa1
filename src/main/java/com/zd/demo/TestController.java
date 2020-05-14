package com.zd.demo;


import com.zd.demo.dao.UserRepository;
import com.zd.demo.dao.UserRepository01;
import com.zd.demo.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
* @Description: 测试接口
* @author: zj
* @date: 2020/5/12 21:24
*/
@RestController
public class TestController {
    @Autowired
    private UserRepository01 userRepository01;

    @GetMapping("test")
    public String test() {
//        Pageable pageable = PageRequest.of(1, 10);
//        userRepository.findByLastnamze("naem",pageable);
        UserDO s=new UserDO();
        s.setPassword("11");
        s.setUsername("ss");
        s.setCreateTime(new Date());
        userRepository01.save(s);
        return "hello";
    }

    /**
    * @Description: TODO
    * @author: zj
    * @date: 2020/5/14 21:31
    */

}
