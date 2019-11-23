package com.yuzo.stu.mapper;

import com.yuzo.stu.entity.ClassTeam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassTeamMapper {
    List<ClassTeam> query();

    int update(ClassTeam classTeam);

    int dels(Integer[] ids);

    ClassTeam selectByPk(Integer id);

    int save(ClassTeam classTeam);
}
