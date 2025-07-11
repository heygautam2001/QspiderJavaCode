package Inheritance;

import com.sun.source.doctree.SinceTree;

class Employees{
    public double calculateSalary(){

        return 0.0;
    }
}

 class  FullTime extends Employees{
    double salary;
    double incentive;
    FullTime(double salary , double incentive){
        this.salary = salary;
        this.incentive = incentive;
    }

     @Override
     public double calculateSalary() {
        salary = salary+incentive;
         System.out.println(salary);
        return salary;
     }
 }

 class PartTime extends  Employees{
    double salary;
    double Hours;
    double extraHours;

    PartTime(double salary , double Hours , double extraHours){
        this.salary = salary;
        this.Hours = Hours;
        this.extraHours = extraHours;
    }

     @Override
     public double calculateSalary() {
         if(Hours <= 8){
             salary = salary*8;
             System.out.println(salary);
         }else{
             salary = salary*(Hours + extraHours);
             System.out.println(salary);

         }
         return  salary;
     }
 }
public class OverrideTwo {
    public static void main(String[] args) {
        Employees emp = new PartTime(200,8,0);
        emp.calculateSalary();
    }
}
