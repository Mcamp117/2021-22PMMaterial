import java.util.Scanner;
public class CampBellringer20211019 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("How many numbers ");
        int n=ui.nextInt();
        double[] numbers = new double[n];

        for (int i=0;i<numbers.length;i++){
            double newNumber=ui.nextDouble();
            numbers[i]=newNumber;
        }
        double total=0.0;
        for (int i=0;i<numbers.length;i++){
            total+=numbers[i];
        }
        System.out.printf("Your total is: %f",total);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
