public class Triangle extends GeometricObject {
    private double side1,side2,side3=1.0;
    double perimeter=(side1+side2+side3);
    double s=(perimeter/2);
    double a=(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
    double h=2*(a/side2);
    double area=(1/2)*(side2)*(h);

    public Triangle(){
        super();
    }

    public Triangle(double side1,double side2,double side3, String color, boolean filled){
       super(color,filled);
    }
    public double getArea(){
        return area;
         
    }
    public double getPerimeter(){
        return perimeter;
    }
    public String toString(){
        return "Triangle: side1 = "+side1+"side2 = "+side2+"side3 = "+side3;
    }
}
