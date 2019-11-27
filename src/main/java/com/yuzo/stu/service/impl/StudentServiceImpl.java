package com.yuzo.stu.service.impl;

import com.yuzo.stu.entity.ClassTeam;
import com.yuzo.stu.entity.Student;
import com.yuzo.stu.mapper.ClassTeamMapper;
import com.yuzo.stu.mapper.StudentMapper;
import com.yuzo.stu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper mapper;

    @Autowired
    private ClassTeamMapper ctMapper;

    @Override
    public List<Student> query() {
        return mapper.query();
    }

    @Override
    public List<ClassTeam> queryCt() {
        return ctMapper.query();
    }

    @Override
    public int add(Student stu) {
        stu.setStuInTime(LocalDateTime.now());
        return mapper.save(stu);
    }

    @Override
    public Student queryById(Integer id) {
        return mapper.selectByPk(id);
    }

    @Override
    public int edit(Student stu) {
        stu.setStuInTime(LocalDateTime.now());
        return mapper.update(stu);
    }

    @Override
    public int dels(Integer[] ids) {
        return mapper.dels(ids);
    }
}
