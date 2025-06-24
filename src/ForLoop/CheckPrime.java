package ForLoop;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 11;
        int count = 1;
        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0)
                count++;
        }

        if (count > 1)
            System.out.println("Not prime");
        else
            System.out.println("Prime Number");
    }
}
