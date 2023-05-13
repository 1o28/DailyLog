import java.util.Scanner;
class LastDigit{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = input.nextInt();
		input.close();
		int lastdigit = num%10;
		System.out.print("Last Digit is " + lastdigit);

	}
}