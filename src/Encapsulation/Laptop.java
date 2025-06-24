package Encapsulation;

public class Laptop {
    public String brand = "Lenovo";
    private int cost = 20000;

    public String getBrand(){
        return brand;
    }

    public  void setBrand(String brand){
        this.brand = brand;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

}
