package ForLoop;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {2 , 5, 8, 9 , 3};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
