package userLogin;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 11:17
 */
public interface UserMapper {
    //用户登录
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String name, @Param("password") String password);

    @Select("select *from tb_user where username = #{username}")
    User selectByUsername(String name);
    
    @Insert("insert into tb_user values (null, #{username}, #{password})")
    void add(User user);
}
