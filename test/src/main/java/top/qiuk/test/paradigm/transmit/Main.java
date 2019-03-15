package top.qiuk.test.paradigm.transmit;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {


        Main main = new Main();

        String t = main.getT("123");

        ArrayList<String> t1 = main.getT(new ArrayList<String>());

        HashMap t2 = main.getT(new HashMap<>());


        ExeProxy<String, String> stringStringExeProxy = new ExeProxy<>();
        String exe = stringStringExeProxy.exe("123");
        System.out.println(exe.toString());


    }


    public <T> T getT(T t) {
        return t;
    }

}
