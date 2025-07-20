package abstraction;

public interface Icon {
    double i = 2.2; // Public static final double i;

    public static void main(String[] args) {
        System.out.println("Interface is executed !");
        System.out.println(i);

    }
    //java 8
    default void test(){
        System.out.println("Default implemented method...");
    }
    // java9
    private static void h2(){
        System.out.println("Private static method... ! ");
    }

    //java 9
    private void h1(){
        System.out.println("Private non statioc method ! ");
    }

    void m1(); // public abstract void m1
}
