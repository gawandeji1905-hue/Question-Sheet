package arrays1;
import java.util.Scanner;
public class ArraySumAndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Subject: ");
        int n = sc.nextInt();
        System.out.print("Enter the marks in each Subject: ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Total = 0;
        for(int i = 0;i<n;i++){
            Total = Total + arr[i];
        }
        double Avg = Total/n;
        System.out.println("Total = "+Total);
        System.out.println("Average = "+Avg);
    }
}
