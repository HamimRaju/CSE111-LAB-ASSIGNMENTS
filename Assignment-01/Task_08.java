import java.util.Scanner;
public class Task_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row = ");
        int row = sc.nextInt();
        System.out.print("Column = ");
        int column = sc.nextInt();

        int [][] twoD = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int user = sc.nextInt();
                twoD[i][j]=user;
            }
        }

        System.out.println("2D Array : ");
        int [] oneD = new int[row*column];
        int index =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                oneD[index]=twoD[i][j];
                System.out.print(twoD[i][j]+" ");
                index++;
            }
            System.out.println();
        }

        System.out.println("1D Array : ");
        for(int i=0;i<oneD.length;i++){
            System.out.print(oneD[i]+" ");
        }

        sc.close();
    }
}
