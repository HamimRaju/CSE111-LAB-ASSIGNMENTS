package hw_task_05;

public class ComplexNumber extends RealNumber{
    public double imaginary_part;
    public ComplexNumber(){
        super( 1.0);
        imaginary_part=1.0;

    }
    public ComplexNumber(double real_part,double imaginary_part){
        super(real_part );
        this.imaginary_part = imaginary_part;
    }
    public String toString(){
        return super.toString()+"\nImaginartyPart : "+this.imaginary_part;
    }
}
