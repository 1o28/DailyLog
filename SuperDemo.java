class Parent
{
	int a = 30;
	void display()
	{
		System.out.println("Parent");
	}
	Parent()
	{
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent
{
	int a = 40;
	void display()
	{
		System.out.println("Child");
		System.out.println("Value from child =" + a);
		System.out.println("Value from Parent = " + super.a);
		super.display();
	}
}
class SuperDemo
{
	public static void main(String args[])
	{
		Child obj = new Child();
		System.out.println(obj.a);
		obj.display();
	}
}