package ForLoop;

public class FibbonacciNumber {
    public static void main(String[] args) {
        int term = 10;
        int first = 0;
        int second = 1;
        for (int i = 1; i <= term ; i++) {
            System.out.println(first +" ");
            int next =first+second;
            first = second;
            second = next;

        }
    }
}
