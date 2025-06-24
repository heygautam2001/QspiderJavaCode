package ForLoop;

public class SumProduct {
    public static void prodSum(int st, int en) {
        int sum = 0;
        int prod = 1;


        if (st < en) {
            for (int i = st + 1; i < en; i++) {
                sum = sum + i;
                prod = prod * i;

            }
        } else {
            for (int j = en + 1; j < st; j++) {
                sum = sum + j;
                prod = prod * j;

            }
        }

        System.out.println("sum is " + sum);
        System.out.println("prod is " + prod);


    }

    public static void range(int x, int y) {
        int sum = 0, prod = 1;
        int n1 = x < y ? x : y;
        int n2 = x > y ? x : y;

        for (int i = n1 + 1; i < n2; i++) {
            sum = sum + i;
            prod = prod * i;
        }
        System.out.println("sum : " + sum);
        System.out.println("prod :  " + sum);
    }

    public static void main(String[] args) {
        prodSum(1, 5);
//        prodSum(5, 1);

//        range(2, 4);
    }
}
