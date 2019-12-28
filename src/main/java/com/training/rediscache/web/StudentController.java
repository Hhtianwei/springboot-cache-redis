package com.training.rediscache.web;

import com.training.rediscache.entity.Student;
import com.training.rediscache.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        List<Student> all = userService.getAll();
        return all;
    }

    @GetMapping("/getAgeThan20")
    public List<Student> getAgeThan20(){
        List<Student> all = userService.getAgeThan20();
        return all;
    }

    @GetMapping("/getAgeThan40")
    public List<Student> getAgeThan40(){
        List<Student> all = userService.getAgeThan40();
        return all;
    }
}
