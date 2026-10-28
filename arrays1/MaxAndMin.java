package arrays1;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Values: ");
        int n = sc.nextInt();
        System.out.print("Enter teh values : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }
}
