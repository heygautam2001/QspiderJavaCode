class A {
    int i = 10;

}
class B extends  A{
    int i = 20;

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i);

        A a2 = new B(); //Upcasting
        System.out.println(a2.i);

        B b = (B)a2;
        System.out.println(b.i);



    }

}

public class Main {
    public static void main(String[] args) {

    }
}
