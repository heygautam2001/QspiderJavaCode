package BasicJava;

public class LCM {
    public static int LCM(int a , int b){
        int i = a>b ? a : b;
        int lcm = 0;
        while(i <= a*b){
            if (i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
            i++;
        }
           return lcm;

    }
    public static void main(String[] args) {

    }

}
