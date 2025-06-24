package BasicJava;

public class sumOfSquare {
    public static int sumOfSquare(int a , int b){
        int aSquare = a*a;
        int bSquare = b*b;
        int sumSquare = aSquare + bSquare;
        return sumSquare;
    }
    public static void main(String[] args) {

        System.out.println(sumOfSquare(5 , 3));

    }
}
