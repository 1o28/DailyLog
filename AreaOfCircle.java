import java.util.Scanner;
class AreaOfCircle{
	public static void main(String args[]){
		int r;
		try (Scanner inputRadius = new Scanner(System.in)) {
			System.out.print("Enter radius: ");
			r = inputRadius.nextInt();
		}
		double area = 3.14*r*r;
		System.out.println("Area of circle is "+area);
	}
}