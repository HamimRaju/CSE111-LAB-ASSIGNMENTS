package task_01;

public class UniversityTester {
    public static void main(String[] args) {
        //Task-01(A)
        University uni1 = new University();
        University uni2 = new University();
        System.out.println("The location is : "+uni1);
        System.out.println("The location is : "+uni2);
        if(uni1.equals(uni2)){
            System.out.println("The locations are same.");
        }
        else{
            System.out.println("No, The locations are different.");
        }
        //Task-01(B)
        uni1.name="Imperial College London";
        uni1.country = "England";
        uni2.name="Brac University";
        uni2.country = "Bangladesh";
        System.out.println(uni1.name+","+uni1.country);
        System.out.println(uni2.name+","+uni2.country);
    }
}
