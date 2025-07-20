package Inheritance;

 class Animal {
    static int age = 5;
    static {
        System.out.println("Static block of animal class");
    }
}
  class Dog extends Animal {
    static {
        System.out.println("Dog class static block");
    }
}

public class AnimalDriver{
    public static void main(String[] args) {
        System.out.println(Animal.age);
    }
}

