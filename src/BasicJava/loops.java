package BasicJava;

public class loops {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int revNum = 0;
        while(num != 0){
            revNum = revNum * 10 + num % 10;
            num = num/10;
        }
         if (revNum == temp)
             System.out.println("Number is palindrome");
         else
             System.out.println("Not palindrome");
    }
}
