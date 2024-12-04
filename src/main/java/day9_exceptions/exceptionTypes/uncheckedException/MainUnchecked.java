package day9_exceptions.exceptionTypes.uncheckedException;

public class MainUnchecked {
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("NullPointerException: " + npe.getMessage());
        }

        try{
            int [] age = new int[5];
            System.out.println(age[6]);
        }catch (ArrayIndexOutOfBoundsException aiofbe){
            System.out.println("ArrayIndexOutOfBoundsException: " + aiofbe.getMessage());
        }

    }
}
