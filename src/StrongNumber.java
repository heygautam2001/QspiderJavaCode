public class StrongNumber {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;

        }
        return  fact;
    }

    public static boolean isStrongNum(int num)
    {
        int temp = num;
        int sum = 0;
        while (num != 0){
            sum = sum + factorial(num%10);
            num = num/10;
        }

        if(temp == sum)
            return true;


        return false;

    }


    public static void main(String[] args) {
        System.out.println(isStrongNum(144));
    }
}
