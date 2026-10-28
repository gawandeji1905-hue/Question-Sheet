package arrays1;
import java.util.Scanner;
public class CountPositveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements:");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int countP = 0;
        int countN = 0;
        int countZ = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                countZ++;
            }
            else if(arr[i]>0){
                countP++;
            }
            else{
                countN++;
            }
        }
        System.out.println("Positive : "+ countP);
        System.out.println("Negative : "+ countN);
        System.out.println("Zeros : "+ countZ);
    }
}
