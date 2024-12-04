package day8_OOP.encapsulation;

public class EmployeeEncapsulation {
    private String name;
    private int empId;
    private double baseSalary;

    public EmployeeEncapsulation(int empId,String name , double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary){
        if( salary > 0 ){
            this.baseSalary = salary;
        }else{
            System.out.println("Salary must be greater than zero");
        }
    }

    public void salaryIncreaseByPercentage(double percentage){
        if( percentage > 0){
            this.baseSalary *= ( percentage/ 100);
            System.out.println(name + " received a " + percentage + " % raise");
        }else{
            System.out.println("Percentage must be greater than zero");
        }
    }

    }

