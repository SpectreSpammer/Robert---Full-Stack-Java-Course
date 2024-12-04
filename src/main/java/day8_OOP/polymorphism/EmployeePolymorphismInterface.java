package day8_OOP.polymorphism;

public interface EmployeePolymorphismInterface {
    int getId();
    String getName();
    double getSalary();
    double calculateSalary();


    default void displayInfo(){
        System.out.println("Employee Id: " + getId());
        System.out.println("Employee Id: " + getName());
        System.out.println("Employee Id: " + calculateSalary());
    }


}
