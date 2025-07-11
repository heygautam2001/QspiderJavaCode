package Inheritance;

public class Dog extends Animal {
    static {
        System.out.println("Dog class static block");
    }
    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(Animal.age);

    }

}
