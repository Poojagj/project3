package OOPsPrinciples;

import java.util.Scanner;

public class interfaceClass {
	public static void main(String[] args) {
	client cl = new developer();
	cl.input();
	cl.output();
	
	}
}

interface client{
	
	void input();
	void output();

}

class developer implements client{
	
	String Fname , Lname , designation;
	double salary;
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first name:");
		Fname=sc.next();
		System.out.print("Please enter your Last name:");
		Lname=sc.next();
		System.out.print("Please enter your salary:");
		salary=sc.nextDouble();
		System.out.print("Please enter your designation:");
		designation =sc.next();	
	}
	
	public void output(){
		
		System.out.println(" \nYour details are saved in Database as below: \n Name:"+Fname+" "
				+ "\n Lastename: "+Lname+" \n Salary : "+salary+" \n Designation: "+designation);
	}
}