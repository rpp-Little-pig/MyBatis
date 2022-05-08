package MyBatis01;

import MyBatis01.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import MyBatis01.pojo.User;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
//        1,加载mubatis的核心配置文件,获取SqlSessionFactory
        String resource = "MyBatis01/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//         2,获取SqlSession对象,用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

//         3,执行sql
//        List<User> users = sqlSession.selectList("test.selectAll");
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User users = userMapper.selectById(111);
//        System.out.println(users);
        System.out.println(users);

//         4,释放资源
        sqlSession.close();
    }
}
