package BasicJava;

public class XylemNum {
    public static boolean isXylem(int num){
        int originalNum = num;
        int firstDigit = 0;
        int lastDigit = num % 10; // fetch the last Digit
        int meanSum = 0;

        //Removing the last Digit
        num/=10;
        while (num >= 10){
            meanSum = meanSum+num%10;
            num/=10;
        }
        firstDigit = num;
        int extremeSum = firstDigit+lastDigit;

        if ( extremeSum == meanSum)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isXylem(14390));
    }
}
