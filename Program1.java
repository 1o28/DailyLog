class Test{
	void show()
	{
		System.out.println("Test called!");
	}
}
class Program1{
	public static void main(String args[])
	{
		Test t = new Test();
		t.show();		 
	}
}