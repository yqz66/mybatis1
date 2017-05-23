package testStudent;

import cn.bdqn.tangcco.command.Util;
import cn.bdqn.tangcco.entity.PackageResult;
import cn.bdqn.tangcco.entity.Student;
import cn.bdqn.tangcco.student.mapper.StudentMapper;
import org.junit.Before;
import org.junit.Test;
import testBase.TestBase;

/**
 * Created by Administrator on 2017/5/20.
 */
public class TestStudent extends TestBase{
    private StudentMapper stuMapper;
    @Before
    public void init(){
        stuMapper = this.getMapper(StudentMapper.class);
    }
    @Test
    public void testQueryAllStudent(){
        Student student = new Student();
        student.setStuname("李");
        student.setGradeid(1);
        PackageResult page = new PackageResult();

        page.setPageSize(3);//每页显示对少条
        page.setPageNumber(1);//当前页
        //对总记录数进行赋值
        page.setTotalPosts(stuMapper.queryCountStudent(student));
        //进行分页
        page = Util.getPackageResult(page);
        //循坏出查找的list
        for(Student stu : stuMapper.queryAllStudent(student,page) ){
            System.out.println(stu);
        }
    }
    @Test
    public void testQueryCountStudent(){
        Student stu = new Student();
        stu.setStuname("李");
        stu.setGradeid(0);
        System.out.println(stuMapper.queryCountStudent(stu));
    }
    @Test
    public void testQueryStudentByName(){
        Student student = new Student();
        student.setStuname("李");
        System.out.println(stuMapper.queryStudentByName(student));
    }
    @Test
    public void testAddStudent(){
        Student  student = new Student();
        student.setGradeid(1);
        student.setStuname("王五");
        student.setGender("01");
        student.setAge(18);
        student.setStunum("123");
        stuMapper.addStudent(student);
    }
}
