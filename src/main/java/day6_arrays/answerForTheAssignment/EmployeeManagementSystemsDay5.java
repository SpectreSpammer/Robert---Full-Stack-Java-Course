package day6_arrays.answerForTheAssignment;

public class EmployeeManagementSystemsDay5 {

    public static void main(String[] args) {
        // Employee data
        String name1 = "Luffy";
        int age1 = 21;
        double annualGrossSalary1 = 1750000;

        String name2 = "Zoro";
        int age2 = 65;
        long id2 = 987654321012L;

        String name3 = "Nami";
        int age3 = 30;

        // Task 1: if-else statements
        System.out.println("Task 1: Retirement Eligibility Check");
        String[] employees = {name1, name2, name3};
        int[] ages = {age1, age2, age3};

        for (int i = 0; i < employees.length; i++) {
            if (ages[i] >= 65) {
                System.out.println(employees[i] + " is eligible for retirement.");
            } else {
                System.out.println(employees[i] + " is not eligible for retirement yet.");
            }
        }

        // Task 2: switch statements
        System.out.println("\nTask 2: Department Information");

        // New variable to control the switch case
        String departmentToCheck = "IT"; // You can change this to "HR", "Finance", or any other value


            switch (departmentToCheck.toLowerCase()) {
                case "it":
                    System.out.println("IT Department: Responsible for maintaining computer systems and networks.");
                    break;
                case "hr":
                    System.out.println("HR Department: Manages employee relations and recruitment.");
                    break;
                case "finance":
                    System.out.println("Finance Department: Handles company finances and budgeting.");
                    break;
                default:
                    System.out.println("Invalid department entered: " + departmentToCheck);
            }


        // Task 3: for loop
        System.out.println("\nTask 3: Salary Increment");
        int projectionYears = 5;
        System.out.println("Projected salary for " + name1 + " over " + projectionYears + " years:");
        double projectedSalary = annualGrossSalary1;

        for (int i = 1; i <= projectionYears; i++) {
            projectedSalary *= 1.05; // 5% increment each year
            System.out.printf("Year %d: Php %.2f\n", i, projectedSalary);
        }

        // Task 4: while loop
        System.out.println("\nTask 4: Employee ID Validation");
        long idToCheck = id2;
        int lastFourDigits = 1012; // Last 4 digits of id1
        int digitCount = 0;
        boolean isValid = false;

        /*
             * % represents the modulo operation
             *  returns the remainder after division of one number by another.
             * a % b gives the remainder when a is divided by b
         */
        /*
            *This loop continues as long as there are digits left in idToCheck.
         */
        while (idToCheck > 0) {

            /*
                *We only check the last 4 digits (digitCount < 4).
                * idToCheck % 10 gets the last digit of the current idToCheck.
                * lastFourDigits % 10 gets the last digit of our expected last 4 digits.
                * If they don't match, we break the loop (ID is invalid).
                * If they match, we move to the next digit (lastFourDigits /= 10).
             */
            if (digitCount < 4) {
                if (idToCheck % 10 != lastFourDigits % 10) {
                    break;
                }
                lastFourDigits /= 10;
            }
            /*
                 * We remove the last digit from idToCheck.
                 * We increment our digitCount.
             */
            idToCheck /= 10;
            digitCount++;

            if (digitCount == 4) {
                /*
                    *If we've successfully checked 4 digits, the ID is valid.
                    *We set isValid to true and break the loop.
                 */
                isValid = true;
                break;
            }
        }

        System.out.println("Employee ID " + id2 + " is " + (isValid ? "valid" : "invalid") + ".");

        // Task 5: do-while loop
        System.out.println("\nTask 5: Payroll Processing");
        int employeeCount = 3;
        int processedCount = 0;

        do {
            processedCount++;
            System.out.println("Processing payroll for employee " + processedCount);
        } while (processedCount < employeeCount);

        System.out.println("Payroll processing completed for " + processedCount + " employees.");
    }
}
