import java.util.*;
class PatternOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number");
		int N = sc.nextInt();
		sc.close();
		for (int i =1;i<=N;i++){
			for(int j=N-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++){
				System.out.print(k);
			}
				System.out.println();
		}
	}
}