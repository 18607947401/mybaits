package com.bjpowernode;

import com.bjpowernode.domain.Student;
import com.github.pagehelper.PageHelper;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;
import vo.VoStudent;

import java.util.ArrayList;
import java.util.List;

public class TestMybatis {
    @Test
    public void selectStudentIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("李四");
        student.setAge(12);
        List<Student> studentList = dao.selectStudentIf(student);
        for (Student student1 : studentList) {
            System.out.println("***********" + student1);
        }
    }

    @Test
    public void selectStudentWhere() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("李四");
        student.setAge(12);
        List<Student> studentList = dao.selectStudentWhere(student);
        for (Student student1 : studentList) {
            System.out.println("***********" + student1);
        }

    }
    @Test
    public void selectStudentForeachOne() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
       List<Integer> list = new ArrayList<>();
       list.add(1001);
       list.add(1002);
       list.add(1004);
        List<Student> studentList = dao.selectStudentForeachOne(list);
        for (Student student1 : studentList) {
            System.out.println("***********" + student1);
        }

    }
    @Test
    public void selectStudentForeachTwo() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setId(1001);
        list.add(student);
        student = new Student();
        student.setId(1004);
        list.add(student);
        List<Student> studentList = dao.selectStudentForeachTwo(list);
        for (Student student1 : studentList) {
            System.out.println("***********" + student1);
        }

    }
    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
       //使用pagehelper中的方法
        //pageNum:第几页，pageSize:有多少行
        PageHelper.startPage(3,3);
        List<Student> studentList = dao.selectAll();
        for (Student student1 : studentList) {
            System.out.println("***********" + student1);
        }

    }
}
