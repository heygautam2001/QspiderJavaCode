package BasicJava;

public class perfectNumber {
    public static boolean isPerfect(int num) {

        int sumOfFactor = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfFactor += i;
            }
        }
        if (sumOfFactor == num)
            return true;
        else
            return false;
    }

    public static int isPerfectNum(int num) {
        if (isPerfect(num))
            return num;
        else {
            while (true) {
                boolean res = isPerfect(++num);
                if (res)
                    break;
            }

        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNum(16));
    }
}
