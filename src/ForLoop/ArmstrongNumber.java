package ForLoop;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 9474;
        int temp = num;
        int digitCount = 0;
        for (int i = 1; num != 0 ; i++) {
            digitCount++;
            num = num/10;
        }
        System.out.println(digitCount);
        num = temp;
        int ArmSum = 0;
        for (int i = 1; num != 0 ; i++) {
            int lastDigit = num % 10;
            ArmSum = (int) (ArmSum + Math.pow(lastDigit , digitCount));
            num = num/10;

        }

        if (ArmSum == temp)
            System.out.println(temp+" is a Armstrong number");
        else
            System.out.println("Not armstrong");
    }
}
