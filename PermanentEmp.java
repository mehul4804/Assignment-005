
public class PermanentEmp extends Employee
{
	int workinghrs,leaves;
	int des;
	 public static float total_salary,salary,hr = (0.5f*salary),pf = (0.12f*salary),rate;
	PermanentEmp()
    {
		System.out.println("Enter Designation:");
        des = get.nextInt();
        System.out.println("Enter Salary:");
        salary = get.nextFloat();
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
        System.out.println("Enter Number of Leaves:");
        leaves = get.nextInt();
    }
    void calculatepay()
    {
        rate = salary - (8 * workinghrs);
        total_salary=salary+hr-pf;
           }
 
    void display()
    {
        System.out.println("=============================="+"\n"+"Permanent Employee Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Your salary :"+salary);
        System.out.println("Designation: "+des);
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Enter Number of Leaves:"+leaves);
        System.out.println("Salary for "+workinghrs+" working hours is: Rs"+rate);
        System.out.println("Total salary :----> Rs"+rate);
    }
}