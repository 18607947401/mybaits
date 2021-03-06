package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class MybatisUtils {

    private static SqlSessionFactory factory =null;
    static {
        String config = "mybatis.xml";
        try {
            InputStream res = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(res);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession =null;
        if(factory!=null){
            sqlSession = factory.openSession();//非自动提交事务
        }
        return sqlSession;
    }
}
