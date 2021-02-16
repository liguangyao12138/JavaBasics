package day01.object;

/**
 * @author liguangyao
 * @date 2021/1/4 0:19
 * @description： toString()使用
 */
public class DemoToString {
    public static void main(String[] args) {

        Person p = new Person("张三",18);
        String s = p.toString();

        System.out.println(s);

        System.out.println(p);
    }
}
