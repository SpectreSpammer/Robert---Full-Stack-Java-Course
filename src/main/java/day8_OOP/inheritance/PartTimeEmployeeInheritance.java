package day8_OOP.inheritance;

public class PartTimeEmployeeInheritance extends EmployeeInheritance {

    private int hoursOfWorked;
    private double overtimePay;

    public PartTimeEmployeeInheritance(String name, int empId, double baseSalary, int hoursOfWorked, double overtimePay) {
        super(name, empId, baseSalary);
        this.hoursOfWorked = hoursOfWorked;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateGrossSalary(){
        return  super.calculateGrossSalary() + (hoursOfWorked * overtimePay);
    }

    @Override
    public void displayInfo() {
        System.out.println("Part Time Employee");
        super.displayInfo();
        System.out.println("Hours of Worked: " + hoursOfWorked);
        System.out.println("Hours of Worked: " + overtimePay);
    }
}
