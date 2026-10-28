package strings;
import java.util.Scanner;
public class AccesTokenGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Phrase : ");
        String S = sc.next();
        int n = S.length();
        int T1 = 0;
        int T2 = 0;
        for(int i = 0;i<n;i++){
            if(S.charAt(i)==S.charAt(n-1)){
                 T1 = ((int)(S.charAt(0)-64))+((int)(S.charAt(n-1))-64);
                 T2 = ((int)(S.charAt(i)-64))*n;
                 break; 
            }
            else{
                T2 = (int)(S.charAt(i)-64)*n;
            }
        }
        System.out.print(T1);
        System.out.print(T2);
    }
}
