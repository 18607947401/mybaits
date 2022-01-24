package dao;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.annotations.Param;
import vo.VoStudent;

import java.util.List;

public interface StudentDao {
    public Student selectStudentById(@Param("studentId") Integer id);
    List<Student> selectStudentParam(@Param("myname") String name,@Param("myage") Integer age);
   VoStudent selectStudentReturn(@Param("sid") Integer id);
   List<Student> selectAllStudent();
   List<Student> selectStudent();


}
