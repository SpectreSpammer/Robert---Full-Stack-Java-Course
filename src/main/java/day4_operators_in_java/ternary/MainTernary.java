package day4_operators_in_java.ternary;

public class MainTernary {
    public static void main(String[] args) {

        // condition ? expression1 : expression2
        // if ( logic ) expression 1 : expression2

        //int
        int age = 28;
        System.out.println( age < 65 ? "Not yet retired" : "retired");

        //boolean
        boolean isReceivedBonus = false;
        String receivedBonus = isReceivedBonus ? "received bonus" : "not yet received bonus";
        System.out.println("Robert has " + receivedBonus);
    }
}
