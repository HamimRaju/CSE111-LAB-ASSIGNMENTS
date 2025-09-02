import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number : ");
        int end = sc.nextInt();

        int prime_counter = 0;

        for(int i=start; i<=end; i++){
            int counter = 0; 
            if(i==0 || i==1){
                continue; 
            }

            for(int j=2; j<i; j++){
                if(i % j == 0){
                    counter++; 
                    break; 
                }
            }

            if(counter == 0){
                prime_counter++;
            }
        }

        System.out.println("There are " + prime_counter + " prime numbers between " + start + " and " + end);
        sc.close();
    }
}