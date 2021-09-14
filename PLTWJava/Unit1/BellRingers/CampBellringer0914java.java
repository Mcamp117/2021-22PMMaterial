import java.util.Scanner;
import java.lang.Math;
public class CampBellringer0914java {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter a ");
        double a= ui.nextDouble();
        System.out.println("enter b ");
        double b= ui.nextDouble();
        System.out.println("enter c ");
        double c= ui.nextDouble();

        double r1=(-b+Math.pow(x, 0.5))/(2*a);
        double r2=(-b-Math.pow(x, 0.5))/(2*a);
        x=Math.pow(b,2)-4*a*c;

        if (x==0){
            System.out.println("The equation has 1 root %f",r1);
        }
        else if (x>0){

            System.out.println("The equation has 2 roots %f",r1, r2);
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
