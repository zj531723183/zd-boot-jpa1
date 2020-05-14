package com.zd.demo.dao;

import com.zd.demo.entity.UserDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<UserDO, Long> {

  @Query(value = "SELECT * FROM USERS WHERE LASTNAME = ?1", // value 属性，编写查询分页列表的 SQL 。
    countQuery = "SELECT count(*) FROM USERS WHERE LASTNAME = ?1", // countQuery 属性，编写记录总数的 SQL 。
    nativeQuery = true)
  Page<UserDO> findByLastnamze(String lastname, Pageable pageable);

}