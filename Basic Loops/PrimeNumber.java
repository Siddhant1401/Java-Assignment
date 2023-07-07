import java.util.Scanner;
class PrimeNumber{
	public static void main(String args[]){
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		for (int i=1; i<=number; i++){
			if(number%i==0){
				count++;
			}	
		}
		if(count == 2){
			System.out.print(number+ " is Prime Number");
		}
		else{
			System.out.println(number+ " is not Prime Number");
		}
		
	}
}