package com.sourthwind;

import com.sourthwind.model.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Description
 * @auther Ming
 * @create 2021-01-19 22:48
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中....";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}