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
import java.text.ParseException;
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
        Date  date= tbuserMapper.login(new Tbuser("admin","123")).getDateofbirth();
        SimpleDateFormat frmat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        System.out.println(frmat.format(date));
    }
    @Test
    public void testAddTbuser(){
        Date utilDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
//        String strDate = format.format(utilDate);
//        Long longdate = Long.parseLong(strDate);
//        System.out.print(longdate);
//        Timestamp timestamp = new Timestamp(new Date().getTime());
//        System.out.print(utilDate.getTime());
//        java.sql.Date sqldate =new java.sql.Date();
        String strdate = format.format(utilDate);
        try {
            utilDate = format.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Tbuser tbuser =new Tbuser(0,"admin","123","01","轻舞飞扬",utilDate,utilDate,utilDate);
        tbuserMapper.addTbuser(tbuser);
        //在MyBatis插入数据时在Mapper中设置下主键的列名keyProperty="userid" 把这个属性改为true useGeneratedKeys="true"
        //就能插入的对象就能返回刚才插入
        System.out.println(tbuser.getUserid());
    }
    @Test
    public void queryAllTbuser(){
        SimpleDateFormat frmat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        for (Tbuser u : tbuserMapper.queryAllTbuser()){
            System.out.println(frmat.format(u.getDateofbirth()));
        }
    }
}
