package BasicJava;

public class WCar {
    String company;
    String model;
    int price;
    Wheel w;

    WCar(String company , String model , int price , Wheel w){
        this.company = company;
        this.model = model;
        this.price = price;
        this.w = w;

    }

    int Drive(){
        return w.wheelRpm;
    }
}
