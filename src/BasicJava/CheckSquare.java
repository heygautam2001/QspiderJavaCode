package BasicJava;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        System.out.println("main starts : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println(n * n);
        }
        System.out.println("Main ends : ");

        if (!(n % 1 == 0.0)) {
            System.out.println();
        }

        if(!(n % 10 == 0)){
            System.out.println(n*n*n);
        }

    }
}
