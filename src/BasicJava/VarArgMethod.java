package BasicJava;

public class VarArgMethod {
    public static void m2(int a , double b){
        System.out.println("sum"+a+b);
    }
    public  static void m1(){
        System.out.println("No args method");
    }

    public static  void m3(int a){
        System.out.println("1-param method");
    }
    public static void m3(int... a){
        System.out.println("Var-args method");
    }
    public static void m1(double... a){
        System.out.println("Var args method");
        System.out.println(a);
    }
    public static void m4(int k , int... j){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        m1(1.2 , 2.0 , 3.5);
    }
}
