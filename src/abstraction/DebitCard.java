package abstraction;

public class DebitCard implements Card{
    int balance = 1000;

    @Override
    public boolean pay(int amount){
        if(amount <= balance){
            System.out.println("Successdfull paid");
        }
            System.out.println("Insufficient balance");
            return false;

    }
    public void checkLimit(){
        System.out.println("Limit is : "+2*balance);
    }

    @Override
    public boolean getStatus(int score) {
        if (score > 50)
            System.out.println("You are eligible to take a loan");

        System.out.println("Not eligible for loan");
        return false;

    }
}
