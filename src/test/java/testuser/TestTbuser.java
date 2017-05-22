package testuser;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.mapper.TbuserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/18.
 */
public class TestTbuser {
    private SqlSessionFactory sessionFactory;
    private SqlSession sqlSession;
    private TbuserMapper tbuserMapper;
    @Before
    public void init(){
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            sqlSession = sessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tbuserMapper = sqlSession.getMapper(TbuserMapper.class);
    }

    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testLogin(){
        System.out.println(tbuserMapper.login(new Tbuser("admin","123")));
    }
    @Test
    public void testAddTbuser(){
        Date utilDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String strDate = format.format(utilDate);
//      Long longdate = Long.parseLong(strDate);
//      System.out.print(longdate);
        Timestamp timestamp = new Timestamp(new Date().getTime());
//      System.out.print(utilDate.getTime());

        System.out.println(timestamp.getTime());

        java.sql.Date sqldate =new java.sql.Date(timestamp.getTime());
//        tbuserMapper.addTbuser(new Tbuser(0,"username","password","userroles","nickname",sqldate,sqldate,sqldate));
        System.out.println("测试成功");
    }
}
