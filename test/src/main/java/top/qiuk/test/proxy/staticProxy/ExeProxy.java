package top.qiuk.test.proxy.staticProxy;

public class ExeProxy implements IExe{

    private Exe exe;

    public ExeProxy(Exe exe) {
        this.exe = exe;
    }


    public void execute(){

        System.out.println("ExeProxy  before");
        exe.execute();
        System.out.println("ExeProxy  afert");



    }

}
