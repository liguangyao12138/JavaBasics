package day01.computation.numericalVariables;

/**
 * @author: liguangyao
 * Date: 2021/3/7
 * Time: 16:05
 * Description: 2.1.3 强制类型转换
 */
public class Convert {
    public static void main(String[] args) {

        //同类型的变量之间相互赋值没有任何问题
        int yangtzeLength = 6397;
        System.out.println("长江的长度 = "+yangtzeLength);
        int riverLength = yangtzeLength;
        System.out.println("河流的长度 = "+riverLength);

        //不同类型的变量要强制转换
        long yangtzeLength_l = 6397;
        int riverLength_i = (int) yangtzeLength_l;
        System.out.println("河流的长度（类型转换）"+riverLength_i);

        long worldPopulation = 7444443881l;
        System.out.println("worldPopulation = "+worldPopulation);
        int shijierenkou = (int) worldPopulation;
        System.out.println("shijierenkou = "+shijierenkou);

        double pi = 3.1415926;
        System.out.println(pi);
        float pai = (float) pi;
        System.out.println("pai = "+pai);

        double price = 9.9;
        System.out.println("价格 = "+price);
        int value = (int) price;
        System.out.println("价格(int) = "+value);


    }
}
