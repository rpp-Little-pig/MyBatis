package text;

import MyBatis06.mapper.UserMapper;
import MyBatis06.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest06  {
    @Test
    public void testUpdate() throws IOException {
        String resource = "MyBatis06/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //        2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //        2.3 获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String username = "lisi";
        String password = "345";


        //        2.4 调用方法
        User user = mapper.select(username, password);


    }
}
