package BasicJava;

public class GPseries {
   public static void printGp(int first , int ratio , int last){
       //2 4 8 16 32 64 128 ......
       int temp = first;

       for (int i = 1 ; i <= last ; i++) {
           System.out.println(i+" term => "+temp);
           temp = temp * ratio;
       }
   }
    public static int sumOfGp(int first , int ratio , int last){

       int temp = first;
       int sum = 0;
        for (int i = 1; i <= last ; i++) {
            sum = sum + temp;
            temp = temp*ratio;
        }
        return  sum;
    }


    public static void main(String[] args) {
     printGp(2,2,10);
        System.out.println( "sum of gp series is : "+sumOfGp(2,2 ,5));
    }
}
