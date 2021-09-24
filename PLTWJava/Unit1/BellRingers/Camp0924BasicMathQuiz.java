import java.util.Random;
import java.lang.Math;
public class Camp0924BasicMathQuiz {
    public static void main(String[] args) {
        Random rand=new Random();
        int num1=(int)(Math.random()*100); //Math Class Random
        int num2=rand.nextInt(100)+1;    //Random Class Random
        int equals=num1+num2;
        System.out.printf("%d+%d=%d",num1,num2,equals);
    }
}
