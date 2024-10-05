package day4_operators_in_java.arithmetic;

public class MainArithmetic {
    public static void main(String[] args) {

        // Addition +, Subtraction -, Multiplication *, Division /, Modulus %
        String employeeName = "Robert";
        double baseSalary = 50000.75;
        double bonus = 25000.75;
        int yearsOfService = 5;

        //addition +, computing of the total salary
        double netPay = baseSalary + bonus;
        System.out.println("1. Net Pay of the employee: " + employeeName + ", Php " + netPay);

        //subtraction -, sss deduction
        double sss = 4200.75;
        double grossPay = netPay - sss;
        System.out.println("2. Gross Pay of the employee: " + employeeName + ", Php " + grossPay);

        //multiplication *, annual salary
        double annualSalary = baseSalary * 12;
        System.out.println("3. Annual Salary of the employee: " + employeeName + ", Php " + annualSalary);

        //division /, annual increase
        double averageAnnualSalaryIncrease = baseSalary / yearsOfService;
        System.out.println("4. Annual Salary Increase of the employee: " + employeeName + ", Php " + averageAnnualSalaryIncrease);

        //Modulus %, assuming raises every 90 days
        int daysUntilNextPayRaise = 365 % 90;
        System.out.println("5. Average raise in 90 days: " + employeeName + ",Average Raise: " + daysUntilNextPayRaise);


    }
}
