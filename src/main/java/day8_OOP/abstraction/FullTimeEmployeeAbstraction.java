package day8_OOP.abstraction;

public class FullTimeEmployeeAbstraction extends EmployeeAbstraction {

    private double bonus;


    public FullTimeEmployeeAbstraction(int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}
