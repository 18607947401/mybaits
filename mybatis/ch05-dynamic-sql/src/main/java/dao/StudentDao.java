package dao;


import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudentIf(Student student);
    List<Student> selectStudentWhere(Student student);
    List<Student> selectStudentForeachOne(List<Integer> idlist);
    List<Student> selectStudentForeachTwo(List<Student> stulist);
    //使用pagehelper分页数据
    List<Student> selectAll();


}
