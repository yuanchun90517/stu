package com.yuzo.stu.controller;

import com.yuzo.stu.entity.ClassTeam;
import com.yuzo.stu.entity.Student;
import com.yuzo.stu.service.IClassTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
@Controller
public class ClassTeamController {

    @Autowired
    private IClassTeamService service;

    @RequestMapping("ct/query")
    public String query(ModelMap modelMap){
        List<ClassTeam> list = service.query();

        System.out.println("list = " + list);
        modelMap.put("list", list);

        return "classteam/list_ct";
    }

    @RequestMapping("ct/addPage")
    public String addPage(ModelMap modelMap){
        return "classteam/add_ct";
    }

    @RequestMapping("ct/addSave")
    public String addSave(ClassTeam classTeam, ModelMap modelMap){
        service.add(classTeam);
        return "redirect:query";
    }
    @RequestMapping("ct/editPage")
    public String editPage(Integer roleId, ModelMap modelMap){
        ClassTeam ct = service.queryById(roleId);
        System.out.println("ct = " + ct);
        modelMap.put("ct", ct);
        return "classteam/edit_ct";
    }
    @RequestMapping("ct/editSave")
    public String addPage(ClassTeam classTeam, ModelMap modelMap){
        service.edit(classTeam);
        return "redirect:query";
    }
    @RequestMapping("ct/dels")
    public String dels(Integer[] ids, ModelMap modelMap){
        service.dels(ids);
        return "redirect:query";
    }

}
