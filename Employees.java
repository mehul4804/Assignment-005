
public class Employees 
{
	public static void main(String args[])
	{
	System.out.println("=========================================="+"\n"+"Enter Permanent Employee Details"+"\n"+"======================"+"\n");
	PermanentEmp ob1 = new PermanentEmp();
	ob1.calculatepay();
    ob1.display();
	
    System.out.println("========================"+"\n"+"Enter Temporary Employee Details"+"\n"+"==========================="+"\n");
    TemporaryEmp ob = new TemporaryEmp();
    ob.calculatepay();
    ob.display();

	}
	
}
	