package BAI07;

import java.util.*;

class shape {

    private double perimeter;
    private double area;
    final double PI = 3.14;
    shape()
    {
        
    }
    shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}

class circle extends shape {

    private double radius;

    circle()
    {
        
    }
    public circle(double radius, double perimeter, double area) {
        super(perimeter, area);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double perimeter()
    {
        return radius*2*PI;
    }
    double area()
    {
        return Math.pow(radius, 2)*PI;
    }

}

class rectangle extends shape {

    private double width;
    private double heigth;
    rectangle()
    {
        
    }
    public rectangle(double width, double heigth, double perimeter, double area) {
        super(perimeter, area);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
     double perimeter()
    {
        return (width+heigth)*2;
    }
    double area()
    {
        return width*heigth;
    }

}

public class BAI07 {
   public static void main(String [] args)
   {   Scanner sc = new Scanner(System.in);
       circle h1 = new circle();
       System.out.print("- Enter Radius : ");
       double r = sc.nextDouble();
       h1.setRadius(r);
       h1.setPerimeter(h1.perimeter());
       h1.setArea(h1.area());
       System.out.println("=>Perimeter : "+h1.getPerimeter()+"\n=>Area : "+h1.getArea());
       rectangle h2 = new rectangle();
       System.out.print("- Enter Width and Heigth :");
       double w = sc.nextDouble();
       double h = sc.nextDouble();
       h2.setWidth(w);
       h2.setHeigth(h);
       h2.setPerimeter(h2.perimeter());
       h2.setArea(h2.area());
       System.out.println("=>Perimeter : "+h2.getPerimeter()+"\n=>Area : "+h2.getArea());
   }
}
