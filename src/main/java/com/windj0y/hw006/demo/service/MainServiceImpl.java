package com.windj0y.hw006.demo.service;

import com.windj0y.hw006.demo.dao.MainMapper;
import com.windj0y.hw006.demo.pojo.Homework;
import com.windj0y.hw006.demo.pojo.Student;
import com.windj0y.hw006.demo.pojo.Submit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    private final MainMapper mainMapper;

    public MainServiceImpl(MainMapper mainMapper) {
        this.mainMapper = mainMapper;
    }

    @Override
    public boolean addStudent(String name) {
        return mainMapper.addStudent(name);
    }

    @Override
    public boolean addHomework(String name) {
        return mainMapper.addHomework(name);
    }

    @Override
    public boolean submitHomework(int sid, int hid, String content) {
        try{
            return mainMapper.submitHomework(sid,hid,content);
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public List<Student> getStudents() {
        return mainMapper.getStudents();
    }

    @Override
    public List<Homework> getHomeworks() {
        return mainMapper.getHomeworks();
    }

    @Override
    public List<Submit> getSubmits() {
        return mainMapper.getSubmits();
    }
}
