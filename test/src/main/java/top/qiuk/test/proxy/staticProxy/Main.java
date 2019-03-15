package top.qiuk.test.proxy.staticProxy;

public class Main {


    public static void main(String[] args) {


        Exe exe = new Exe();
        ExeProxy exeProxy = new ExeProxy(exe);
        exeProxy.execute();

    }

}
