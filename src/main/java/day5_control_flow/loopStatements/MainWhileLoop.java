package day5_control_flow.loopStatements;

public class MainWhileLoop {
    public static void main(String[] args) {

        boolean isEligibleForPromotion = false;
        int yearsOfService = 2;
        int performanceRating = 8;

        while(!isEligibleForPromotion){
            // false || FALSE && TRUE
            if(yearsOfService >= 10 || (yearsOfService >= 5 && performanceRating >= 7)){
                isEligibleForPromotion = true;
                System.out.println("Robert is now eligible for promotion.");
            }else {
                yearsOfService++;
                System.out.println("Years of service: " + yearsOfService);
            }
        }
    }
}
