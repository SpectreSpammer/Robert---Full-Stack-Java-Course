package day8_OOP.inheritance;

public class FullTimeEmployeeInheritance extends EmployeeInheritance {

    private double bonus;
    // parent & child

    public FullTimeEmployeeInheritance(String name, int empId, double baseSalary,double bonus) {
        super(name, empId, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateGrossSalary(){
        return  super.calculateGrossSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Full Time Employee");
        super.displayInfo();
        System.out.println("Bonus: Php " + bonus);
    }
}
