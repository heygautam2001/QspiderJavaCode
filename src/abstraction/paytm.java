package abstraction;

public class paytm extends OnlineService {

    User us = new User();

    @Override
    public void pay(int a , String name , int age ){
        if (authenticate(name,age)){
            if(a <= us.getBal())
                System.out.println("Successfully transferred ....");
            else
                System.out.println("transactioned declained ....");

        }else{
            System.out.println("Authentication Error....... !");
        }
    }

    @Override
    public boolean authenticate(String name, int age) {
        if (us.getName() == name && us.getAge() == age)
            return true;
        else
            return false;
    }

    @Override
    public void getDetails(String name) {
        if (name == us.getName()){
            System.out.println("Name: "+us.getName()+" Age: "+us.getAge()+" Balance: "+us.getBal());
        }

    }
}
