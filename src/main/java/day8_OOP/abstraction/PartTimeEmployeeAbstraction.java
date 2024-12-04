package day8_OOP.abstraction;

public class PartTimeEmployeeAbstraction extends EmployeeAbstraction {

    private double overtimePay;
    private int workingHours;


    public PartTimeEmployeeAbstraction(int id, String name, double salary, double overtimePay,int workingHours) {
        super(id, name, salary);
        this.overtimePay = overtimePay;
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return salary + (overtimePay * workingHours);
    }
}
