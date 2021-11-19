import java.util.Scanner;
public class passwordManager{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Welcome, Are You A New User: Y or N "); 
        String login=ui.nextLine();
        if(login.equals("Y")){
            loginCreation();
        }
        else if(login.equals("N")){
            userLogin();
        }

    }
    private static void loginCreation() {
        String[] loginUsernames= new String();
        String[] loginPasswords= new String();
        System.out.println("Input your first name ");
        String first=ui.nextLine();
        System.out.println("Input your last name ");
        String last=ui.nextLine();
        System.out.println("Input a username ");
        for (int i=0;i<1;i++){
            String username=ui.nextLine();
            loginUsernames[i]=username;
        }
        System.out.println("Input a password");
        for (int i=0;i<1;i++){
            String password=ui.nextLine();
            loginPasswords[i]=password;
        }
    }
    private static void userLogin() {
        
    }
}