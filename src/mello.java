public class mello {
    public static boolean isPrime(int number){
        if(number <= 1)
            return false;
        if (number == 2)
            return true;
        if(number % 2 == 0)
            return false;
        int count = 0;
        for (int i = 3; i <= number/2 ; i++) {
            if(number % i == 0)
                count++;
        }

        if (count > 0)
            return false;

        return true;

    }

    public static int findNthPrimeNumber(int nthValue){
        int count = 0;
        int num = 1;

        while (count <  nthValue){
            num++;
            if (isPrime(num))
                count++;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(59));
        System.out.println(findNthPrimeNumber(4));
    }
}










class DigitSum{
    static  int countDigit(int n){
        int count = 0;
        while (n != 0){
            count++;
            n=n/10;
        }
        return count;
    }

    static int DigitSum(int num){
        int temp = num;
        int sum = 0;
        int  x = countDigit(num)/2;
        System.out.println(x);
        for (int i =1; i <= x ; i++)
        {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}