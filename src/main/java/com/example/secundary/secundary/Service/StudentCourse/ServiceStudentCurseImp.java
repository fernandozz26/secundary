package com.example.secundary.secundary.Service.StudentCourse;

import java.util.List;
import javax.transaction.Transactional;

import com.example.secundary.secundary.Dao.DaoStudentCourse;
import com.example.secundary.secundary.Entity.StudentCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceStudentCurseImp implements ServiceStudentCourse {

    @Autowired
    DaoStudentCourse daoStudentCourse;


    @Override
    @Transactional
    public List<StudentCourse> findAllStudentCourses() {
        List<StudentCourse> list = (List<StudentCourse>) daoStudentCourse.findAll();
        return list;
        
    }
    
}
