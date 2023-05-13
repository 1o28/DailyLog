class parent
{
	int a = 10;
	void display()
	{
		System.out.println("Parent/Base Class");
	}
}
class child extends parent
{
	int b = 20;
	void show()
	{
		System.out.println("Child/Derived Class");
	}
}
class inherited
{
	public static void main(String args[])
	{
		child c = new child();
		System.out.println("From child class " + c.b);
		c.show();
		System.out.println("Inherited from parent class " + c.a);
		c.display();	
	}
}