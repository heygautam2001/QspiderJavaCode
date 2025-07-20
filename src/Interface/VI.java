package Interface;

public class VI extends Voda implements Company , ServiceProvider {
  boolean isRegister = true;
    @Override
    public boolean register() {
        if(isRegister)
            return true;
        return false;
    }

    @Override
    public void getInfra() {
        System.out.println("Your Infrastructuer is ready");
    }

    @Override
    public void getNetwork() {
        System.out.println("I am getting the 5G Network !");
    }

    public static void main(String[] args) {

    }
}
