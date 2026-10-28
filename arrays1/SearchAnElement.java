package arrays1;
import java.util.Scanner;
public class SearchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();
        int I = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==target){
                I = i;
            }
            else{
                I = -1;
            }
        }
        System.out.print("Index : "+I);
    }
}
