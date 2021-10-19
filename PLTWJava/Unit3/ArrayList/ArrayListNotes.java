import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListNotes {
    public static void main(String[] args) {
        /*//Declare <dataType> name     = new Constructor
        ArrayList            newList1 = new ArrayList();
        ArrayList <String>   newList2 = new ArrayList<String>();
        ArrayList <Integer>  newList3 = new ArrayList<Integer>();
        //listy=[1,2,3,4]

        //addnumbers to an ArrayList
        newList3.add(1);

        System.out.println(newList1);
        System.out.println(newList2);
        System.out.println(newList3);

        newList1.add(1);
        newList1.add("1");
        newList1.add("Kevin");
        newList1.add(3.14);
        System.out.println(newList1);

        //get items from our ArrayList
        for(int i=0;i<newList1.size();i++){
            newList1.get(i);    //get an item from the list
            //no more newList1 ->this no work
            System.out.println(newList1.get(i).getClass().getName());
        }*/
        itsYourTurn372();
    }
    public static void additionCalculator(){
        Scanner ui = new Scanner(System.in);
        //Creating a double ArrayList
        ArrayList<Double> numbers = new ArrayList<Double>();

        double newNumber=ui.nextDouble();
        while (newNumber!=0){
            numbers.add(newNumber);
            newNumber=ui.nextDouble();
        }

        double total=0.00;
        for (int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
            total+=(numbers.get(i));
        }
        System.out.printf("Your total is: %f",total);
    }

    public static void itsYourTurn372(){
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("lizard");
        animalList.add("dog");
        animalList.add("cat");
        Scanner in = new Scanner(System.in);
        String input="";
        int pos;

        while(!input.equals("q")){
            System.out.println(animalList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace,(c)lear or (q)uit? ");
            input = in.nextLine();

            if(input.equals("a")){
                System.out.println("Enter an animal: ");
                input=in.nextLine();
                animalList.add(input);
            }
            else if (input.equals("i")){
                System.out.println("Enter an animal: ");
                input=in.nextLine();
                System.out.println("Enter a pos: ");
                pos=in.nextInt();
                if(pos>0 && pos<animalList.size())
                animalList.add(pos-1,input);
            }
            else if (input.equals("r")){
                System.out.println("Enter an Animal: ");
                input=in.nextLine();
                animalList.remove(input);
            }
            else if(input.equals("p")){
                System.out.println("Enter an animal: ");
                input=in.nextLine();
                System.out.println("Enter a pos: ");
                pos=in.nextInt();
                if(pos>0 && pos<animalList.size())
                    animalList.set(pos-1,input);
            }
            else if(input.equals("c")){
                System.out.println("Are You Sure: ");
                input=in.nextLine();
                if(input.equals("yes")){
                    animalList.clear();
                }
            }
        }
    }
}
