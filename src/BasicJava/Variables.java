package BasicJava;
/*
* types of variable
* Primitive or non-primitive
* */
public class Variables {
    public static void main(String[] args) {
        //Declarations
        int x;
        int y;
        int z;
        //initialization
        x = 21;
        y = 23;
        z = 89;
        System.out.println(x+" "+y+" "+z);

        //Declaration and initialization in a single line
        int a = 1;
        int b = 4;
        int c = 3;
        System.out.println(a+" "+b+" "+c);

        // Declaration and initialization in a single line of multiple variable

        int m = 6; int n = 7 ; int o = 8;
        System.out.println(m+" "+n+" "+o);

        int d ; int e; int f;
        d = 00; e = 78; f = 90;
        System.out.println(d+" "+e+" "+f);

        int w = 23 , k = 56;
        System.out.println(w+" "+k);

        int p , q , r = 34 ;
        System.out.println(r);
        p = q = r;
        System.out.println(p);
        System.out.println(q);



    }
}
