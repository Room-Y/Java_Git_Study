package regex;

/**
 * @author: Java_cmr
 * @Date: 2022/12/28 - 3:18
 */
public class regex1 {
    public static void main(String[] args) {
        // \ 转义字符
        System.out.println("\"");
        System.out.println("\\");

        System.out.println("----------------------------------");

        //正则练习1
        //020-2324242  02122442  027-42424  0712-3242434
        String regex1 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex1));
        System.out.println("02122442".matches(regex1));
        System.out.println("027-42424".matches(regex1));
        System.out.println("0712-3242434".matches(regex1));
        System.out.println("----------------------------------");

        //邮箱号码
        String regex2 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex2));
        System.out.println("zhangsan@itcast.cnn".matches(regex2));
        System.out.println("dlei0009@163.com".matches(regex2));
        System.out.println("dlei0009@pci.com.cn".matches(regex2));
        System.out.println("----------------------------------");

        //24小时制
        String regex3 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex3));

    }
}
