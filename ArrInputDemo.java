import java.util.Scanner;
class ArrInputDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
	
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int j = 0;j<arr.length;j++){
			System.out.print(arr[j]);
			System.out.print(" ");
		}
		System.out.println(arr[3]);
	}
}