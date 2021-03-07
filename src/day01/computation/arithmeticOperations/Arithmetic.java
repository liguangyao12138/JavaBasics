package day01.computation.arithmeticOperations;

/**
 * @author: liguangyao
 * Date: 2021/3/7
 * Time: 16:30
 * Description: 2.2.1 四则运算符
 */
public class Arithmetic {
    public static void main(String[] args) {

        //求和
        int sum = 1 + 2;
        System.out.println("sum = "+sum);

        //相减
        int differ = 7 - 3;
        System.out.println("differ = "+differ);

        //相乘
        int product = 5 * 6;
        System.out.println("differ = "+product);

        //除法
        int quotient = 81 / 9;
        System.out.println("quotient = "+quotient);

        //求余数
        int remainder = 40 % 3;
        System.out.println("remainder = "+remainder);

        int quotientInt = 25/4;
        System.out.println("quotientInt = "+quotientInt);

        double quotientDouble = 25.0/4;
        System.out.println("quotientDouble = "+quotientDouble);

        double quotientDecimal = 8.1/3;
        System.out.println("quotientDecimal = "+quotientDecimal);

        double remainderDecimal = 5.1%2;
        System.out.println("remainderDecimal = "+remainderDecimal);
    }
}
