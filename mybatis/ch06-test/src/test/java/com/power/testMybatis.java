package com.power;

import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.util.List;

public class testMybatis  {
    @Test
    public void  TestSelectStudent() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudent();
        students.forEach(sq-> System.out.println(sq));
    }
}
