package ForLoop;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num/2; i++) {
            for (int j = 1; j <= num/2 ; j++) {
                if (i*i == num)
                    System.out.println(i+"is a perfect Square");
            }
        }
    }
}
