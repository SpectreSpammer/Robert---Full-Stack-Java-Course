package day3_variables_data_types.reference;

public class Developer implements EmployeeReference {
    @Override
    public void work() {
        System.out.println("Developer is doing some code.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having a coffee break.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending the meeting.");
    }
}
