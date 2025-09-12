package taks_01;

public class Student {
    public String name;
    public String prog;

    public Student(String name,String dept){
        this.name=name;
        this.prog=dept;
    }
    public void updateName(String name){
        this.name = name;
    }
    public void updateProgram(String pgrogram){
        prog = pgrogram;
    }
    public String accessProgram(){
        return prog;
    }
}