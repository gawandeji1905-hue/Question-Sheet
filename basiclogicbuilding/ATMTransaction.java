package basiclogicbuilding;
import java.util.Scanner;
public class ATMTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Initial Balance : ");
        int InitialBal = sc.nextInt();
        System.out.print("Enter the Deposite Amount: ");
        int D = sc.nextInt();
        int Total_Balance = InitialBal + D;
        System.out.print("Enter the Amount to Withdrawal: ");
        int W = sc.nextInt();
        if(W>Total_Balance){
            System.out.println("Insufficient balance ");
        }
        else{
            System.out.println(W +" Withdrawl Successfully ");
        }
        Total_Balance = Total_Balance - W;
        System.out.print("Final Balance :"+ Total_Balance);
    }
}   
