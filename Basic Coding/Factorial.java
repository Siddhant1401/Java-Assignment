import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		int fact=1;
		
		for (int i=1; i<=number; i++){
			fact = fact*i;
		}
		System.out.println("Factorial of "+number+" = " +fact);
	}
	
}