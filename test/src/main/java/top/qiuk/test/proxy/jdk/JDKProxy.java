package top.qiuk.test.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        Method[] methods = proxy.getClass().getMethods();

        for (Method method1 : methods) {
            System.out.println(method1.getName());
        }

        RealSubject realSubject = new RealSubject();
        realSubject.hello();


        return null;
    }



}
