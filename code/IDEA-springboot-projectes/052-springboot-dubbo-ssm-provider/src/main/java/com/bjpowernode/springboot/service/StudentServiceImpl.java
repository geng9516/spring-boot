package com.bjpowernode.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName:StudentServiceImpl
 * Package:com.bjpowernode.springboot.service
 * Description:
 *
 * @date:2020/3/11 14:54
 * @author:蛙课网
 */
@Component
@Service(interfaceClass = StudentService.class,version="1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
