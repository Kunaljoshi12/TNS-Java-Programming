package Day20;

public class GenericConstructor {
	
	private double v;
	
	public <T extends Number> GenericConstructor(T t){
		v = t.doubleValue();
		
	}
	
	void show() {
		System.out.println("Value of v in double type is :" +v);
	}
}
