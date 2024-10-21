package day5_control_flow.jumpStatements;

public class MainBreakAndContinue {
    public static void main(String[] args) {
        int perFormanceRating = 1;
        double baseSalary = 50000.75;

        switch (perFormanceRating){
            case 1:
                System.out.println("Your performance rating is Very Poor");
                break;
            case 2:
                System.out.println("Your performance rating is Poor");
                break;
            case 3:
                System.out.println("Your performance rating is Good");
                break;
            case 4:
                System.out.println("Your performance rating is Very Good");
                break;
            default:
                System.out.println("Your performance rating is Excellence");
        }
        System.out.println();

        for(int year = 1; year <= 5;year++){
            if(year == 3){
                System.out.println("Skipping year 3 due to company policy");

//                continue;
                //break;
            }
            baseSalary *= 1.05;
            System.out.printf("Year %d: Php %.2f %n", year,baseSalary);
        }
    }
}
