package task_02;

public class Shape {
    String Shape_name;
    double area;
    public void setParameters(String name,int radius){
        Shape_name=name;
        double calculation = 3.1416*radius*radius;
        area = calculation;
    }
    public void setParameters(String name,int base,int height){
        Shape_name=name;
        double calculation = .5*base*height;
        area = calculation;
    }
    public void setParameters(String name,double width,double length){
        Shape_name=name;
        double calculation = width*length;
        area = calculation;
    }
    public String details(){
        return "Shape Name : "+Shape_name+"\nArea : "+area;
    }
}
