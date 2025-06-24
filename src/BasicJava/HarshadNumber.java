package BasicJava;

public class HarshadNumber {
    public static boolean isHarshad(int num){
        int sum = 0;
        int temp = num;
        while(num != 0){
            sum = sum + num % 10;
            num = num /10;
        }

        if(temp%sum == 0)
            return true;


        return false;
    }

    public static void printHarshalRange(int range){
        for (int i = 1; i <= range; i++) {
            if(isHarshad(i) )
                System.out.println(i);
        }
    }



    public static void main(String[] args) {
        System.out.println(isHarshad(204));
        printHarshalRange(100);
    }
}
