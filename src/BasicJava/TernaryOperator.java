package BasicJava;

public class TernaryOperator {
    public static void main(String[] args) {
        char ch = '5';
        String s = (ch >= '0' && ch <= '9') ? "number" : "not a number";
        String z  = (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) ? "Not special" : "special";
        System.out.println(z);

        int num = 25;
        boolean x = num % 10 == 5 ? true : false;
        System.out.println(x);


        int a = 2;
        int b = 4;
        int c = 23;

        String s1 = a > b && a > c ? "a is greater" : (b > c ? "b is greater" : "c is greater" );
        System.out.println(s1);

    }
}
    //Write a java pr to check whether a given character is special char or not.
    //Write a java program to find largest of three Number.
    //Write a java program to check whether s given number contains 5 or not at the unit place.