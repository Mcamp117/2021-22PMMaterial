import java.util.Scanner;

public class AdvancedCondish {
    public static void main(String[] args) {
        /* int a =1;
         int b =2;
         int c =1;
         //ands  && - both sides of the && have to be true to result true
         System.out.println(a>b && a>c); //false
         System.out.println(a<b && b>c); //true
         //ors   ||- only 1 side of the || have to be true to result true
         System.out.println(a>b || a>c); //false
         System.out.println(a<b || a>c); //true
         System.out.println(a<b || b>c); //true
         //check to see if our input is between 0 and 100
         int in = 99;
         if (in<100 && in>0){
             System.out.println("in is good");
         }
            */
         
        boolean l=login();
        while (!l){
            l=login();
        }
        // while(!login()){}

    } 
    public static void what(){
        /*python
            i=0
            while (i == anything):
                did stuff
                i+=1
        */
        Scanner ui = new Scanner(System.in);
        System.out.println("Hey... guess what");
        String in = ui.nextLine();
        //run forever= while(true)
        while(!in.equals("what")){
            System.out.println("Hey... guess what");
            in = ui.nextLine();
        }
        System.out.println("chicken butt");
    }

    public static boolean login(){
        String un = "billybob";
        String pw = "123456";
        Scanner ui = new Scanner(System.in);
        System.out.println("username ");
        String username = ui.nextLine();
        System.out.println("password ");
        String password = ui.nextLine();

        if (username.equals(un) && password.equals(pw)){
             System.out.println("Welcome");
            return true;
        }
        else{
            System.out.println("Get out of here you imposter");
            return false;
        }
      
    }
}
