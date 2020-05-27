package com.windj0y.hw006.demo.dao;


import com.windj0y.hw006.demo.pojo.Homework;
import com.windj0y.hw006.demo.pojo.Student;
import com.windj0y.hw006.demo.pojo.Submit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MainMapper {

    @Insert("insert into student (name) VALUES (#{name})")
    public boolean addStudent(String name);

    @Insert("insert into homework (name) VALUES (#{name})")
    public boolean addHomework(String name);

    @Insert("insert into submit (sid,hid,content) VALUES (#{sid},#{hid},#{content})")
    public boolean submitHomework(int sid, int hid, String content);

    @Select("select * from student")
    public List<Student> getStudents();

    @Select("select * from homework")
    public List<Homework> getHomeworks();

    @Select("select * from submit")
    public List<Submit> getSubmits();

}
