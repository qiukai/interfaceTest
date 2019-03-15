package top.qiuk.test.share;

public class ExeProxy<P,R,kejl,seljfl> {

    private IExe<P,R> iExe;

    public ExeProxy(IExe<P,R> iExe) {
        this.iExe = iExe;
    }


    public R execute(P p){


        R r = iExe.exe(p);



        R r1 = iExe.exe1(p);



        R r2 = iExe.exe2(p);

        return r;

    }

}
