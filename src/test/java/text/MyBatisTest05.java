package text;

import MyBatis05.mapper.BrandMapper;
import MyBatis05.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest05 {
    @Test
    public void testUpdate() throws IOException {

        int id = 22;


//        Map map = new HashMap();
////        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandNanme",brandNanme);

        String resource = "MyBatis05/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
//        ture关闭事务（自动提交）默认是手动提交
        SqlSession sqlSession =sqlSessionFactory.openSession(true);

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        brandMapper.deleteById(id);
//提交事务
        sqlSession.commit();

        sqlSession.close();
    }
@Test
    public void testUpdateids() throws IOException {

       int [] ids =  {3,4,8};


//        Map map = new HashMap();
////        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandNanme",brandNanme);

        String resource = "MyBatis05/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
//        ture关闭事务（自动提交）默认是手动提交
        SqlSession sqlSession =sqlSessionFactory.openSession(true);

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        brandMapper.deleteBys(ids);
//提交事务
        sqlSession.commit();

        sqlSession.close();
    }
}
