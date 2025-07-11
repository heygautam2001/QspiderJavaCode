package Inheritance;

class Animals{
 public void speak(){
     System.out.println("Animal speaks...");
 }
}
class Dogs extends Animals{
    @Override
    public void speak(){
        System.out.println("Dog Barks ....");
    }

}
public class Overriding {
    public static void main(String[] args) {
        Animals a = new Dogs();
        a.speak();
    }
}
