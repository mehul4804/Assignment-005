import java.util.Scanner;

public class Employee 
{
	
	 int empid;
	    String name, location;
	    Scanner get = new Scanner(System.in);
	    Employee()
	    {
	        System.out.println("Enter Name of the Employee:");
	        name = get.nextLine();
	        System.out.println("Enter Location of the Employee:");
	        location = get.nextLine();
	        System.out.println("Enter EmployeeID :");
	        empid = get.nextInt();
	    }
	 
	    void display()
	    {
	        System.out.println("Employee Name: "+name);
	        System.out.println("Employee ID: "+empid);
	        System.out.println("Location: "+location);
	    }
}
