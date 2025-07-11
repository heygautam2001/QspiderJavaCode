package abstraction;

public class User {

    private String name = "Aman";
    private int age = 54;
    private int bal = 100;

    public int getBal(){
        return bal;
    }

    public void setBal(int bal){
        this.bal = bal;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}
