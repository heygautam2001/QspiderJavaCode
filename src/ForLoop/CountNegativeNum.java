package ForLoop;

public class CountNegativeNum {
    public static void main(String[] args) {
        int arr[] = {2 , -9 , - 6, 4 , -3 , 2, -1};
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0){
                count++;
                System.out.println(arr[i]);
            }

        }
        System.out.println(count);
    }
}
