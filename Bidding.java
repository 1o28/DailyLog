import java.util.Scanner;
class Bidding{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int T = sc.nextInt();
		for(int i = 1;i<=T;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			sc.close();
			System.out.println(a+","+b+","+c);
		}
	}
}