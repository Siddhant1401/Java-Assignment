import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Element: ");
		int numberOfElements = sc.nextInt();
		
		int number1 = 0, number2 = 1, sum;
		
		for (int i = 1; i <= numberOfElements; i++){
			System.out.println(number1);
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
		}
		
	}
}