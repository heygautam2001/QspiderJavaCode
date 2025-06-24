package BasicJava;

public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI" , "Karala" , "SBI001101");
        System.out.println(b1.getBranch());
        b1.setBranch("Rohini");
        System.out.println(b1.getBranch());

        System.out.println(b1.getIfscCode());
    }
}
