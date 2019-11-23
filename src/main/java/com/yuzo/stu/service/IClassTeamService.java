package com.yuzo.stu.service;

import com.yuzo.stu.entity.ClassTeam;

import java.util.List;

/**
 * @author yuan
 */
public interface IClassTeamService {
    List<ClassTeam> query();

    int add(ClassTeam classTeam);

    ClassTeam queryById(Integer id);

    int edit(ClassTeam classTeam);

    int dels(Integer[] ids);
}
