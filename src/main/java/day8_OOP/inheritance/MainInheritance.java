package day8_OOP.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        EmployeeInheritance baseEmployee = new EmployeeInheritance("Robert", 1001, 60000.75);
        FullTimeEmployeeInheritance fullTimeEmployee = new FullTimeEmployeeInheritance("Nan", 2001, 70000.75, 25000.75);
        PartTimeEmployeeInheritance partTimeEmployee = new PartTimeEmployeeInheritance("Luffy", 3001, 80000.75,3,699.75);


        baseEmployee.displayInfo();
        System.out.println();

        fullTimeEmployee.displayInfo();
        System.out.println();

        partTimeEmployee.displayInfo();
    }
}
