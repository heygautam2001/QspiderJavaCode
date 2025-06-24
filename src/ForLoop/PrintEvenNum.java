package ForLoop;

public class PrintEvenNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.println("Even Num : " + i);
            else
                System.out.println("Odd Num : " + i);
        }
    }
}
