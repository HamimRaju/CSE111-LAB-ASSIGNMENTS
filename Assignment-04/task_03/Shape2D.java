package task_03;

public class Shape2D {
    public String shape_name;
     public double area;

     public Shape2D (){
        this.shape_name = "Square";
        this.area = 5*5;
        System.out.println("A Square has been created with length : 5");
     }
    public Shape2D(int length,int breadth){
        this.shape_name = "Rectangle";
        System.out.println("A Rectangle has been created with length : "+length+" and breadth : "+breadth);
        this.area = length * breadth;
    }
    public Shape2D(int base,int height,String name){
        this.shape_name = "Triangle";
        System.out.println("A Triangle has been created with height: "+height+" base: "+base);
        this.area = (base*height)/2;
    }
    public Shape2D(int side1,int side2,int side3){
        this.shape_name = "Triangle";
        System.out.println("A Triangle has been created with the following sides: "+side1+", "+side2+", "+side3);
    
        double s = (side1 + side2 + side3) / 2.0;
        this.area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
    public void area(){
        System.out.println("The area of the "+this.shape_name+" is : "+this.area);
    }
}
