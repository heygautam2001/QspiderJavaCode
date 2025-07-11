package Inheritance;

class Phone{
    public  void call(){
        System.out.println("Calling.... pahadi Ji");

    }

    public void sendMsg(){
        System.out.println("Sending Msg to Bihari Jii");
    }
}

class smartPhone extends Phone{
      public void connectWifi(){
          System.out.println("Connection to wifi");
      }
        }
public class upcasting {
    public static void main(String[] args) {
        smartPhone s = new smartPhone();
        Phone p = s; // UpCasting
        p.call();



    }
}


