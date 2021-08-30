import java.util.Scanner;
public class CampBellringer0830 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Hello human");
        System.out.println("What is your name? ");

        String name = ui.nextLine();

        System.out.println(name+",where do you go to school? ");
        String school = ui.next();

        System.out.println("Do you like going there? ");
        String status = ui.next();
        System.out.println("Well "+name+" That's nice you enjoy "+school);

        ui.close();
    } 
}
