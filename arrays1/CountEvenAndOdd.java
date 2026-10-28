package arrays1;
import java.util.Scanner;
public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of values :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the values :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int E = 0;
        int O = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                E++;
            }
            else{
                O++;
            }
        }
        System.out.println("Even :"+E);
        System.out.println("Odd :"+O);
    }
}
