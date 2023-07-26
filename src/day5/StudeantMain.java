package day5;

public class StudeantMain {

	public static void main(String[] args) {

		Student stu1=new Student(1010,"jhon",'A');  //3 Assign values by using constructor
		
		//1 assign values by using reference variable
		
		
		/*stu1.sid=1010;
		stu1.sname="jhon";
		stu1.grade='A';*/
		
		//2 Assign values by using method
		
		//stu1.getValues(1010,"jhon",'A');
		
		stu1.display();
		
		
	}

}
