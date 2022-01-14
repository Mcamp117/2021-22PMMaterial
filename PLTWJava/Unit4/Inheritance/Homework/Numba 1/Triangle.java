public abstract class Triangle extends GeometricObject {
    double side1,side2,side3=1.0;
    double perimeter=(side1+side2+side3);
    double s=(perimeter/2);
    double a=(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
    double h=2*(a/side2);
    double area=(1/2)*(side2)*(h);
    

    public Triangle(){
        
    }
    public Triangle(Double side1, Double side2, Double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        
    }
    public double getArea(){
        System.out.println(a);
        return area;
         
    }
    public double getPerimeter(){
        return perimeter;
    }
    public String toString(){
        return "Triangle: side1 = "+side1+"side2 = "+side2+"side3 = "+side3;
    }
}
