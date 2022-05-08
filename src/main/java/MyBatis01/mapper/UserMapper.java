package MyBatis01.mapper;

import MyBatis01.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

//    List<User> selectAll();
@Select("select * from b where age = #{age};")
    User selectById(int age);

//    User select(@Param("nme") String nme, @Param("age") int age);

}
