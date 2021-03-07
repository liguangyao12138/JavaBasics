package day01.computation.arithmeticOperations;

/**
 * @author: liguangyao
 * Date: 2021/3/7
 * Time: 17:16
 * Description: 2.2.3 一元运算符
 */
public class UnaryOperator {

    public static void main(String[] args) {

        int x = 3;
        System.out.println("x = "+x);
        x++;
        System.out.println("x = "+x);
        x--;
        System.out.println("x = "+x);

        int y1 = x++;
        System.out.println("y1 = "+y1);
        int y2 = ++y1;
        System.out.println("y2 = "+y2);



    }
}
