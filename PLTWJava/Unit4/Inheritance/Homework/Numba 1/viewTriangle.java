import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class viewTriangle{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in); 
        System.out.println("What is the color");
        String color = ui.nextLine();
        System.out.println("Is the triangle filled?(Y/N)");
        String yn = ui.nextLine();
        boolean filled = true;
        if(yn.equals("Y")){filled=true;}
        if(yn.equals("N")){filled=false;}
        System.out.println("Enter value for side1");
        double s1=ui.nextDouble();
        System.out.println("Enter value for side2");
        double s2=ui.nextDouble();
        System.out.println("Enter value for side3");
        double s3=ui.nextDouble();
        Triangle triangle = new Triangle(s1,s2,s3, color, filled);
        triangle.setColor(color);
        triangle.setFilled(filled);
        triangle.toString();
        System.out.println("Area : " +triangle.getArea()+
        "\nPerimeter : "+triangle.getPerimeter()+
        "\nColor : "+triangle.getColor()+
        "\nFilled : "+ triangle.isFilled());
    }
}
