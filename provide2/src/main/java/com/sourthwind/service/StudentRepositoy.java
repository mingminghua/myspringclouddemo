package com.sourthwind.service;

import com.sourthwind.model.Student;

import java.util.Collection;

/**
 * @author Ming
 * @Description
 * @create 2021-01-19 15:11
 */
public interface StudentRepositoy {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
