package com.mushfek.springmvcdemo.repository;

import com.mushfek.springmvcdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = (:username)")
    User findByUsername(String username);
}
