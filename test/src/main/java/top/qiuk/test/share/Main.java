package top.qiuk.test.share;

public class Main {


    public static void main(String[] args) {


        String execute = new ExeProxy<>(new IExe<String, String>() {
            @Override
            public String exe(String s) {
                return s;
            }

            @Override
            public String exe1(String s) {


                return s;
            }

            @Override
            public String exe2(String s) {
                return s;
            }
        }).execute("123");


        System.out.println(execute);

    }

}
