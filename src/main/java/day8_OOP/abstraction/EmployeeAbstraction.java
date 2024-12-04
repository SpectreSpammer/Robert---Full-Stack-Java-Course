package day8_OOP.abstraction;

public abstract class EmployeeAbstraction {

    protected int id;
    protected  String name;
    protected double salary;

    public EmployeeAbstraction(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();

    public void displayInfo(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + calculateSalary());
    }
}
