package testGrade;

import cn.bdqn.tangcco.entity.Grade;
import cn.bdqn.tangcco.entity.GradeVO;
import cn.bdqn.tangcco.grade.mapper.GradeMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import testBase.TestBase;

/**
 * Created by Administrator on 2017/5/20.
 */
public class TestGrade extends TestBase{
    private SqlSessionFactory sessionFactory;
    private SqlSession sqlSession;
    private GradeMapper gradeMapper;
    @Before
    public void init(){
        gradeMapper = this.getMapper(GradeMapper.class);
    }

    @Test
    public void testAddGrade(){
        Grade grade = new Grade(1,"一年二班");
        gradeMapper.addGrade(grade);
        this.closeSqlSessionAndCommit();
        System.out.print("测试成功");
    }
    @Test
    public void testUpdateGrade(){
        Grade grade = new Grade(1,"五年二班");
        gradeMapper.updateGrade(grade);
        this.closeSqlSessionAndCommit();
    }
    @Test
    public void testQueryStudentByGradeId(){
        Grade grade = new Grade();
        grade.setGradeid(2);
        for(GradeVO student:gradeMapper.queryStudentByGradeId(grade) ){
            System.out.println(student);

        }
    }
    @Test
    public void testQueryGradeById(){
        System.out.print(gradeMapper.queryGradeById(1));
    }
}
