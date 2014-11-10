package com.mushfek.springmvcdemo.service;

import com.mushfek.springmvcdemo.common.exception.UserNotFoundByNameException;
import com.mushfek.springmvcdemo.domain.User;
import com.mushfek.springmvcdemo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        log.debug("findAll: ");

        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        log.debug("findById: id={}", id);

        return userRepository.findOne(id);
    }

    @Override
    public void save(User user) {
        log.debug("save: user={}", user);

        userRepository.save(user);
    }

    @Override
    public User findByUserName(String username) throws Exception {
        log.debug("findByUserName: username={}", username);

        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UserNotFoundByNameException("No user exists with name=" + username);
        }

        return user;
    }
}
