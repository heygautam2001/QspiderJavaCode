package ForLoop;

public class Factorial {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        int fact = 1;

        for (int i = 1; i <= 25 ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println(factorial(7));
    }
}
