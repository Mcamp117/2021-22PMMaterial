import java.lang.Math;
public class JavaMath {
    public static void main(String[] args) {
        /* System.out.println(18/5);   //int/int results in an int
           System.out.println(18./5);  //anytime there is a decimal, it will result in a decimal
           System.out.println(18/5.);
           System.out.println(18./5.);
           System.out.println("18"+5);
           System.out.println(Math.pow(2,2));
           System.out.println("18"/"5"); can't divide strings
           System.out.println("18"*5);   can't multiply strings
           System.out.println(18//5);    sorry, no double slash
           System.out.println(2**2);     sorry, no **
           System.out.println(6-1+7);
           System.out.println((Math.pow(7,3)*4)+7);
           System.out.println(Math.pow(6,2)-3*(Math.pow(3,2)*2)+5);
           
           int x=1;
        x=x+89;
        //python:   x+=89
        x+=89;
        x++;    //adds 1
        x--;    //minus 1
        x-=2;
        x/=2;
        x*=2;
        x%=2;
        System.out.println(x);*/

            int numPeople = 0;  
            double totalYears = 0;

            double years = 12.5;  // I will soon be halfway through my senior year.

            totalYears += years;
            numPeople += 1;

            years=12;

            totalYears += years;
            numPeople += 1;

            years=5;

            totalYears += years;
            numPeople += 1;

            years=11.5;

            totalYears += years;
            numPeople += 1;

            //The average years you and your friends have been in school
            //Number of school days you and your friends have been in

            System.out.println("Average Years: "+ totalYears/numPeople);
            System.out.println("Number of days: "+(int) totalYears*180);
    }
}
