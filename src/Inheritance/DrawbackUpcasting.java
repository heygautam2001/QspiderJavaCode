package Inheritance;
 class Doctor{
     public void checkPulse(){
         System.out.println("Checking pulse .....");
     }
 }

 class Cardiologist extends Doctor{
     public void Surgery(){
         System.out.println("Heart Surgery");
     }
 }

public class DrawbackUpcasting {
    public static void main(String[] args) {
        Doctor d = new Cardiologist();
        d.checkPulse();
//        d.Surgery();

        /*
        * java: cannot find symbol
          symbol:   method Surgery()
          location: variable d of type Inheritance.Doctor
        * */

        // Doing the down-casting

        Cardiologist c = (Cardiologist)d;
        d.checkPulse();
        c.Surgery();
    }
}


