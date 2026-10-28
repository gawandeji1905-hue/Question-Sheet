package basiclogicbuilding;
import java.util.Scanner;
public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Vehicles are in the parking : ");
        int _ = sc.nextInt();
        System.out.print("Enter the number of Hours of Cars  : ");
        int C = sc.nextInt();
        System.out.print("Enter the number of Hours of Bikes : ");
        int B = sc.nextInt();
        System.out.print("Enter the number of Hours of trucks : ");
        int T = sc.nextInt();
        int Car_fee ;
        int Bike_fee ;
        int Truck_fee ;
        if(C>0 && C<=2){
             Car_fee = C*30;
        }
        else{
             Car_fee = (C-2)*20 + 2*30; 
        }
        if(B>0 && B<=2){
             Bike_fee = B*15;
        }
        else{
             Bike_fee = (B-2)*10 + 2*15;
        }
        if(T>0 && T<=2){
             Truck_fee = T*50;
        }
        else{
            Truck_fee = (T-2)*40 + 2*50;
        }
        int Total_Collection = Car_fee + Bike_fee + Truck_fee;
        System.out.print("Total Collection is :"+Total_Collection);
    }
}
