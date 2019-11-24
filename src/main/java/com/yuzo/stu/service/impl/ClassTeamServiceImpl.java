package com.yuzo.stu.service.impl;

import com.yuzo.stu.entity.ClassTeam;
import com.yuzo.stu.mapper.ClassTeamMapper;
import com.yuzo.stu.service.IClassTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuan
 */
@Service
public class ClassTeamServiceImpl implements IClassTeamService {

    @Autowired
    private ClassTeamMapper mapper;

    @Override
    public List<ClassTeam> query() {
        return mapper.query();
    }

    @Override
    public int add(ClassTeam classTeam) {
        int count = mapper.save(classTeam);
        System.out.println("ctId:" + classTeam.getCtId());
        return count;
    }

    @Override
    public ClassTeam queryById(Integer id) {
        return mapper.selectByPk(id);
    }

    @Override
    public int edit(ClassTeam classTeam) {
        return mapper.update(classTeam);
    }

    @Override
    public int dels(Integer[] ids) {
        return mapper.dels(ids);
    }


}
