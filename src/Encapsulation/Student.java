package Encapsulation;

public class Student {
    String name;
    int id;
    int age;
    int m1 , m2, m3;
    public void study(){
        System.out.println("Studying");
    }

    public void play(){
        System.out.println("playing");
    }

    public double getMarks(int id){
        if(this.id == id){
            return m1+m2+m3;
        }
        return 0.0;

    }
    public static void main(String[] args) {

    }
}
