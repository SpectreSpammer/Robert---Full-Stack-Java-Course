package day5_control_flow.decisionMaking;

public class MainControlFlow {
    public static void main(String[] args) {

        int hoursWorked = 40;
        double baseSalary = 45000.75;
        int yearsOfService = 15;
        double bonus = 15;

        // TRUE && TRUE
        if(hoursWorked > 30 && baseSalary < 50000){
            System.out.println("Robert worked more than 40 hrs and his salary is less than Php 50,000");
        }else {
            System.out.println("Robert is under time and his salary is more than Php 50,000");
        }

        // true || false
        if( yearsOfService > 10 || baseSalary > 100000){
            System.out.println("Robert is either a long time employee or highly paid");
        }else {
            System.out.println("Robert is neither a long time employee nor highly paid");
        }

        if( bonus != yearsOfService){
            System.out.println("Robert bonus is not equal to his years of service");
        }else {
            System.out.println("Robert bonus is equal to his years of service");
        }
    }
}
