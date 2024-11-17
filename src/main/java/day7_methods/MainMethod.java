package day7_methods;

public class MainMethod {
    public static void main(String[] args) {


        displayEmployeeInfo("Robert",25);

        System.out.println("-----------");

        double bonus = calculate13thMonthPay(10000,8);
        System.out.println("2. Method Overloading - 13th month pay ( Example 1 with double return value ) ");
        System.out.println(" - Annual Bonus Php: " + bonus );


        System.out.println("-----------");
        double yearsOfServiceBonus = calculateBonus(1000000,5);
        System.out.println("3. Method Overloading ( Example 2 with double return value ) ");
        System.out.println(" - Annual Bonus Php: " + yearsOfServiceBonus);


        System.out.println("4. " + calculateBonus(1000000,"GoOd"));
    }

    private static double calculate13thMonthPay(int salary, int lengthOfmonths) {
        //double bonus = salary * lengthOfmonths / 12;
       // System.out.println(bonus);
        return salary * lengthOfmonths / 12;
    }

    private static void displayEmployeeInfo(String name, int age) {
        System.out.println(" 1. Void Method ( no return value ) ");
        System.out.println(" - Employee name: " + name);
        System.out.println(" - Employee age: " + age);
    }

    private static double calculateBonus(double annualSalary, int yearsOfService) {
        return annualSalary * 0.20 * yearsOfService;
    }

    private static String calculateBonus(double annualSalary, String performanceGrade) {
        double bonusPercentage;
        switch (performanceGrade.toLowerCase()){
            case "excellent":
                bonusPercentage = 0.1;
                break;

            case "good":
                bonusPercentage = 0.05;
                break;

            case "average":
                bonusPercentage = 0.03;
                break;

            default:
                bonusPercentage = 0.02;
                performanceGrade ="poor";
        }
        double totalAmount = annualSalary * bonusPercentage;
        return String.format("Annual Bonus: Php %.2f , Performance Rating:  %s", totalAmount,performanceGrade);
    }
}
