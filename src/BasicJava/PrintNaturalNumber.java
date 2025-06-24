package BasicJava;

public class PrintNaturalNumber {
  public  static void printNatural(){
      for (int i = 10 ; i >= 1; i--){
          System.out.println(i);
      }
  }

  public static void printSquare(){
      int num = 6;
      System.out.println(num*num);
  }
  public static void printFactor(){
      int num = 36;
      for (int i = 1; i < num/2 ; i++) {
//          if(num%i == 0)
//              System.out.println(i);

          System.out.println((num%i == 0));
      }

  }


    public static void main(String[] args) {
//        printNatural();
//        printSquare();
        printFactor();

    }
}
