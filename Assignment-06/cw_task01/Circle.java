package cw_task01;

public class Circle {
    public static int count = 0;
    private int radius;
    public Circle(int radius){
        this.radius = radius;
        count++;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        return 3.1416*radius*radius;
    }
}
