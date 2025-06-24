package ForLoop;

public class CountDigit {
    public static void main(String[] args) {
        int num = 2122175345;
        int count = 0;
        for (int i = 1; num != 0  ; i++) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
