class car{
	public String carName;
	public int maxSpeed;
	public int capacity;
	public String fuelType;
	public int price;

	public void driving(){
		System.out.printf("You drive %s at max speed %d \n", carName, maxSpeed);
	}
	
	public void details(){
		System.out.printf("The price of %s is %d with sitting capacity of %d peoples and fuel type is %s\n",carName, price, capacity, fuelType);
	}
}
class MyCar{
	public static void main(String[] args){
		car c1 = new car();
		c1.carName = "thar";
		c1.maxSpeed = 240;
		c1.capacity = 4;
		c1.fuelType = "diesel";
		c1.price = 20000000;

		c1.driving();
		c1.details();
	}
}