package ForLoop;

public class CheckPalindrome {
    public static void isPalindrome(int num){
        int temp = num;
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if (rev == temp)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
    public static void main(String[] args) {
        isPalindrome(121);
    }
}
