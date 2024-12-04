package day8_OOP.polymorphism;

public class FullTimeEmployeePolymorphism implements EmployeePolymorphismInterface {

    private int id;
    private String name;
    private double salary;
    private double bonus;

    public FullTimeEmployeePolymorphism(int id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}
