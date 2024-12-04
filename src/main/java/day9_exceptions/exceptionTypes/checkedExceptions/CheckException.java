package day9_exceptions.exceptionTypes.checkedExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckException {

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);

        new Scanner(file);
    }

    public static void connectToDatabase() {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db","user","password");
        }catch (SQLException sqlException){
            System.out.println("Database connection failed: " + sqlException.getMessage());
        }catch (Exception e){
            System.out.println("An unexpected error occured" + e.getMessage());
        }finally {
            System.out.println("Closing the database");
        }


    }
}
