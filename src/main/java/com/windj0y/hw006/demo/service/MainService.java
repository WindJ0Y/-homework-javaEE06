package com.windj0y.hw006.demo.service;

import com.windj0y.hw006.demo.pojo.Homework;
import com.windj0y.hw006.demo.pojo.Student;
import com.windj0y.hw006.demo.pojo.Submit;

import java.util.List;

public interface MainService {

    public boolean addStudent(String name);

    public boolean addHomework(String name);

    public boolean submitHomework(int sid, int hid, String content);

    public List<Student> getStudents();

    public List<Homework> getHomeworks();

    public List<Submit> getSubmits();

}
