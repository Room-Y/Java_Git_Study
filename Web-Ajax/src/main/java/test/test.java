package test;

import com.alibaba.fastjson.JSON;

/**
 * @author: Java_cmr
 * @Date: 2023/2/14 - 17:43
 */
public class test {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("12300");
        user.setAge(20);

        String s = JSON.toJSONString(user);
        System.out.println(s);

        User user1 = JSON.parseObject(s, User.class);
        System.out.println(user1);

    }
}
