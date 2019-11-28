package com.yuzo.stu.mapper;

import com.yuzo.stu.entity.Student;
import com.yuzo.stu.entity.Xing;

import java.util.List;

public interface XingMapper {
    int dels(Integer[] ids);

    int update(Xing x);

    Xing selectByPk(Integer id);

    int save(Xing x);

    List<Xing> query();
}
