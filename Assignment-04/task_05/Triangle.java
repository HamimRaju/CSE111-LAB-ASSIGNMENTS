package task_05;

public class Triangle {
    public int side1;
    public int side2;
    public int side3;
    String triangle_type;
    public void updateSides(int s1,int s2,int s3){
        side1=s1;
        side2=s2;
        side3=s3;
    }
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: "+side1+", "+side2+", "+side3);
        int perimeter =side1+side2+side3;
        System.out.println("Perimeter : "+perimeter);
    }
    public String printTriangleType(){
        if(side1==side2 && side2==side3 && side3==side1){
            triangle_type ="Equilateral";
        }
        else if(side1==side2||side2==side3||side3==side1){
            triangle_type ="Isosceles";
        }
        else{
            triangle_type ="Scalene";
        }
        return "This is a "+triangle_type+" Triangle.";
    }
    
    public void compareTrinagles(Triangle location){
        if(this==location){
            System.out.println("These two triangle objects have the same address.");
        }
        else if((side1+side2+side3)==(location.side1+location.side2+location.side3)){
            System.out.println("Only the perimeter of both triangles is equal.");
        }
        else if((side1 == location.side1 && side2 == location.side2 && side3 == location.side3)){
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        }
        else{
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }
}
