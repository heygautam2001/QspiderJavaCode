package BasicJava;

public class CheckGrade {
    public static void main(String[] args) {
        int marks = 45;
        if (marks >= 80)
            System.out.println("A grade");
        else if (marks >= 60 && marks < 80)
            System.out.println("B grade");
        else if(marks >= 40 && marks < 60)
            System.out.println("C grade");
        else if (marks >= 35 && marks < 40)
            System.out.println("Grade D");
        else
            System.out.println("failed");
    }
}
