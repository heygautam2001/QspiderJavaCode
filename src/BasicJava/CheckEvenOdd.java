package BasicJava;

public class CheckEvenOdd {
    public static void main(String[] args) {


        int num = 4;
        int ans = num / 2;

        if (ans * 2 == num) {
            System.out.println("The given number "+num +" is even");
        }else{
            System.out.println("The given number"+num +" is odd");
        }


    }
}