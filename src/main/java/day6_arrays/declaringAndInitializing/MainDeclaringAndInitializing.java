package day6_arrays.declaringAndInitializing;

import java.util.Arrays;

public class MainDeclaringAndInitializing {
    public static void main(String[] args) {
        String [] name = {"Robert","Nan","Nami","Robin"};
        double [] salary = {50000.75,60000.75,70000.75,80000.75};

        // employeeId,name, dept, age, FTE, salary,performance Rating
        Object [] employeeInfo = {12345678909876L,"Robert","IT",25,true,70000.75,'B'};
        Object [] employeeInfo2 = {12345678909876L,"Robert","IT",25,true,70000.75,'B'};
        System.out.println("Employee Salaries: " + Arrays.toString(salary));
        System.out.println();

        System.out.println("Employee Names: ");
        for(String empName : name){
            System.out.println(" - " + empName);
        }

        System.out.println("Employee Info: ");
        for(Object empInfo : employeeInfo){
            System.out.println(" - " + empInfo);
        }
    }
}
