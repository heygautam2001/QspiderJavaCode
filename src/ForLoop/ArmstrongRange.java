package ForLoop;

public class ArmstrongRange {
    public static void main(String[] args) {
            System.out.println("Armstrong numbers between 100 and 999 are:");

            for (int num = 100; num <= 999; num++) {
                int temp = num;
                int digitCount = 0;

                // Count digits
                int copy = num;
                while (copy != 0) {
                    digitCount++;
                    copy = copy / 10;
                }

                // Calculate Armstrong sum
                int ArmSum = 0;
                copy = num;
                while (copy != 0) {
                    int lastDigit = copy % 10;
                    ArmSum += Math.pow(lastDigit, digitCount);
                    copy = copy / 10;
                }

                // Check if Armstrong number
                if (ArmSum == num) {
                    System.out.println(num);
                }
            }
        }
    }


