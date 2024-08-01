package Day21;

import java.util.List;

public class UpperBound {

	public void showData(List<? extends Number> al) {
		double s = 0 ;
		for(Number o : al) {
			double k = o.doubleValue();
			//System.out.println(k*k);
			s = s+k;
//			System.out.println(s);
			
		}
		System.out.println(s);

	}
}