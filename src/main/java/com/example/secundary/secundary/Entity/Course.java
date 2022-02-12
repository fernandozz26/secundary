package com.example.secundary.secundary.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCourse;
    @Column
    private String nameCourse;
    @Column
    private int hoursWeek;
    @Column
    private int daysWeek;

    @ManyToOne
    @JoinColumn(name = "id_professor")
    private  Professor professor;

    public Long getIdCourse() {
        return this.idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return this.nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getHoursWeek() {
        return this.hoursWeek;
    }

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public int getDaysWeek() {
        return this.daysWeek;
    }

    public void setDaysWeek(int daysWeek) {
        this.daysWeek = daysWeek;
    }

    

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


}
