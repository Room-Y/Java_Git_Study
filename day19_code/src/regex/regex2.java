package regex;

/**
 * @author: Java_cmr
 * @Date: 2022/12/28 - 23:36
 */
public class regex2 {
    public static void main(String[] args) {
        //用户名要求  大小写字母，数字，下划线4-16
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("#5rsds".matches(regex1));
        System.out.println("65".matches(regex1));

        System.out.println("--------------------------------");

        //身份证要求
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";
        String regex4 = "[1-9]\\d{16}(\\d|(?i)X)";
        System.out.println("12345678912345678X".matches(regex2));
        System.out.println("12345678912345678X".matches(regex3));
        System.out.println("12345678912345678X".matches(regex4));

        System.out.println("--------------------------------");



        //身份证严格校验
        //410801  1993  02  28  457x
        //省份  [1-9]\\d{5}
        //年   (18|19|20)\\d{2}
        //月  (0[1-9]|1[0-2])
        //日  0[1-9]|[12]\\d|3[01]
        //最后四位  \\d{3}[\\dXx]
        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])0[1-9]|[12]\\d|3[01]\\d{3}[\\dXx]";

        String anyrule = "[1-9]\\d{5}(18|19|20)\\d{2}(0\\d|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
    }
}
