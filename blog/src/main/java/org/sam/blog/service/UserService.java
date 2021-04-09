package org.sam.blog.service;


import org.sam.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserService extends JpaRepository<User,Integer> {
}
