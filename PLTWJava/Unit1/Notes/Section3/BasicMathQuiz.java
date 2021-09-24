import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class BasicMathQuiz {
    public static void main(String[] args) {
        Scanner ui=new Scanner(System.in);
        Random rand=new Random();
        int points = 0
        int i=10;
        while(i!=0){
            int num1=(int)(Math.random()*100); //Math Class Random
            int signNum=rand.nextInt(4);
            int num2=rand.nextInt(100)+1;    //Random Class Random
            double answer=0;
            Double input=0;
            if(signNum==1){
                System.out.printf("What is %d/%d ",num1,num2);
                answer= (double)num2/num1;
                input=ui.nextDouble();
            }
            else if(signNum==2){
                System.out.printf("What is %d*%d ",num1,num2);
                answer= num1*num2;
                input=ui.nextDouble();
            }
            else if(signNum==3){
                System.out.printf("What is %d-%d ",num1,num2);
                answer= num1-num2;
                input=ui.nextDouble();
            }
            else{
                answer= num1+num2;
                System.out.printf("What is %d+%d ",num1,num2);
                input=ui.nextDouble();
            }
            
            if (input==answer){
                System.out.printf("That's correct ");
                points++;
            }
            else{
                //%s=string     %d=int      %f=float or double
                System.out.printf("Ooo so close, answer was %f ",answer);  
            }
            i--;
        }
        System.out.printf("You got %d correct out of 10",points);
    }
}
