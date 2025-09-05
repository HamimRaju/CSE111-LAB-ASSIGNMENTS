package task_06;

public class Assignment {
    int tasks = 0;
    String difficulty = "null";
    boolean submission = false;

    public void printDetails(){
        System.out.println("Number of tasks : "+tasks);
        System.out.println("Difficulty level : "+difficulty);
        System.out.println("Submission required : "+submission);
    }
    public String makeOptional(){
        return "Assignment will not require submission";
    }
}
