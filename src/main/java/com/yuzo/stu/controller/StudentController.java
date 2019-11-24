package com.yuzo.stu.controller;

import com.yuzo.stu.entity.ClassTeam;
import com.yuzo.stu.entity.Student;
import com.yuzo.stu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private IStudentService service;

    @RequestMapping("stu/query")
    public String query(ModelMap mm){
        List<Student> list = service.query();
        mm.put("list", list);
        return "student/list_stu";
    }

    @RequestMapping("stu/addPage")
    public String addPage(ModelMap mm){
        List<ClassTeam> ctList = service.queryCt();
        mm.put("ctList", ctList);
        return "student/add_stu";
    }

    @RequestMapping("stu/addSave")
    public String addSave(Student stu, ModelMap mm){
        service.add(stu);
        return "redirect:query";
    }

    @RequestMapping("stu/editPage")
    public String addPage(Integer id, ModelMap mm){
        List<ClassTeam> ctList = service.queryCt();
        mm.put("ctList", ctList);
        Student stu = service.queryById(id);
        mm.put("stu", stu);
        return "student/edit_stu";
    }

    @RequestMapping("stu/editSave")
    public String editSave(Student stu, ModelMap mm){
        int count = service.edit(stu);
        return "redirect:query";
    }

    @RequestMapping("stu/dels")
    public String editSave(Integer[] ids, ModelMap mm){
        int count = service.dels(ids);
        return "redirect:query";
    }


}
