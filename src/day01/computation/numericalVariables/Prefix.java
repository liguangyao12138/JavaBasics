package day01.computation.numericalVariables;

/**
 *  @author: liguangyao
 *  Date: 2021/3/7
 *  Time: 15:33
 *  Description: 2.1.2 特殊数字的表达
 */
public class Prefix {

    public static void main(String[] args) {

        //二进制数 “0b”开头
        int binary = 0b11;
        System.out.println("binary = "+binary);

        //八进制数 "0"开头
        int octonary = 011;
        System.out.println("octonary = "+octonary);

        //十六进制 "0x"开头
        int hexadecimal = 0x11;
        System.out.println("hexadecimal = "+hexadecimal);
        int hexLetter = 0xff;
        System.out.println("hexLetter = "+hexLetter);

        //默认十进制
        int decimal = 11;
        System.out.println("decimal = "+decimal);

        long l = 7444443881l;
        System.out.println("l = "+l);

        float f = 3.14f;
        System.out.println("f = "+f);

        int i = 960_0000;
        System.out.println("i = "+i);

        double d = 1.5E8;
        System.out.println("d  = "+d);

    }
}
