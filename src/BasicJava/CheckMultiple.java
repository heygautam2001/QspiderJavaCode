package BasicJava;

public class CheckMultiple {
    public static void main(String[] args) {
        int num = 64;
        if(num % 8 == 0){
            if(num % 3 == 0 && num % 6 == 0){
                System.out.println("The number "+num +" is multiple of 8 , 3 and 6");
            }
            else{

                System.out.println("The number "+num +" is not multiple of 3 and 6");
            }
        }

        else{
            System.out.println("The number "+num +" is not multiple of 8");
        }
//        System.out.println("End");
    }
}
