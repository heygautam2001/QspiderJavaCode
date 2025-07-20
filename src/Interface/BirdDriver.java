package Interface;

import java.util.Scanner;

public class BirdDriver {
    public static void main(String[] args) {
        Bird b = new Crow(); // upcasting
        b.fly();
        b.eat();
        b.makeSound();

//      Crow c = (Crow)b; // down-casting is there
//      ((crow) b).searchForWater();
//        C.searchForWater();

        System.out.println("1 for search water" + " 2 for hunt");
        int choice = 2;
        switch (choice) {
            case 1: {
                if (!(b instanceof Crow)) {
                    b = new Crow();
                }
                Crow c = (Crow) b;
                c.searchForWater();

            }
            break;

            case 2: {
                if (!(b instanceof Eagle)) {
                    b = new Eagle();
                }
                Eagle e = (Eagle) b;
                e.hund();
                e.eat();
                e.fly();
                e.makeSound();
            }
        }


    }
}

//import java.util.Scanner;
