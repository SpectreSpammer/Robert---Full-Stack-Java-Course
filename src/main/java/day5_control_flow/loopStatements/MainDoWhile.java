package day5_control_flow.loopStatements;

public class MainDoWhile {
    public static void main(String[] args) {

        // Do it first before validation
        int trainingModules = 3;
        do{
            trainingModules++;
            System.out.println("Completed List of Modules: " + trainingModules);

        }while(trainingModules <5);
    }
}
