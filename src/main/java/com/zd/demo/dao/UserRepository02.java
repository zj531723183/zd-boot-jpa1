package com.zd.demo.dao;// UserRepository02.java


import com.zd.demo.entity.UserDO;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface UserRepository02 extends PagingAndSortingRepository<UserDO, Integer> {

}