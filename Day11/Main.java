package Day11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] stu;
		stu = new Student[5];
		
//		Student[] students = new Student[5];
		
		stu[0] = new Student ("KUNAL",39);
		stu[1] = new Student ("KUNAL",39);
		stu[2] = new Student ("KUNAL",39);
		stu[3] = new Student ("KUNAL",39);
		stu[4] = new Student ("KUNAL",39);
		
		
		  for (int i = 0 ;i<stu.length; i++) {
			  System.out.println(i + stu[i].getRoll_no() + stu[i].getRoll_no());
		  }
	}

}
