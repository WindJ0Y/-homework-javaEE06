package com.windj0y.hw006.demo.controller;

import com.windj0y.hw006.demo.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

    private final MainService mainService;

    public JSPController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping("/")
    public String Default(){
        return "index";
    }

    @RequestMapping("/index")
    public String Index(){
        return "index";
    }

    @RequestMapping("/student")
    public String Student(Model model){
        model.addAttribute("studentList",mainService.getStudents());
        model.addAttribute("homeworkList",mainService.getHomeworks());
        return "student";
    }

    @RequestMapping("/teacher")
    public String Teacher(Model model){
        model.addAttribute("studentList",mainService.getStudents());
        model.addAttribute("homeworkList",mainService.getHomeworks());
        model.addAttribute("submitList",mainService.getSubmits());
        return "teacher";
    }

}
