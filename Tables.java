import java.util.*;
class Tables{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose table you wanna print: ");
		int n = sc.nextInt();
		System.out.printf("And till which number u wanna print the multiple of %d \n", n);
		int x = sc.nextInt();
		sc.close();
		for(int i=1; i<=x; i++){
			System.out.printf("%d X %d = %d \n", n, i, n*i);
		}
	}
}