import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String s1= sc.nextLine();
        String modified ="";
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c=='a'){
                int number = ((int)c)+25;
                modified+=(char)number;
            }
            else if(c=='z'){
                int number = ((int)c)-25;
                modified+=(char)number;

            }
            else if(c=='A'){
                int number = ((int)c)+25;
                modified+=(char)number;
            }
            else if(c=='Z'){
                int number = ((int)c)-25;
                modified+=(char)number;
            }
            else{
                int number = ((int)c)-1;
                modified+=(char)number;
            }
            
        }
        System.out.println(modified);
        sc.close();
    }
}
