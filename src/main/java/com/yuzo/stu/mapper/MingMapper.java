package com.yuzo.stu.mapper;

import com.yuzo.stu.entity.Ming;
import com.yuzo.stu.entity.Xing;

import java.util.List;

public interface MingMapper {
    int dels(Integer[] ids);

    int update(Ming m);

    Ming selectByPk(Integer id);

    int save(Ming m);

    List<Ming> query();
}
