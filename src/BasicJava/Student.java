package BasicJava;

public class Student {
    int id ;
    String name ;
    String address;
    Student(int id){
        this.id = id;
        System.out.println(1);

    }

    Student (int id , String name){
        this(id);
        this.name = name;
        System.out.println(2);
    }

    Student(int id , String name , String address){
        this(id , name);
        this.address = address;
        System.out.println(3);
    }

    public static void main(String[] args) {
        Student s = new Student(10 , "java" , "oracle");
    }
}
