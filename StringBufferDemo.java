class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Welcome");
		System.out.println(str);
		System.out.println(str.append(" to Java Programming Course"));
		System.out.println(str.insert(3,"HOW"));
		System.out.println(str.delete(3,6));
		//System.out.println(str.reverse());
		System.out.println(str.substring(5));
	}
}