import java.util.Scanner;
import java.lang.Math;
public class SciFiName {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String first = ui.nextLine();
        System.out.print("Please enter your last name: ");
        String last = ui.nextLine();
        System.out.print("Please enter your city's name: ");
        String city = ui.nextLine();
        System.out.print("Please enter your school's name: ");
        String school = ui.nextLine();
        System.out.print("Please enter your brother's name: ");
        String brother = ui.nextLine();
        System.out.print("Please enter your sister's name: ");
        String sister = ui.nextLine();
        //generate random number
        //Math.random() -> 0-.999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999;
        //random number between 0 and a value
        int rF = (int) (Math.random()*first.length());
        int rL = (int) (Math.random()*last.length());
        int rC = (int) (Math.random()*city.length());
        int rS = (int) (Math.random()*school.length());
        int rB = (int) (Math.random()*brother.length());
        int rSi = (int) (Math.random()*sister.length());
        // generate scifi first name
        String sciFiFirst = first.substring(0,rF)+last.substring(rL);
        //first name steve and last name is alexander -> stender
        // generate scifi last name
        String sciFiLast = city.substring(0,rC)+school.substring(rS);
        //city = Kansas City and school = Boonville -> sas ville
        
        // generate scifi home name
        String sciFiHome = brother.substring(rB)+sister.substring(0,rSi);
        //bro = Dave and sis = Giovanni -> Vegio
        // print out a welcome statement
        System.out.println("Welcome!"+sciFiFirst+" "+sciFiLast+" from "+sciFiHome);
    }    
}