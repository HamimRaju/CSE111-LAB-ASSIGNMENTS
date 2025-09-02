import java.util.Scanner;
public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String s1 = sc.nextLine();
        System.out.print("Please enter a String : ");
        String s2 = sc.nextLine();

        String combined = s1 +" "+s2;

        int sum = 0;
        for(int i=0;i<combined.length();i++){
            char c = combined.charAt(i);
            if(c>='a' && c<='z'|| c>='A'&& c<='Z'){
                sum+=(int)c;
            }  
            else{
                continue;
            }
        }
        System.out.println(combined);
        System.out.println(sum);
        sc.close();
    }
}
