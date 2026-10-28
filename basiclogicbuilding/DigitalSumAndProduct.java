package basiclogicbuilding;
import java.util.Scanner;
public class DigitalSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(n!=0){
            int rem = n%10;
            sum = sum + rem;
            product = product*rem;
            n=n/10;
        }
        System.out.println("The Sum of digit is "+ sum);
         System.out.println("The product of digit is "+ product);
        if(sum%3==0){
            System.out.print("It is divisible by 3");
        }
        else{
            System.out.print("Not divisible by 3");
        }
    }
}
