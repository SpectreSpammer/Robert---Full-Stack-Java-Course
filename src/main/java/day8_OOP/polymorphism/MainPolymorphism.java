package day8_OOP.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        EmployeePolymorphismInterface fte  = new FullTimeEmployeePolymorphism(1,"Robert",50000,25000.75);
        fte.displayInfo();
        System.out.println();

        EmployeePolymorphismInterface pt  = new ContractualEmployeePolymorphism(2,"Nan",60000,5000.75,4);
        pt.displayInfo();
    }
}
