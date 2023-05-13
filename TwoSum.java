import java.util.Scanner;

class TwoSum{
	public static void main(String[] args){
		//Taking input using Scanner class.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in array");
		//Initialising array
		int[] arr = new int[4];
		//Taking value in array & target using object of Scanner class.
		for (int i = 0;i <arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target value");
		int target = sc.nextInt();
		sc.close();
		for (int j = 0;j<arr.length;j++){
			for (int k = 1;k<arr.length;k++){
				if (arr[j]+arr[k] == target){
					System.out.println(arr[j]+","+arr[k]);
				}
			}
		}
	}
}