package com.example.secundary.secundary.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Id;


@Entity
@Table(name = "student")
public class Student implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idStudent;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String date;
    @Column
    private int dni;


    public Student() {
    }

    public Long getIdStudent() {
        return this.idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


}
