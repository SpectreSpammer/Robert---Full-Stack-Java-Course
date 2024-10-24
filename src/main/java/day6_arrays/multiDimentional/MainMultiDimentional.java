package day6_arrays.multiDimentional;

public class MainMultiDimentional {
    public static void main(String[] args) {

        // employeeId,name, dept, years of service, FTE, salary,years of service
        Object [][] employeeInfo = {
                { 12345678909876L,"Robert","IT",5,true,70000.75,7 },
                { 12345678909876L,"Nan","Security",7,false,90000.75,2 },
                { 12345678909876L,"Nami","Sales",3,true,50000.75,11},
                { 12345678909876L,"Robin","HR",1,false,40000.75,4 },
                { 12345678909876L,"John","Devops",9,false,100000.75,9 },
        };
        System.out.println(" -- Printing all of the employee information -- ");
        displayEmployeeInfo(employeeInfo);

        System.out.println(" -- Applying a 10% raise for all employee with more than 5 yrs of service -- ");
        for( int i=0; i < employeeInfo.length;i++){
            if((int) employeeInfo[i][6]> 5){
                double originalSalary = (double)employeeInfo[i][5];
                employeeInfo[i][5] = (double)employeeInfo[i][5] * 1.10;
                System.out.printf("%s received a 10%% raise, Years of Service: %d, Original Salary: Php %.2f, New Salary: Php %.2f %n",
                        employeeInfo[i][1], employeeInfo[i][3] , originalSalary,     employeeInfo[i][5]);
            }
        }




    }

    private static void displayEmployeeInfo(Object[][] employeeInfo) {
        for(Object[] employee : employeeInfo){
            System.out.println("Employee Id: " + employee[0]);
            System.out.println("Employee Name: " + employee[1]);
            System.out.println("Employee Department: " + employee[2]);
            System.out.println("Employee Age: " + employee[3]);
            System.out.println("is the employee a full time? : " + employee[4]);
            System.out.println("Employee Salary: " + employee[5]);
            System.out.println("Employee years of service: " + employee[6]);
            System.out.println();
        }
    }
}
