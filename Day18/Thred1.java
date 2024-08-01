package Day18;


public class Thred1  extends Thread{
	
	@Override
	public void run() {
		 for(int i = 0; i < 10; i++)
	        {
	            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
	        }
	}

}
