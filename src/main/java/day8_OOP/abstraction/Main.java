package day8_OOP.abstraction;

public class Main {
    public static void main(String[] args) {

        EmployeeAbstraction fte = new FullTimeEmployeeAbstraction(1, "Robert", 50000, 2000);
        fte.displayInfo();

        EmployeeAbstraction pt = new PartTimeEmployeeAbstraction(2, "Nan", 60000, 2500,5);
        pt.displayInfo();
    }
}
