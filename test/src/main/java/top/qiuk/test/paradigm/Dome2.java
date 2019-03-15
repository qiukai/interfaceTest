package top.qiuk.test.paradigm;

import lombok.Data;

public class Dome2 extends B<CEntity> {

    @Override
    CEntity get() {
        CEntity c = new CEntity();
        c.setName("123");
        return c;
    }
}

class D{
    public static void main(String[] args) {
        Dome2 dome2 = new Dome2();
        CEntity cEntity = dome2.get();
        System.out.println(cEntity.getName());
    }
}



abstract class B<T> {
    abstract T get();

}

@Data
class CEntity{
    private String name;
}