package com.mz.service.Impl;

import com.mz.dao.UserRepository;
import com.mz.entity.User;
import com.mz.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mz
 * @Description：
 * @date 2018/7/1
 * @time 9:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void update(User user) {
        userRepository.save(user);
    }
}
