import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer data ");
        int n = sc.nextInt();
        System.out.println("Integer data is :"+n);

        System.out.println("Enter Byte data ");
        byte b = sc.nextByte();
        System.out.println("Byte data is :"+b);

        System.out.println("Enter Long data ");
        long l = sc.nextLong();
        System.out.println("Long data is :"+l);

        System.out.println("Enter short data ");
        short s = sc.nextShort();
        System.out.println("Short data is :"+s);

        System.out.println("Enter float data ");
        float f = sc.nextFloat();
        System.out.println("Float data is :"+f);

        System.out.println("Enter Double data ");
        double d = sc.nextDouble();
        System.out.println("Byte data is :"+n);

        System.out.println("Enter Byte data ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean data is :"+bool);

        System.out.println("Enter String data ");
        String str = sc.next(); // Only single word
        System.out.println("String data is :"+str);

        System.out.println("Enter String data ");
        String str1 = sc.nextLine(); // Only single word
        System.out.println("String data is :"+str);

        System.out.println("Enter char data ");
        char ch  = sc.next().charAt(0); // Only single word
        System.out.println("Char data is :"+ch);
    }
}
