package day5;

public class EmployeeMain {

	public static void main(String args[])
	{
		Employee emp1=new Employee();  //creating object
		emp1.eid=101;
		emp1.ename="david";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.job="manager";
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="jhon";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.job="Ass.manager";
		emp2.display();
		
		
		
		
	}

}
