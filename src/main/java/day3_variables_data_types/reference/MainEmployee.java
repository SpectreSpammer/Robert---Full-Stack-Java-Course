package day3_variables_data_types.reference;

public class MainEmployee {
    public static void main(String[] args) {

        //creating the object for the interface
        EmployeeReference manager = new Manager();
        EmployeeReference developer = new Developer();
        EmployeeReference designer = new Designer();

        //arrays object of the employees
        EmployeeReference[] employees = {manager, designer,developer};

        for(EmployeeReference emp : employees){
            emp.work();
            emp.takeBreak();
            emp.attendMeeting();
            System.out.println();
        }


    }
}
