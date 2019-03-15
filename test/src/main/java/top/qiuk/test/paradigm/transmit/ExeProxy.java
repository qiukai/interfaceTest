package top.qiuk.test.paradigm.transmit;

public class ExeProxy<P,R extends P> implements IExe<P,R> {


    @Override
    public R exe(P p) {
        return (R) p;
    }
}
