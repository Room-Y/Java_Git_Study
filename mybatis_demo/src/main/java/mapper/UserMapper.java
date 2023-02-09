package mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @author: Java_cmr
 * @Date: 2023/2/9 - 11:40
 */
public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);
}
