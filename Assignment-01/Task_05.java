import java.util.Scanner;
public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int length = sc.nextInt();

        int [] arr = new int [length];
        for(int i=0;i<length;i++){
            System.out.print("Enter elements of the array : ");
            int elements = sc.nextInt();
            arr[i]=elements;
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
