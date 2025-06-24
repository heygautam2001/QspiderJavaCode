package BasicJava;

public class Bank {
    String bname;
     private String branch;
     private String ifscCode;

    Bank(String bname , String branch , String  ifscCode){
        this.bname = bname;
        this.branch = branch;
        this.ifscCode = ifscCode;
    }

    String getBranch(){
        return this.branch;
    }

    void setBranch(String branch){
        this.branch = branch;
    }

    String getIfscCode(){
        return this.ifscCode;
    }


}
