package BasicJava;

public class checkNumberCharacterAlphabet {
    public static void main(String[] args) {
        char ch = '*';

        if (ch >= '0' && ch <= '9')
            System.out.println(ch+" is number");
        else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' )
            System.out.println(ch+" is alphabet");
        else
            System.out.println(ch+" is special character");


    }
}
