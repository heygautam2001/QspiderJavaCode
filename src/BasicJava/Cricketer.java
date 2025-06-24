package BasicJava;

public class Cricketer {
    String name;
    int age;
    int runs;
    Cricketer(String name){
        this.name = name;
        System.out.println(this.name);
    }

    Cricketer(String name , int age){
        this(name);
        this.age = age;
        System.out.println(this.age);
    }

    Cricketer (String name , int age , int runs){
        this(name , age);
        this.runs = runs;
        System.out.println(this.runs);
    }

    public static void main(String[] args) {
        Cricketer c = new Cricketer("Virat Kohli" , 34 , 10000);
    }

}
