

class A
{
	void add()
	{
		try{
		// int a = 5/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Exception handled...");
	}		
}
class AMain
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.add();
	}
}