package abstraction;

abstract public class OnlineService {

    public abstract void pay(int amount , String name , int age);
    public abstract  boolean authenticate(String name , int age);
    public abstract void getDetails(String name);

}

