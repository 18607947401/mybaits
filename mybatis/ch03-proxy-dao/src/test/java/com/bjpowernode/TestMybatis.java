package com.bjpowernode;

import com.bjpowernode.domain.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSelectStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectStudents();
        for (Student stu :studentList){
            System.out.println(stu);
    }
    }
    @Test
    public void insertStudent(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("lisa1");
        student.setId(1013);
        student.setEmail("22354@qq.com");
        student.setAge(54);
        Integer  num = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("添加学生的数量："+num);
        sqlSession.close();
    }

}
