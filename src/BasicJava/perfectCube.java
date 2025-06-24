package BasicJava;

public class perfectCube {
    public static boolean isPerfect(int num) {

        double cbrt = Math.cbrt(num);
        if(cbrt * cbrt * cbrt == num)
            return true;
        else
            return false;


//        for (int i = 1; i * i * i <= num/3; i++) {
//            if (i * i * i == num)
//                return true;
//
//      }
//        return false;

    }
    public static void main(String[] args) {
        System.out.println(isPerfect(125  ));
    }
}
