import java.util.Scanner;
import java.util.Random;
public class passwordManager{
    public static void main(String[] args) {
        // ArrayList <Boolean> reqCheckList = new ArrayList<Boolean>();
        // ArrayList <Integer> specialCharacters = new ArrayList<Integer>();
        // ArrayList <String> passwordList = new ArrayList<String>();
        // char[] lowerAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // char[] upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        // char[] symbols = "!@\"#$%'^&()*".toCharArray();
        // char[] numbers= "1234567890".toCharArray();
        newUser();
    }

    //  private static void randomizer() {
    //      Scanner sc = new Scanner(System.in);
    //      System.out.println("Input Number of Capital Letters: ");
    //      int  capitalLetterInput = sc.nextInt();
    //      System.out.println("Input Number of Lowercase Letters: ");
    //      int  lowerLetterInput = sc.nextInt();
    //      System.out.println("Input Number of Numbers: ");
    //      int  numberInput = sc.nextInt();
    //      System.out.println("Input Number of Symbols: ");
    //      int  symbolInput = sc.nextInt();
    //      String letterDigit = "";
    //      //adds random items to the final output
    //      for ( int count=0; count<capitalLetterInput; count++) {
    //          letterDigit += "";
    //      }
    //  }

    //  private void passwordChecker(){
    //      if (passwords.length()>=8) {
    //          reqCheckList[0]=true;
    //          for(int i=1; i<passwords.length(); i++){
    //              if(passwords.contains(lowerAlphabet)){
    //                  reqCheckList[1]=true;
    //              }
    //              else if(passwords.contains(upperAlphabet)){
    //                  reqCheckList[2]=true;
    //              }
    //              else if(passwords.contains(symbols)){
    //                  reqCheckList[3]=true;
    //              }
    //              else if(passwords.contains(numbers)){
    //                  reqCheckList[4]=true;
    //              }
    //          }
    //          if(reqCheckList.contains(false)){

    //          } 
    //      }
    //  }
    private static void printArray(String[] listy) {
        for (int i=0;i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }

    private static void newUser(){
        Scanner newUser = new Scanner(System.in);
        String [] username = new String[1];
        String [] passwords = new String[1];
        System.out.println("What is your first name ");
        String firstName = newUser.nextLine();
        System.out.println("What is your last name ");
        String lastName = newUser.nextLine();
        System.out.println("What is your username ");
        for (int i=0; i<1; i++ ){
            username[i] = newUser.nextLine();
        }
        System.out.println("What is your password");
        for (int i=0; i<1; i++ ){
            passwords[i] = newUser.nextLine();
        }
        printArray(username);
        
        printArray(passwords);
    }
}