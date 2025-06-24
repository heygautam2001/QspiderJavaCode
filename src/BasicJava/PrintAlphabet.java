package BasicJava;

public class PrintAlphabet {
    public static void main(String[] args) {

        for (int i = 122; i >= 97 ; i--) {

            System.out.println((char)i);
            System.out.println((char)(i-32));

//            System.out.println((char)i+" "+(char)(i-32));
        }

        for (int i = 65; i <= 90 ; i++) {
            System.out.println((char)i+" "+(char)(i+32));

        }
    }
}
