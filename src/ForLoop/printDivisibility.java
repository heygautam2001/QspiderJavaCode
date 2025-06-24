package ForLoop;

public class printDivisibility {
    public static void printDivisible(int num1 , int num2 , int range){
        for (int i = 1; i <= range ; i++) {
            if(i % num1 == 0 || i % num2 == 0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printDivisible(3,5,50);
    }
}
