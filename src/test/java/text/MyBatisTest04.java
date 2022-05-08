package text;

import MyBatis04.mapper.BrandMapper;
import MyBatis04.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest04 {
    @Test
    public void selectByConditionSingle() throws IOException {
        int status = 0;


        String companyName = "度和";
        String brandNanme = "里y";

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

        String resource = "MyBatis04/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
//        ture关闭事务（自动提交）默认是手动提交
        SqlSession sqlSession =sqlSessionFactory.openSession(true);

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        brandMapper.add(brand);

//提交事务
//        sqlSession.commit();

        sqlSession.close();
    }
@Test
    public void selectByConditionSingle2() throws IOException {
        int status = 0;


        String companyName = "度和";
        String brandNanme = "里y";

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

        String resource = "MyBatis04/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
//        ture关闭事务（自动提交）默认是手动提交
        SqlSession sqlSession =sqlSessionFactory.openSession(true);

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        brandMapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);

//提交事务
//        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        int status = 0;
        int id = 13;

        String companyName = "ggh";
        String brandNanme = "里y";

//        处理参数
        companyName = '%'+companyName+'%';
        brandNanme = '%'+brandNanme+'%';
//2    封装对象
        Brand brand =new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandNanme(brandNanme);
        brand.setId(id);


//        Map map = new HashMap();
////        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandNanme",brandNanme);

        String resource = "MyBatis04/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession sqlSession =sqlSessionFactory.openSession();
//        ture关闭事务（自动提交）默认是手动提交
        SqlSession sqlSession =sqlSessionFactory.openSession(true);

        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandNanme);
        int updata = brandMapper.updata(brand);
        System.out.println(updata);
//提交事务
//        sqlSession.commit();

        sqlSession.close();
    }
}
