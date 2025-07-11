class Chair {
    public static void canFold(){
        System.out.println("you can fold it 180 degreee");
    }
}

class PremiumChair extends Chair{
    public static void canFold(){
        System.out.println("You can fold it 360 degree");
    }
}


public class DriverJava {
    public static void main(String[] args) {
        Chair c = new PremiumChair();
        c.canFold();
    }
}
