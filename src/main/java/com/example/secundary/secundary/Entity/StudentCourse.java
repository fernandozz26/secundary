package com.example.secundary.secundary.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentCourse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idStudentCourse;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

    private double firstExam;
    @Column
    private double secondExam;
    @Column
    private double thirdExam;
    @Column
    private double calification;

    public StudentCourse() {
    }


    public StudentCourse(Long idStudentCourse, Student student, Course course, double firstExam, double secondExam, double thirdExam, double calification) {
        this.idStudentCourse = idStudentCourse;
        this.student = student;
        this.course = course;
        this.firstExam = firstExam;
        this.secondExam = secondExam;
        this.thirdExam = thirdExam;
        this.calification = calification;
    }

    public double getFirstExam() {
        return this.firstExam;
    }

    public void setFirstExam(double firsExam) {
        this.firstExam = firsExam;
    }

    public double getSecondExam() {
        return this.secondExam;
    }

    public void setSecondExam(double secondExam) {
        this.secondExam = secondExam;
    }

    public double getThirdExam() {
        return this.thirdExam;
    }

    public void setThirdExam(double thirdExam) {
        this.thirdExam = thirdExam;
    }

    public double getCalification() {
        return this.calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }

    public Long getIdStudentCourse() {
        return this.idStudentCourse;
    }

    public void setIdStudentCourse(Long idStudentCourse) {
        this.idStudentCourse = idStudentCourse;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    

}
