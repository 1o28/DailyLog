class thisKeyword{
	int a = 10;
	void display()
	{
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String args[])
	{
		thisKeyword obj = new thisKeyword();
		obj.display();
	}
}