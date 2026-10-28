package basiclogicbuilding;
import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of units used : ");
            int n = sc.nextInt();
            int bill;
            if(n<=100){
                bill = n*5;
                System.out.print("Your Bill is  "+ bill);
            }
            else if(n<=200){
                bill = (n-100)*7 + 100*5;
                System.out.print("Your bill is  "+ bill);
            }
            else if(n<=400){
                bill = (n-200)*10 + 100*7+100*5;
                System.out.print("Your Bill is  "+bill);
            }
            else{
                bill = (n-400)*15 + 100*10 + 100*7 + 100*5;
                System.out.print("Your bill is  "+ bill);
            }
        }
    }
    
}
