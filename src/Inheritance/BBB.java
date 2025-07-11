package Inheritance;

class A {
    int a ;
    int b;

    A(){
        System.out.println("No-arg constructor");
    }
    A(int a ){
        this();
        System.out.println("No-agr Constructor 1 para");

    }

    A(int a , int b){
        this(a);
        System.out.println("No arg constructor 2 para");

    }


}

class  C extends A{
    int x = 5;
    C(){
        super(5,10);
        System.out.println("All are called");
    }
}

public class BBB {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);
    }
}
