import java.util.Scanner;
class Average{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double a,b,c;
		System.out.print("Enter 3 values :");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		input.close();
		System.out.print("Average of above 3 values is "+ ((a+b+c)/3));
	}
}