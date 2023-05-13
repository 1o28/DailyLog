import java.util.Scanner;
class Character{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char C1 = sc.next().charAt(0);
		//char C2 = sc.next().charAt(1);
		//char C3 = sc.next().charAt(2);

		System.out.print(C1);
		sc.close();
	}
}