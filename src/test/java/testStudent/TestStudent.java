package testStudent;

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

        student.setGradeid(1);
        PackageResult page = new PackageResult();
        page.setPageSize(2);//每页显示对少条
        page.setPageNumber(2);//当前页
        page.setTotalPosts(stuMapper.queryCountStudent(student));
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

}
