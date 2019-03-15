package top.qiuk.test.paradigm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dome {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("123");

        list.add(123);

        for (Object o : list) {

           String s = (String) o;


        }


        Map<String,Object> map = new HashMap<>();
        map.put("123",list);

    }
}
