package BasicJava;

public class WDriver {

    public static void main(String[] args) {
        WCar w = new WCar("Ford","MustangB667",5000000 , new Wheel("FordTyres" , 576));
        System.out.println(w.Drive());



    }
}
