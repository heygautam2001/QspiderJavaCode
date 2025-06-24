package ForLoop;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting value of range..");
        int st = sc.nextInt();
        System.out.println("Enter ending value of range..");
        int end = sc.nextInt();
        for (int i = st; i <= end; i++) {
            int count = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 1)
                System.out.println(i + " is prime number.");

        }
    }
}
