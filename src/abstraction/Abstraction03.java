package abstraction;
abstract public class Abstraction03 {
     abstract void setName();
     abstract void CheckBal();
     public static String sayHello(){
         return "Hello";
     }
     public static void main(String[] args) {
        Abstraction03 abs = new subClass(); // Upcasting
        abs.CheckBal();
    }
}
//class subClass extends Abstraction03{
//     //Class 'subClass' must either be declared abstract or implement abstract method 'setName()' in 'Abstraction03'
//}
// abstract class subClass extends Abstraction03{
//     // NO Error...
//}

 class subClass extends Abstraction03{
    public void setName(){
        System.out.println("Hello , My name is Gautam");
    }

    public void CheckBal(){
        System.out.println("Your Bal is Balance ");
    }
}