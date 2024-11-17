package day8_OOP.inheritance;

public class EmployeeInheritance {
    protected String name;
    protected int empId;
    protected double baseSalary;

    public EmployeeInheritance(String name, int empId, double baseSalary) {
        this.name = name;
        this.empId = empId;
        this.baseSalary = baseSalary;

    }


    public double calculateGrossSalary(){
        return  baseSalary;
    }


    public void displayInfo() {

        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Base Salary " + baseSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}
