package ForLoop;

public class PrintTable {
    public static void printTable(int num){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }

    public static void main(String[] args) {
        printTable(5);
    }
}
