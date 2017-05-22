package cn.bdqn.tangcco.student.mapper;

import cn.bdqn.tangcco.entity.PackageResult;
import cn.bdqn.tangcco.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */
public interface StudentMapper {
    public void addStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
    public List<Student> queryAllStudent(@Param("student") Student student,@Param("page") PackageResult page);
    public Student queryStudentById(int id);
    public int queryCountStudent(Student student);
}
