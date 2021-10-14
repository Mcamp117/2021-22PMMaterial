import java.util.Scanner;
public class ArrayNotes {
    public static void main(String[] args) {
        /*
            Python-List
                listy=[1,22,"string or something",[1,2,3],True,Function()]
                listy[2]-> "string or something"
                listy[2]="poop"
                listy=[1,22,"poop",[1,2,3],True,Function()]
            Data Types:
                Bool
                Int
                Float
                Array
                String
                Dictonary
                Tuple
        */
        //datatype [] name of array = {the data}
        // int[] numbers={1,2,3,4,5,6,7,8,9};
        // double[] decimalNumbers={1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};

        //empty list -> listy=[]
        // int[] emptyNumbers;
        // int[] emptyNumbers2 = new int[28];
        // double[] emptyDeciNumbers = new double[28];
        // String[] emptyStringNumbers = new String[28];
        // boolean[] emptyBoolNumbers = new boolean[28];

        //System.out.println(numbers);    //cannot print the array
        //System.out.println(decimalNumbers);
        //System.out.println(emptyNumbers);   //there is nothing there
        //System.out.println(emptyNumbers2);

        // for (int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i]);
        // }
        // printArray(numbers);
        // System.out.println();
        // printArray(decimalNumbers);
        // System.out.println();
        // printArray(emptyNumbers2);
        // System.out.println();
        // printArray(emptyDeciNumbers);
        // System.out.println();
        // printArray(emptyStringNumbers);
        // System.out.println();
        // printArray(emptyBoolNumbers);
        // int[] rando={1,2,3,4,5,6,7,8,9};

        // for (int i=1;i<rando.length;i+=2){
        //     rando[i]+=10;
        // }
        // printArray(rando);
        gpaCalculator();
    }
    private static void gpaCalculator(){
        Scanner sc = new Scanner(System.in);
        double[] grades= new double[5];
        for (int i=0;i<5;i++){
            double g = sc.nextDouble();
            grades[i]=g;
        }
        double sum=0.0;
        for (int i=0;i<5;i++){
            sum+=grades[i];
        }
        System.out.printf("\n%f",(sum/5));
        printArray(grades);
    }

    private static void printArray(int[] listy) {
        for (int i=0;i<listy.length;i++){
            System.out.println(listy[i]);
        }
    }
    private static void printArray(double[] listy) {
        for (int i=0;i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }
    private static void printArray(String[] listy) {
        for (int i=0;i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }
    private static void printArray(boolean[] listy) {
        for (int i=0;i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }

}
