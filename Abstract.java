abstract class A
{
	abstract void display();
}

abstract class B extends A
{
	void display()
	{
		System.out.println("Class A");
	}
	abstract void show();
}
class C extends B
{
	void show()
	{
		System.out.println("Class B");
	}
}
class Abstract
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.display();
		obj.show();
	}
}