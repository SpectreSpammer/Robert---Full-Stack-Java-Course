package day5_control_flow.loopStatements;

public class MainForLoop {
    public static void main(String[] args) {

        double baseSalary = 50000.75;
        int yearsOfService = 5;

        //for seeing the annual raise for 5 yrs
        double annualRaisePercentage = 0.05;
        for(int year = 1; year <= 5; year++){
            baseSalary *= (1 + annualRaisePercentage);
            yearsOfService++;
            System.out.printf("Year: %d - Salary: Php %.2f, Years of service: %d %n",
                                     year,          baseSalary,             yearsOfService);
        }
    }
}
