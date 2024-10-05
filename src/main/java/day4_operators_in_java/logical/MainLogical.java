package day4_operators_in_java.logical;

public class MainLogical {
    public static void main(String[] args) {

        // &&, || , !=
        double salary = 60000;
        int yearsOfService =10;
        int hoursWorkPerWeek = 35;
        double hourlyRate = 1000;
        double bonus =50000;

        //&& | AND
        // 55 > 40 = FALSE &&  50000 < 60000 = TRUE
        if(hoursWorkPerWeek > 40 && salary < 60000){
            System.out.println("1. Robert worked for more than 40 hrs and his basic salary is less than Php 60,000 ");
        }else {
            System.out.println("1. Robert worked under time  and his basic salary is Php 60,000 or more");
        }

        // || | OR
        // 35 > 40 = FALSE ||  50000 < 60000 = TRUE
        if(hoursWorkPerWeek > 40 || salary < 60000){
            System.out.println("1. Robert worked for more than 40 hrs and his basic salary is less than Php 60,000 ");
        }else {
            System.out.println("1. Robert worked under time  and his basic salary is Php 60,000 or more");
        }

        //!= | Not equal to
        if(salary != 50000){
            System.out.println("2. Robert gross salary is not Php 50000");
        }else {
            System.out.println("2. Robert gross salary is Php 50000");
        }
    }
}
