package com.sourthwind.service;

import com.sourthwind.model.User;

import java.util.Collection;

/**
 * @author Ming
 * @Description
 * @create 2021-01-19 15:31
 */
public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Long id);
    public void saveOrUpdate(User user);
    public void deleteById(Long id);
}
