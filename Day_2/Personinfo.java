package Day_2;

public class Personinfo 
{

	 public static void main (String arr[])
		{
		
		Person p1 = new Person() ;
		p1.setIncome(6000);
		p1.setPemail("KL");
		p1.setPname("Kunal");
		p1.setTax(2.0f);
		
		String s  = p1.toString();
		System.out.println(s);
		
		
	}
}
