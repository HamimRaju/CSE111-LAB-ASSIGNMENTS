package ungraded_5;

public class Calculator {
    public void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public void add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
    public void multiply(int n1,int n2){
        System.out.println(n1*n2);
    }
    public void multiply(int n1,int n2,int n3){
        System.out.println(n1*n2*n3);
    }
    public void multiply(String n1, int n2){
        for(int i = 0; i < n2; i++){
            System.out.print(n1);
            if(i < n2 - 1){ 
                System.out.print("-");
            }
        }
        System.out.println();
    } 
}
