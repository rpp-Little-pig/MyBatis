package MyBatis06.mapper;

import MyBatis06.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
//    用户登入
@Select("select * from tb_user where username = #{username} and password =#{password}")
User select (@Param("username") String username , @Param("password") String password);
}
