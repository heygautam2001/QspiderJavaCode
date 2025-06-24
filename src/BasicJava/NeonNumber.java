package BasicJava;

public class NeonNumber {
    public static  boolean isNeonNum(int num){
//        int temp = num;
        int sqrNum = num * num;
        int temp = sqrNum;
        int sqrSum = 0;

        while(sqrNum != 0){
            sqrSum+= sqrNum%10;
            sqrNum/=10;
        }

        if (sqrSum == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isNeonNum(9));
    }
}
