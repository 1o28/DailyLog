import java.util.*;
class LargeNo{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		int a = sc.nextInt();
		System.out.println("Enter B :");
		int b = sc.nextInt();
		System.out.println("Enter C :");
		int c = sc.nextInt();
		sc.close();
		System.out.println("Given No's are : "+ a +","+ b +","+ c);
		
		if(a>b){
			if(a>c){
				System.out.println(a+" is greater");
			}
			else{
				System.out.println(c+" is greater");
			}
		}
		else
		if(b>c){
			System.out.println(b+" is greater");
		}
		else{
			System.out.println(c+" is greater");
		}
	}
}