package day5_control_flow.loopStatements;

public class MainForEach {
    public static void main(String[] args) {


        String[] employeeName = { "Robert", "Nan","Nami","Robin"};
        double[] baseSalary = {80000.75,1000000.75,70000.75,50000.75};
        int[] yearsOfService = { 5,3,10,7};

        System.out.println("  --- Printing all of the Employees Information ---");
        for(int i = 0; i < employeeName.length; i++){
            String name = employeeName[i];
            double salary = baseSalary[i];
            int years = yearsOfService[i];

            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
            System.out.println("Years of Service: " + years);
            System.out.println();
        }
        System.out.println();

        System.out.println(" --- List of Employee names --- ");
        for(String name : employeeName){
            System.out.println(" - " + name);
        }
        System.out.println();

        System.out.println(" --- Finding the highest Salary among all of the employees --- ");
        double highestSalary = 0;
        for(double salary : baseSalary){
            if( salary > highestSalary){
                highestSalary = salary;
            }
        }
        System.out.printf(" - Highest Salary is: Php: %.2f %n",
                                                    highestSalary);


    }
}
