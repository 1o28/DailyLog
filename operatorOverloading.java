class operatorOverloading
{
	int a = 5;
	int b = 6;
	public static void main(String args[])
	{
		operatorOverloading obj = new operatorOverloading();
		System.out.println("a+b = " + obj.a + obj.b);
		System.out.println("a+b = " + (obj.a + obj.b));
	}
}