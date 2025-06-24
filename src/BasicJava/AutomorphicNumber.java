package BasicJava;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int num){
       int temp = num;
       int numSqr = num*num;

       //Count the Digits in original number
        int cntDigit = 0;
        while (temp != 0){
            cntDigit++;
            temp/=10;
        }

        // fetching that digit which is going to fetch from number for comparision.
        int modulus = (int)Math.pow(10,cntDigit);
        int digitCmp = numSqr % modulus;

        if (num == digitCmp)
            return true;

        return false;

    }
    public static void main(String[] args) {
        System.out.println(isAutomorphic(6));
    }
}
