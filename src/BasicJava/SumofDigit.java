package BasicJava;

public class SumofDigit {
    public static int DigitSum(int num){
        int sum = 0;
        for (int i = 1; num != 0 ; i++) {
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(DigitSum(123));
    }
}
