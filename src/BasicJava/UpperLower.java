package BasicJava;

public class UpperLower {

    public static char UpperLowerCase(char ch){
//        if(ch >= 'A' && ch <= 'Z')
//        {
//            return (char)(ch+32);
//        }else{
//            return (char)(ch-32);
//        }
        return ch >= 'A' && ch <= 'Z' ? (char)(ch+32) : (char)(ch-32);
    }
    public static void main(String[] args) {
        char ch =   UpperLowerCase('A');
        System.out.println(ch);
    }
}
