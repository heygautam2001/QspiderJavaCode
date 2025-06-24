package ForLoop;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        for (int i = 1; num != 0 ; i++) {
            rev = rev*10 + num%10;
            num = num/10;
        }

        System.out.println(rev);

    }
}