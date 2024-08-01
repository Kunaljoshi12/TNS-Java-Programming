package Day20;

public class GenericMethod {
	
	public <E> void printData(E[] data) {
		
		for (E data1 : data) {
			System.out.println(data1);
		}
	}

}
