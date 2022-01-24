package com.bjpowernode;

import com.bjpowernode.domain.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;
import vo.VoStudent;

import java.util.List;

public class TestMybatis {
    @Test
    public void selectStudentById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentById(1002);
        System.out.println(student);
    }
    @Test
    public void selectStudentParam(){
            SqlSession sqlsession = MybatisUtils.getSqlSession();
            StudentDao dao = sqlsession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectStudentParam("李四", 23);
        for (Student stu: studentList){
            System.out.println(stu);
        }
        sqlsession.close();
    }
    @Test
    public void selectStudentReturn(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        VoStudent student = dao.selectStudentReturn(1002);
        System.out.println(student);
    }
    @Test
    public void selectAllStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> student =dao.selectAllStudent();
        System.out.println(student);
    }
    @Test
    public void testSelect(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectStudent();
        System.out.println(studentList);
    }


}
