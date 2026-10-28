package basiclogicbuilding;
import java.util.Scanner;
public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Subjects:");
        int n = sc.nextInt();
        System.out.print("Enter the Marks in every subject : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = 0;
        int failed = 0;
        for(int i = 0;i<n;i++){
            total = total + arr[i];
        }
        System.out.println("Total :"+total);
        int avg = total / n;
        System.out.println("Average: "+avg);
        for(int ele : arr){
            if(ele<=40){
                failed++;
            }
        }
        System.out.println("Failed Subject : "+failed);
        if(failed==0 && avg>50){
            System.out.print("Result : Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}
