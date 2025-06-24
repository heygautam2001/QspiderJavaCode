package Encapsulation;

public class Driver {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        System.out.println(l1.getBrand());
        l1.setBrand("MacBook");
        System.out.println(l1.getBrand());

        l1.setCost(150000);
        System.out.println(l1.getCost());
    }
}
