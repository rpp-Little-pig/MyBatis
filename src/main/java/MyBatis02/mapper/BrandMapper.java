package MyBatis02.mapper;

import MyBatis02.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

/*
*查询所有
*/
    List<Brand> selectAll();

    /*
    根据id查询
    * */
    Brand selectById(int id);

    /*
     *条件查询:
     * * *参数接受
     *      1,散装参数:如果方法中有多个参数,需要使用@Param（“SQL参数占位符名称”）
     *      2,对象参数:对象的属性名称要和参数占位符名称一致
     *      3,map集合参数:
     */

//    List<Brand> selectByCondition(@Param("status") int status,@Param("companyName") String companyName
//            ,@Param("brandNanme") String brandNanme);

    List<Brand> selectByCondition(Brand brand);
//
//    List<Brand> selectByCondition(Map, map);
}
