package cw_task_01;

public class Circle extends Shape{
    public int radius ;

    public void area(){
        double area = 3.1416*radius*radius;
        System.out.println("Area of "+super.color+ " Circle : "+area);
    }
}
