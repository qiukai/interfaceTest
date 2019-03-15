package top.qiuk.test.proxy.jdk;

import java.lang.reflect.Proxy;

public class Main {


    public static void main(String[] args) {

        JDKProxy jdkProxy = new JDKProxy();
        Class[] classes = new Class[1];
        classes[0] = Subject.class;
        Subject o = (Subject) Proxy.newProxyInstance(jdkProxy.getClass().getClassLoader(), classes , jdkProxy);
        o.request();


    }
}












