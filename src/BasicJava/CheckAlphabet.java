package BasicJava;

public class CheckAlphabet {
    public static void main(String[] args) {
        char ch = '&';
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("Given "+ch +" is alphabet");
        }else{
            System.out.println("Given "+ch +" is special symbol");
        }
    }
}
