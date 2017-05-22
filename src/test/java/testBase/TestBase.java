package testBase;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/20.
 */
public class TestBase {
    private final String configxml = "mybatis-config.xml";
    private SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    public <T> T getMapper(Class<T> clazz){
        T t = null;
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(configxml));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sqlSession==null){
            this.sqlSession = sqlSessionFactory.openSession();
        }
        t = sqlSession.getMapper(clazz);
        return t;
    }
    public void closeSqlSessionAndCommit(){
        sqlSession.commit();
        sqlSession.close();
    }
}