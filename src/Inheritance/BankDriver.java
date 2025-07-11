package Inheritance;
class Bank {
    long accountNum = 786543219l;
    String accType = "Saving";
    int bal = 100;

    void deposit(int amount){
        bal += amount;
    }
}

class hdfc extends Bank{
    int bal;
    String accType;

    void openAccount(int bal){
        if(bal < super.bal)
            System.out.println("Cannot be opened");
        else{
            this.bal = bal;
            System.out.println("account successfully Opened"+this.bal);
        }
    }

    double checkLoanInterest(String accType){
        if(accType == super.accType && bal >= super.bal)
            return 8.0;
        else {
            System.out.println("Sorry Try Again ");
            return 0.0;
        }


    }
}
public class BankDriver {
    public static void main(String[] args) {
        hdfc Govind = new hdfc();
        Govind.deposit(4000);
        System.out.println(Govind.bal);
    }
}
