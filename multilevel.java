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
		System.out.println("B");
	}
}
class C extends B
{
	int c = 30;
	void dis()
	{
		System.out.println("C");
	}
}
class multilevel
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.dis();
		System.out.println("Value from Class C " + obj.c);
		obj.show();
		System.out.println("Value from Class B " + obj.b);
		obj.display();
		System.out.println("Value from Class A " + obj.a);
	}
}