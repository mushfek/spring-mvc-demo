package com.mushfek.springmvcdemo.service;

import com.mushfek.springmvcdemo.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
@Component
public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void save(User user);

    User findByUserName(String username) throws Exception;
}
