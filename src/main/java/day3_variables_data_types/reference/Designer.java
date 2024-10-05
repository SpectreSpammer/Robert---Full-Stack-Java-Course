package day3_variables_data_types.reference;

public class Designer implements EmployeeReference {
    @Override
    public void work() {
        System.out.println("Designer is doing some UI design.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer is taking a short walk.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the design.");
    }
}
