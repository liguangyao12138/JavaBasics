package day01.object;

import java.util.ArrayList;

/**
 * @author liguangyao
 * @date 2021/1/4 0:29
 * @description：
 */
public class EqualsDemo {

    public static void main(String[] args) {

        Person p1 = new Person("小明",18);
        Person p2 = new Person("小明",18);
        Person p3 = new Person("小明",20);

        Boolean b1 = p1.equals(p2);
        System.out.println(b1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(6);
        System.out.println(arrayList);



    }


}
