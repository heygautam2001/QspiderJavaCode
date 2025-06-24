package BasicJava;

public class SmallestOfThreeNumber {
    public static void main(String[] args) {
        int a = 18;
        int b = 10;
        int c = 55;
        if(a > b && a > c)
            System.out.println(a+" is greater among "+a+" " +b+" " +c+" ");
        else if (b > a && b > c)
            System.out.println(b+" is greater among " +a+" " +b+" " +c+" ");
        else
            System.out.println(c+" is greater among "+a+" " +b+" " +c+" ");


        if(a < b && a < c)
            System.out.println(a+" is smallest among "+a+" " +b+" " +c+" ");
        else if (b < a && b < c)
            System.out.println(b+" is smallest among " +a+" " +b+" " +c+" ");
        else
            System.out.println(c+" is smallest among "+a+" " +b+" " +c+" ");
    }
}
