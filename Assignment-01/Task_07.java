import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array : ");
        int length = sc.nextInt();

        double[] arr = new double[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            Double element = sc.nextDouble();
            arr[i] = element;
        }

        double[] unique = new double[length];
        int unique_count = 0;

        for (int i = 0; i < length; i++) {
            if ((i < length - 1) && arr[i] == arr[i + 1]) {
                continue;
            } 
            else {
                unique[unique_count] = arr[i];
                unique_count++;
            }
        }

        System.out.print("New Array : ");
        for (int i = 0; i < unique_count; i++) {
            System.out.print(unique[i] + " ");
        }

        System.out.println("\nRemoved elements : " + (length - unique_count));

        sc.close();
    }
}