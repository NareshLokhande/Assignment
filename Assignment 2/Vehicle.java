public class Vehicle{
	int price;
	String color;
	String model;

public Vehicle(int x, String y, String z){
	price = x;
	color = y;
	model = z;
}

	public static void main(String args[])
	{
	Vehicle car = new Vehicle(40000, "blue", "B8");
	car.display();
	}

	void display()
	{
	System.out.println("Price of the vehicle : " +price);
	
	System.out.println("Color of the vehicle : " +color);

	System.out.println("Model of the vehicle : " +model);
	}
}
