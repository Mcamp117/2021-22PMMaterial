import java.util.Scanner;
public class Condish {
    public static void main(String[] args) {
        //CONDITIONAL STATEMENT -> if then else else if

        int a = 3;
        int b = 8;
        int c = 6;

        //python-> if b!= 0:
        if (b!=0){
            System.out.println("b is not 0");
        }

        if (a>c){
            System.out.println("a is greater than c");
        }

        if (a/c > 0){
            System.out.println("a/c is greater than 0");
        }
        
        //else if
        if (b!=0){
            System.out.println("b is not 0");
        }
        else if (b!=3){
            System.out.println("b is not 3");
        }
        else if (b!=6){
            System.out.println("b is not 6");
        }
        else{
            System.out.println("all else failed...");
        }
        geometry();
    }    
        //create a function called gradeChecker will take in an int grade
        //             and output what letter grade you will earn

        private static void gradeChecker(){
            Scanner ui = new Scanner(System.in);
            System.out.println("What is your grade? ");
            int grade= ui.nextInt();
            if (grade>=90){
                System.out.println("A");
            }
            else if (grade>=80){
                System.out.println("B");
            }
            else if (grade>=70){
                System.out.println("C");
            }
            else if (grade>=60){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
            ui.close();
        }
        
        private static void evenOddChecker(){
            Scanner ui = new Scanner(System.in);
            System.out.println("What is your number? ");
            int numba=ui.nextInt(); 
            if (numba%2==0){
                System.out.printf("%d is an even number\n",numba);
            }
            else{
                System.out.printf("%d is an odd number\n",numba);
            }
            ui.close();
        }

        private static boolean evenOddChecker(int n){
            if (n%2==0){
                System.out.println(n+" is an even number");
                return true;
            }
            else{
                System.out.println(n+" is an odd number");
                return false;
            }
        }

        private static void geometry(){
            Scanner ui = new Scanner(System.in);
            System.out.println("Enter a x coordinate ");
            int x= ui.nextInt();
            System.out.println("Enter a y coordinate ");
            int y= ui.nextInt();
            if (n%2==0){
                System.out.println(n+" is an even number");
            }
            else{
                System.out.println(n+" is an odd number");
            }
            ui.close();
        }
}
