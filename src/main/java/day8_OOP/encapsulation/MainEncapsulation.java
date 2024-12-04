package day8_OOP.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        EmployeeEncapsulation employee = new EmployeeEncapsulation(1,"Robert" , 50000);

        System.out.println("Name: " + employee.getName());
        System.out.println("Id: " + employee.getEmpId());
        System.out.println("Salary: " + employee.getBaseSalary());

        employee.setName("John Robert");
        employee.setBaseSalary(70000);
        System.out.println("After setting up a new name and salary");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getBaseSalary());

        employee.salaryIncreaseByPercentage(20);
        System.out.println("Salary: " + employee.getBaseSalary());

        employee.setBaseSalary(50000);

    }
}
