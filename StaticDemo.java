class Demo
{
	static int a = 10;
	static void display()
	{
		System.out.println("Static Method");	
	}
	static
	{
		System.out.println("Static Block");
	}
}
class StaticDemo
{
	public static void main(String args[])
	{
		System.out.println("Main Method");
		System.out.println(Demo.a);
		Demo.display();
	}
}	