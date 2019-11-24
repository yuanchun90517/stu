package com.yuzo.stu.service;

import com.yuzo.stu.entity.ClassTeam;
import com.yuzo.stu.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> query();

    List<ClassTeam> queryCt();

    int add(Student stu);

    Student queryById(Integer id);

    int edit(Student stu);

    int dels(Integer[] ids);
}
