package com.example.secundary.secundary.Dao;

import com.example.secundary.secundary.Entity.StudentCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoStudentCourse extends CrudRepository<StudentCourse,Long> {
    
}
