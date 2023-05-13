class overload{
	overload()
	{
		System.out.println("Constructor without arguments");
	}
	overload(int a)
	{
		System.out.println("Constructor with value " + a);
	}
	void add()
	{
		int b = 20,c = 10;
		int x = b+c;
		System.out.println("Sum = "+ x);
	}
	void add(int y, int z)
	{
		int d = y+z;
		System.out.println("Sum = " + d);
	}
}

class mainOverload{
	
	public static void main(String args[])
	{
		overload obj = new overload();
		overload obj1 = new overload(5);
		obj.add();
		obj.add(34,56);
		obj1.add();
		obj1.add(45,65);
	}
}