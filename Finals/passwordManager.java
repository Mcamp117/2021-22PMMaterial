import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import java.lang.System;
import java.util.ArrayList;
import java.util.Random;
public class passwordManager{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        boolean[] reqCheckList = {false,false,false,false};
        ArrayList <Integer> specialCharacters = new ArrayList<Integer>();
        ArrayList <String> passwordList = new ArrayList<String>();

        // Login Information
        ArrayList <String> firstName = new ArrayList<String>();
        ArrayList <String> lastName = new ArrayList<String>();
        ArrayList <String> username = new ArrayList<String>();
        ArrayList <String> passwords = new ArrayList<String>();
        
        

        ArrayList <String> category = new ArrayList<String>();
        category.add("home");
        category.add("work");
        category.add("entertainment");
        category.add("bills");

        //randomizer();
        newUser(username, passwords, firstName, lastName);
        System.out.print(username);
        System.out.print(passwords);
        login(username,passwords,loginTries);
    }

    private static void randomizer() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList <String> ui = new ArrayList<String>();
        
        //User says how many Cap & Low Letters, Nums, and Syms
        System.out.println("Input Number of Capital Letters: ");
        int  capitalLetterInput = sc.nextInt();
        System.out.println("Input Number of Lowercase Letters: ");
        int  lowerLetterInput = sc.nextInt();
        System.out.println("Input Number of Numbers: ");
        int  numberInput = sc.nextInt();
        System.out.println("Input Number of Symbols: ");
        int  symbolInput = sc.nextInt();
        String password = "";

        //adds random items to the final output
        for ( int count=0; count<capitalLetterInput; count++) {
            password += (char)getRandInt(65,91);
        }

        for ( int count=0; count<lowerLetterInput; count++) {
            password += (char)getRandInt(97,122);
        }

        for ( int count=0; count<numberInput; count++) {
            password += (char)getRandInt(48, 57);
        }

        int special = 0;
        String symbolsDigit = "";
        while (!(symbolInput == 0)) {
            special = getRandInt(33,64);
            if ((special == 33) || (special == 35) || (special == 36) || (special == 37) || (special == 38) || (special == 40) || (special == 41) || (special == 42) || (special == 64)) {
                password += (char) special;
                symbolInput -= 1;
            }
        }
        System.out.println(password);
        // ui.addAll(1, password);
    }

    private static void passwordChecker(boolean[] cl,String p){
        char[] password = p.toCharArray();
        if (passwords.length()>=8) {
            cl[0]=true;
            for(int i=0; i<passwords.length(); i++){
                if(passwords.contains(lowerAlphabet)){
                    cl[1]=true;
                }
                else if(passwords.contains(upperAlphabet)){
                    cl[2]=true;
                }
                else if(passwords.contains(symbols)){
                    cl[3]=true;
                }
                else if(passwords.contains(numbers)){
                    cl[4]=true;
                }
            }
            for(boolean value: cl){
                if(value==false){
                    
                }
            } 
        }
    }
    private static void printArray(int[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.println(listy[i]);
        }
    }
    
    private static void printArray(double[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }
    
    private static void printArray(String[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }
    
    private static void printArray(boolean[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }

    private static int getRandInt(int minimum, int maximum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    private static void newUser(ArrayList <String> u, ArrayList <String> p,ArrayList <String> f, ArrayList <String> l ){
        Scanner newUser = new Scanner(System.in);
        System.out.println("What is your first name ");
        String firstName = newUser.nextLine();
        f.add(firstName);
        System.out.println("What is your last name ");
        String lastName = newUser.nextLine();
        l.add(lastName);
        System.out.println("What is your username ");
        String userUsername = newUser.nextLine();
        u.add(userUsername);
        System.out.println("What is your password");
        String userPassword = newUser.nextLine();
        p.add(userPassword);
    }
    private static void login(ArrayList <String> u, ArrayList <String> p){
        Scanner login = new Scanner(System.in);
        boolean loginChecker=false;
        int loginTries = 5;
        while(loginTries!=0){
            System.out.println("Input your username ");
            String username=login.nextLine();
            System.out.println("Input your password");
            String password=login.nextLine();
            if( p.contains(password)&&(u.contains(username))){
                loginTries=0;
                int pindex=p.indexOf(password);
                int uindex=u.indexOf(username);
                if(pindex==uindex){
                    System.out.println("Login Succesful");
                    break;
                }
            }
            else{
                System.out.println("Incorrect Information, Try Again");
                loginTries-=1;
            }
        }
        if(loginTries==0){
            System.out.println("0 tries remaining, we are calling the police");
            System.exit(0);
        }

    }

}