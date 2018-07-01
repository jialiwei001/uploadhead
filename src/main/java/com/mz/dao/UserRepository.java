package com.mz.dao;

import com.mz.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mz
 * @Description：用户仓库
 * @date 2018/7/1
 * @time 9:01
 */
public interface UserRepository extends JpaRepository<User,String> {

}
