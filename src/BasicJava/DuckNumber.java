package BasicJava;

public class DuckNumber {
    public static boolean isDuckNum(int num){
        if (num == 0 )
            return false;
        while(num > 0){
            if (num % 10 == 0){
                return true;
            }
            num = num /10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isDuckNum(8));
    }
}
