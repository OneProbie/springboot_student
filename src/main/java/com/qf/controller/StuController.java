package com.qf.controller;

import com.qf.entity.StudentEntity;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequestMapping("/user")
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("stulist")
    public String setStudents(Model model){

        List<StudentEntity> stulist = stuService.list();
        model.addAttribute("stulist",stulist);
        return "stulist";
    }

    @RequestMapping("delstu")
    public String delStudent(int id){

        stuService.removeById(id);


        return "redirect:/user/stulist";
    }

    @RequestMapping("addskip")
    public String addSkip(){

        return "addstu";
    }

    @RequestMapping("addstu")
    public String addStudent(StudentEntity stu){

        stuService.save(stu);

        return "redirect:/user/stulist";
    }

    @RequestMapping("updskip")
    public String updSkip(int id,Model model){

        StudentEntity stu = stuService.getById(id);

        model.addAttribute("stu",stu);
        return "updstu";
    }

    @RequestMapping("updstu")
    public String updStudent(StudentEntity stu){

        stuService.updateById(stu);

        return "redirect:/user/stulist";
    }
}
