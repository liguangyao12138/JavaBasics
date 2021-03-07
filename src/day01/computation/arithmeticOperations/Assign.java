package day01.computation.arithmeticOperations;

/**
 * @author: liguangyao
 * Date: 2021/3/7
 * Time: 16:54
 * Description: 2.2.2 赋值运算符
 */
public class Assign {
    public static void main(String[] args) {

        int x = 1+1;
        x = x + 7;
        System.out.println("x = "+x);

        x += 7;
        System.out.println("x= "+x);

        //左移两位
        x<<=2;
        System.out.println("x= "+x);

        //右移两位
        x>>=2;
        System.out.println("x= "+x);

    }
}
