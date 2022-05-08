package text;

import MyBatis03.mapper.BrandMapper;
import MyBatis03.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest03 {
    @Test
    public void testSelectAll() throws IOException {
        String resource = "MyBatis03/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        sqlSession.close();
    }
    @Test
    public void testSelectById() throws IOException {
        int id = 2;
        int status=1;
        String resource = "MyBatis03/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);

        sqlSession.close();
    }
    @Test
    public void testSelectByCondition() throws IOException {
        int status = 0;
        String companyName = "会啊速度和";
        String brandNanme = "好里";

//        处理参数
        companyName = '%'+companyName+'%';
        brandNanme = '%'+brandNanme+'%';
//2    封装对象
//        Brand brand =new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandNanme(brandNanme);

        Map map = new HashMap();
//        map.put("status",status);
        map.put("companyName",companyName);
        map.put("brandNanme",brandNanme);

        String resource = "MyBatis03/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        List<Brand> brands = brandMapper.selectByCondition(map);
        System.out.println(brands);


        sqlSession.close();
    }


@Test
    public void selectByConditionSingle() throws IOException {
        int status = 0;
        String companyName = "会啊速度和";
        String brandNanme = "好里";

//        处理参数
        companyName = '%'+companyName+'%';
        brandNanme = '%'+brandNanme+'%';
//2    封装对象
        Brand brand =new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandNanme(brandNanme);

//        Map map = new HashMap();
////        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandNanme",brandNanme);

        String resource = "MyBatis03/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);


        sqlSession.close();
    }
}
