package com.training.rediscache.service;

import com.training.rediscache.entity.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Cacheable("stus")
    public List<Student> getAll(){
        System.out.println("loding students......");
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setId(i);
            student.setName("abc-" + i);
            student.setAge(i);
            list.add(student);
        }
        return list;
    }

    @Cacheable("stusThan20")
    public List<Student> getAgeThan20(){
        System.out.println("loding students......");
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setId(i*20);
            student.setName("def-" + i);
            student.setAge(i+20);
            list.add(student);
        }
        return list;
    }

    @Cacheable("getAgeThan40")
    public List<Student> getAgeThan40(){
        System.out.println("loding students. 4 .....");
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setId(i*40);
            student.setName("急急急-" + i);
            student.setAge(i+40);
            list.add(student);
        }
        return list;
    }
}
