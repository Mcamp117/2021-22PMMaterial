import java.util.Scanner;

//user input
public class HelloScanner {
    public static void main(String[] args) {
        //python-> input("Message") -> input a string
        //ClassName objectName= new ClassConstructor(parameters for obj);
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your name? ");

        //English=Create String name that gets the nextLine from the terminal
        String name = ui.nextLine();

        System.out.println("Hello! "+name);

        //use next in certain situations
        System.out.println("How are you doing today?");
        String status = ui.next();
        System.out.println("That's nice you are "+status);

        ui.close();
        
    }
}
