package Day_2;

public class Model 
{

	public static void main(String[] args) 
	{
		
		Car c1 = new Car();
		Driver d1 = new Driver();
		System.out.println("Model name is :"+c1.model);
		System.out.println("Price  is :"+c1.price);
		c1.start();
		c1.stop();
		c1.move();
		
		System.out.println("Name of Driver is :"+d1.name);
		System.out.println("Age of Driver is :"+d1.age);
		d1.drive();

	}
}
