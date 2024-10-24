package day6_arrays.modifyingAndAccessing;

public class MainAccessingAndModifying {
    public static void main(String[] args) {

        String [] name = {"Robert","Nan","Nami","Robin"};
        double [] salary = {50000.7554,60000.75,70000.75,80000.75};
        int [] yearsOfService = { 5,8,2,11};
        boolean [] isLate = {false,true,false,true};
        int [] hoursWorked = {35,40,50,45};

        System.out.println("Old Employee Data");
        for(int i = 0; i < name.length; i++){
            System.out.println("Employee Name: " + name[i]);
            System.out.println("Employee Salary: " + salary[i]);
            System.out.println("Employee Years of Service: " + yearsOfService[i]);
            System.out.println("is the employee late? : " + isLate[i]);
            System.out.println("Employee Working hours: " + hoursWorked[i]);
            System.out.println();
        }


        //10% raise for all employees who has 5 yrs of service
        // %s -> string,
        // % .2f -> 2 decimal places in float,
        // %d -> integer
        // %n -> new line belongs only to format method
        System.out.println(" -- Applying a 10% raise for all employee with more than 5 yrs of service");
        for( int i=0; i < yearsOfService.length;i++){
            if(yearsOfService[i] > 5){
                double originalSalary = salary[i];
                salary[i] *= 1.10;
                System.out.printf("%s received a 10%% raise, Original Salary: Php %.2f, New Salary: Php %.2f %n",
                                    name[i], originalSalary,     salary[i]);
            }
        }

        // \n only belongs to println method
        System.out.println("Nan \n Robert  Nami");
        System.out.println(" -- Applying a 10% deduction for all employees who are late");
        for( int i=0; i < name.length;i++){
            if(isLate[i]){
                double originalSalary = salary[i];
                salary[i] *= 0.90;
                System.out.printf("%s was late, Original Salary: Php %.2f, New Salary: Php %.2f %n",
                        name[i], originalSalary,     salary[i]);
            }else {
                System.out.printf("%s was not late, Salary remain: Php %.2f, %n",
                        name[i], salary[i]);
            }
        }

        System.out.println();
        // update specific only employee id
        System.out.println(" -- update specific only employee id");
        int employeeIndex = 2;
        hoursWorked[employeeIndex] = 30;
        System.out.println(name[employeeIndex] + " s hours updated to: " + hoursWorked[employeeIndex]);

        System.out.println();
        System.out.println(" Increment years of service for all employees");
        for(int i=0; i < yearsOfService.length;i++){
            yearsOfService[i]++;
            System.out.println(name[i] + " updating the years of service: " + yearsOfService[i]);

        }


        System.out.println("Updated Employee Data");
        for(int i = 0; i < name.length; i++){
            System.out.println("Employee Name: " + name[i]);
            System.out.println("Employee Salary: " + salary[i]);
            System.out.println("Employee Years of Service: " + yearsOfService[i]);
            System.out.println("is the employee late? : " + isLate[i]);
            System.out.println("Employee Working hours: " + hoursWorked[i]);
            System.out.println();
        }

    }
}
