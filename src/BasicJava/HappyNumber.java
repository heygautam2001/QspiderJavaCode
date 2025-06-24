package BasicJava;

public class HappyNumber {
    public static int squareDigitSum(int num){
        int sum = 0;
        for (int i = 1; num > 0 ; i++) {
            sum = sum + (num % 10) * (num%10);
            num = num/10;
        }

        return sum;
    }

    public static boolean isHappyNumber(){
        return false;

    }

    public static boolean isHappyNumber(int num){
        if(num == 7 || num == 1){
            return  true;
        }
        while(num > 9 ){
            int sum = 0;
            while(num != 0){
                sum = sum + (num%10)*(num%10);
                num = num/10;
            }

            num = sum;
        }

        return num == 1;
    }

    public static  boolean isHappyNum1(int num){
        for (int i = 1; num != 1 && num != 4 ; i++) {
            int sum = 0;
            for (int j = 1; num != 0 ; j++) {
                sum = sum + num % 10 * num % 10;
                num = num/10;
            }

            num = sum;
        }
        return num == 1;
    }
// num != 1 && num != 4
    public static void main(String[] args) {
        System.out.println(squareDigitSum(320));
        System.out.println(isHappyNumber(4));
    }
}
