import java.util.Scanner;
class ReverseNum{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		b = (a+b)-(a=b);
		System.out.println("After reversing the numbers :"+ a +","+b);
	}
}