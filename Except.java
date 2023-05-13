class Ex{
	void display(){
		try{
			int a[] = new int[5];
			a[6] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("Exception Handled Successfully..");
	}
}
class Except{
	public static void main(String args[]){
		Ex obj = new Ex();
		obj.display();
	}
}