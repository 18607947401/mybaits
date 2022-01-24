package impl;

import com.bjpowernode.domain.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import java.util.List;

public class ImplStudent implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "dao.StudentDao.selectStudents";
        List<Student> student = sqlSession.selectList(sqlId);
        sqlSession.close();
        return student;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "dao.StudentDao.insertStudent";
        int nums =sqlSession.insert(sqlId,student);
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }
}
