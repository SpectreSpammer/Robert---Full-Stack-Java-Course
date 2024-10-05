package day4_operators_in_java.comparison;

public class MainComparison {
    public static void main(String[] args) {

        // == != > < >= >=
        double salary = 50000;
        int yearsOfService =10;
        int hoursWorkPerWeek = 55;
        double hourlyRate = 1000;
        double bonus =50000;

        //== | Equal to
        if(yearsOfService == 7){
            System.out.println("1. Robert has been with the company for exactly 7 yrs");
        }else{
            System.out.println("1. Robert`s years of service is not 7 yrs");
        }

        //!= | Not equal to
        if(salary != 50000){
            System.out.println("2. Robert gross salary is not Php 50000");
        }else {
            System.out.println("2. Robert gross salary is Php 50000");
        }

        // > | Greater than
        if(hoursWorkPerWeek > 40){
            System.out.println("3. Robert worked more than 40 hours this week.");
        }else {
            System.out.println("3. Robert is under time this week.");
        }

        // < | Less than
        if(hourlyRate < 1000){
            System.out.println("4. Robert hourly rate is less than Php 1000");
        }else {
            System.out.println("4. Robert hourly rate is Php 1000 or more");
        }

        // >= | Greater than or equal to
        double totalCompensation = salary + bonus;
        if(totalCompensation >= 100000){
            System.out.println("5. Robert is earning Php 100,000 or more");
        }else {
            System.out.println("5. Robert is earning less than Php 100,000 ");
        }

        // <= | Less than equal to
        if(yearsOfService <= 10){
            System.out.println("6. Robert is been with the company for 10 years or less");
        }else {
            System.out.println("6. Robert is been with the company for more than 10 years ");
        }
    }
}
