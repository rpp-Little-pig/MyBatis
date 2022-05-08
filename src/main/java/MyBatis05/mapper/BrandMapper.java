package MyBatis05.mapper;

import MyBatis05.pojo.Brand;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    void deleteById(int id);

    void deleteBys(@Param("ids") int[] ids);

}
