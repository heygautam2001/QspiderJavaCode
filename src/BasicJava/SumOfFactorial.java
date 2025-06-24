package BasicJava;

public class SumOfFactorial {

    public static  int factorial(int num){
        if (num == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
//        System.out.println(fact);
        return  fact;
    }
    public static int SumFactorial(int num){
        int sumFact = 0;
        while(num > 0){
            sumFact = sumFact + factorial(num%10);
            num = num / 10;
        }
        return sumFact;
    }
    public static void main(String[] args) {
        System.out.println(SumFactorial(123));

    }
}
