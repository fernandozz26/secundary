package com.example.secundary.secundary.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import com.example.secundary.secundary.Entity.Course;
import com.example.secundary.secundary.Entity.Student;
import com.example.secundary.secundary.Entity.StudentCourse;
import com.example.secundary.secundary.Service.StudentCourse.ServiceStudentCurseImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SecundaryController {

    @Autowired
    ServiceStudentCurseImp serviceStudentCurse;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/courses")
    public String course(Model model) throws Exception{
        List<StudentCourse> list;
        list = (List<StudentCourse>) serviceStudentCurse.findAllStudentCourses();
        if(!list.isEmpty()){
            model.addAttribute("courses",list);
            model.addAttribute("course", new StudentCourse());
        }else{
            Course course = null;
            Student student = null;
            StudentCourse defaultStudentCourse = new StudentCourse(1L,student,course,0.0,0.0,0.0,0.0);
            list.add(defaultStudentCourse);
            model.addAttribute("courses",list);
        }

        return "/views/courses";
    }
    
    @RequestMapping(value = "/course",  method = RequestMethod.GET)
    List<StudentCourse> listStudentCourse(){
        List<StudentCourse> list = serviceStudentCurse.findAllStudentCourses();
        return list;
    }

}
