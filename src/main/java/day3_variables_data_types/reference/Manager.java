package day3_variables_data_types.reference;

public class Manager implements EmployeeReference {

    @Override
    public void work() {
        System.out.println("Manager is overseeing the project.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking his lunch break.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading the meeting.");
    }
}
