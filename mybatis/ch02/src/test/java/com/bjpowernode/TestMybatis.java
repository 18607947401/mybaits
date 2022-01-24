package com.bjpowernode;

import com.bjpowernode.domain.Student;
import dao.StudentDao;
import impl.ImplStudent;
import org.junit.Test;


import java.util.List;

public class TestMybatis {
    @Test
    public void testSelectStudent(){
        StudentDao dao = new ImplStudent();
        List<Student> studentList = dao.selectStudents();
        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }
    @Test
    public void insertStudent(){
        StudentDao dao = new ImplStudent();
        Student student = new Student();
        student.setName("lisa4");
        student.setId(10011);
        student.setAge(54);
        int num = dao.insertStudent(student);
        System.out.println("添加学生的数量："+num);
    }

}
