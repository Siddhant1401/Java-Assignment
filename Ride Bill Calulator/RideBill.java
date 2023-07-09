import java.util.Scanner;
class RideBill{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Height : ");
		int height = sc.nextInt();
		int sum = 0;
		
		if(height < 120){
			System.out.println("can't Ride");
		}
		else{
			System.out.println("Enter the age :");
			int age = sc.nextInt();
			if(age < 12){
				sum = sum + 5;
			}
			else if(age > 12 && age < 18){
				sum = sum + 7;
			}
			else if(age >= 18 && age < 45){
				sum = sum + 12;
			}
			else if(age > 45 && age < 55){
				sum = sum + 0;
			}
			else{
				System.out.println("Invalid Input");
			}
			
			System.out.println("Want Photos?:");
			Scanner n = new Scanner(System.in);
			String photos = n.nextLine();
			
			if(photos.equalsIgnoreCase("No")){
				System.out.print("The Total Bill : "+"$"+sum);
			}
			else if(photos.equalsIgnoreCase("Yes")){
				sum = sum + 3;
				System.out.println("Total Bill :"+"$"+sum);
			}
			else{
				System.out.println("Invalid Input");
			}
			
		}
		
			
	}
}
