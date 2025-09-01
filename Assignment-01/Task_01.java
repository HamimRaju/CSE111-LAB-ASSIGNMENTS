import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        int minimum = 0;
        int maximum = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            System.out.print("Enter a number : ");
            int number = sc.nextInt();

            if(number > 0 && number % 2 != 0){
                sum += number;
                counter++;

                if(counter == 1){
                    minimum = number;
                    maximum = number;
                }
                else {
                    if(number < minimum){
                        minimum = number;
                    }
                    if(number > maximum){
                        maximum = number;
                    }
                }
            }
        }

        if(counter == 0){
            System.out.println("No odd positive numbers found");
        }
        else{
            System.out.println("Sum : " + sum);
            System.out.println("Minimum : " + minimum);
            System.out.println("Maximum : " + maximum);
            System.out.printf("Average : %.2f",(double)sum/counter);
        }
        sc.close();
    }
}