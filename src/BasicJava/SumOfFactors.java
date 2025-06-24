package BasicJava;

public class SumOfFactors {
    public static int sumOfFactor(int num){
        int sum = 0;
        for (int i = 1; i <= num/2 ; i++) {
            if(num%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfFactor(12));
    }
}
