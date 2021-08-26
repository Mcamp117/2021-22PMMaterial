import java.util.Scanner;

public class HelloVariables {
    /*
        Primitive Data= int, bits, bytes, boolean, float
        Non-Primitive Data= strings, array, lists, ArrayList
    */
    public static void main(String[] args) {
        //datatype variableName = value
        double cash= 5.25; // double is not just for 2 decimal points

        boolean isOldEnough= true;  //namingsyntax typically begin with is

        //string is technically a class
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = ui.nextLine();
        Scanner iu = new Scanner(System.in);
        System.out.println("What is your age? ");
        String age= iu.nextLine();

        System.out.println(name + " is " + age + " years old.");

        //CONSTANT VARIABLE
        //final- shouldn't change
        //naming convention- is all caps for us the programmer
        final double PI= 3.1415926;

    }
}
