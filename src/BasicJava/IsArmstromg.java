package BasicJava;

public class IsArmstromg {
    public static  int countOfDigit(int num){
        int count = 0;
        while(num > 0) {
            num /= 10;
            count ++;
        }
        return count;
    }

    public static int power(int m , int n){

        int pow = 1;
        for (int i = 1; i <= n ; i++) {
            pow = pow * m;
        }
        return pow;
    }
    public static boolean isArmstrong(int num){
        int count = countOfDigit(num);
        int temp = num;
        int sum = 0;
        while(num > 0){
            sum = sum + power(num%10 , count);
            num/=10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
