package day9_exceptions.exceptionTypes.checkedExceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MainChecked {
    public static void main(String[] args) throws FileNotFoundException {
        //CheckException.readFile("");
        CheckException.connectToDatabase();

    }
}
