package ForLoop;

public class AverageOfElement {
    public static void main(String[] args) {
        float[] arr = {1 , 2, 3, 4, 5 , 6};
        float sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        float average = sum/arr.length;

        System.out.println(average);
    }
}
