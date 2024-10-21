package day5_control_flow.decisionMaking;

public class MainSwitch {
    public static void main(String[] args) {
        int yearOfService = 2;
        String department = "SaLeS";

        switch(yearOfService){
            case 0:
            case 1:
                System.out.println("Employee Level: Trainee");
                break;
            case 2:
            case 3:
                System.out.println("Employee Level: Junior");
                break;
            case 4:

            case 5:
                System.out.println("Employee Level: Mid Level Senior");
                break;
            case 6:
            case 7:
                System.out.println("Employee Level: Senior");
                break;
            default:
                System.out.println("Employee Level: Expert");
        }

        switch(department.toLowerCase()){
            case "it":
                System.out.println("The department name is IT");
                break;
            case "sales":
                System.out.println("The department name is Sales");
                break;
            case "marketing":
                System.out.println("The department name is marketing");
                break;
            default:
                System.out.println("The department name is admin");

        }
    }
}
