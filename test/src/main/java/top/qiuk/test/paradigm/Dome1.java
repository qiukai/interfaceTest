package top.qiuk.test.paradigm;

import java.util.ArrayList;
import java.util.List;

public class Dome1 {


    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new A());
        list.add("123");

        list.add(123);

        for (Object l : list) {
            System.out.println(l);
        }
        for (Object l : list) {
            A a = (A) l;
            System.out.println(a);
        }
    }
}
class A{

}