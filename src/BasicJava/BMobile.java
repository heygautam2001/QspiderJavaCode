package BasicJava;

public class BMobile {
    String brand;
    int price;
    Battery b;

    BMobile(String brand , int price , Battery b){
        this.brand = brand;
        this.price = price;
        this.b = b;
    }

    public void  calling(){
        System.out.println(" Ankit Calling ");
    }

}
