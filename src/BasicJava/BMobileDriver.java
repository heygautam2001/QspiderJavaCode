package BasicJava;

public class BMobileDriver {
    public static void main(String[] args) {
        Battery b = new Battery(4000);
        BMobile m = new BMobile("Samsung" , 30000 , new Battery(5000));
    }
}
