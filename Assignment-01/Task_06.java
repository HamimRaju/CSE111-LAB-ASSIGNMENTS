import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int length = sc.nextInt();

        int [] arr = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter elements of the array : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int counter = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    counter++;
                    arr[j] = -1;   //Marking as counted
                }
            }
            if(arr[i] == -1){ 
                continue;   //Already counted
            }
            System.out.println(arr[i] + " - " + counter + " times.");
        }
        sc.close();
    }
}