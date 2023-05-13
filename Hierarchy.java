class A
{
	int a = 10;
	void display()
	{
		System.out.println("A");
	}
}
class B extends A
{
	int b = 20;
	void show()
	{
		System.out.println("1st Child");	
	}
}
class C extends A
{
	int c = 30;
	void dis()
	{
		System.out.println("2nd Child");
	}
}
class Hierarchy
{
	public static void main(String args[])
	{
		B obj1 = new B();
		obj1.show();
		System.out.println("Value 1st Child " + obj1.b);
		obj1.display();
		System.out.println("Value of parent " + obj1.a);

		C obj = new C();
		obj.dis();
		System.out.println("Value 2nd Child " + obj.c);
		obj.display();
		System.out.println("Value of parent " + obj.a);
	}
}