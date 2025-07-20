package abstraction;

public class I3 implements I1 , I2{
    @Override
    public void m1() {
        System.out.println("I am M1 Method");
    }

    @Override
    public void m2() {
        System.out.println("I am M2 method");
    }

    public static void main(String[] args) {
        I1 i = new I3();
        i.m1();
        I2 i2 = new I3();
        i2.m2();

    }
}
