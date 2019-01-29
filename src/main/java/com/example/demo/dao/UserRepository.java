package com.example.demo.dao;

import com.example.demo.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    //查询对象
    @Query("select u from User u where u.id = :id")
    List<User> queryAllById (@Param("id") Long Id);

    //原生查询
    @Query(value = "select * from user u where u.user_name = ?1",nativeQuery = true)
    List<User> queryByName(String name);

}
