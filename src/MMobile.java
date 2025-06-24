public class MMobile {
    String Company;
    int Cost;
    MSim Sim;

    MMobile(String Company , int Cost){
        this.Company = Company;
        this.Cost = Cost;
    }

    public void Capture(){
        System.out.println("Capturing Photo");
    }

    public  void Call(MSim Sim){
        this.Sim = Sim;
        System.out.println("Calling from "+this.Sim.name);
    }
}
