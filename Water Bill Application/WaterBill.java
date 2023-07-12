import java.util.Scanner;
class WaterBill{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Units Consumed:- ");
		int numberofUnits = sc.nextInt();
		int meterCharge = 75;
		
		if (numberofUnits <= 100){
			int charge = numberofUnits * 5;
			int totalWaterBill = charge + meterCharge;
			System.out.println("Total Water Bill = "+totalWaterBill);
		}
		else if(numberofUnits <= 250){
			int charge = numberofUnits * 10;
			int totalWaterBill = charge + meterCharge;
			System.out.println("Enter Water Bill = "+totalWaterBill);
		}
		else{
			int charge = numberofUnits * 20;
			int totalWaterBill =  charge + meterCharge;
			System.out.println("Enter Water Bill = "+totalWaterBill);
		}
		
	}
}