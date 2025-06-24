package ForLoop;


import java.util.ArrayList;

public class RemoveEvenNum {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1 , 3, 8, 0 , 5};
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                li.add(arr[i]);
        }

        for (var ele : li){
            System.out.print(ele+" ");
        }


    }
}

