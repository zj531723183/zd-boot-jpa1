package com.zd.demo.dao;// UserRepository01.java

import com.zd.demo.entity.UserDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository01 extends CrudRepository<UserDO, Integer> {

}