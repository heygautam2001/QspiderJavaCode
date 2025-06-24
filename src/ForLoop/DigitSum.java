package ForLoop;

public class DigitSum {
    public static void main(String[] args) {
        int digit = 123456;
        int sum = 0;
        for (int i = 1; digit != 0 ; i++) {
            sum = sum + digit%10;
            digit = digit/10;
        }

        System.out.println(sum);
    }
}
