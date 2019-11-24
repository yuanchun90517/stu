package com.yuzo.stu.mapper;

import com.yuzo.stu.entity.Student;

import java.util.List;

public interface StudentMapper {
    int dels(Integer[] ids);

    int update(Student stu);

    Student selectByPk(Integer id);

    int save(Student stu);

    List<Student> query();
}
