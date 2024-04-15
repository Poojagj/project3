package operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		ArithmeticOperators ao = new ArithmeticOperators();
		//ao.method1();
		ao.method2();
	    
	}
	
	void method1(){
		
		int x=10;
		int y=40;
		int sum;
		
		sum=x+y;
		
		//+ operator
		System.out.println(sum);
		
		//- operator
		int sub;
		sub=y-x;
		
		System.out.println(sub);
		
		//* operator
		int m;
		m=x*y;
		System.out.println(m);
		
		// '/' operator
		int d;
		d=y/x;
		System.out.println(d);
		
		// '%' operator
		
	    int mod;
	    mod=y%x;
	    System.out.println(mod);

	    int i;
	    i=++x;
	    System.out.println(i);// x=10 , x++ = 11
	    
	    int dec;
	    dec=--y;
	    System.out.println(dec);
		
	}
	
	void method2(){
		// 3. Write a program to convert cms to meters and kms --- Lab Session
		
		double centim;
		
		System.out.print("Enter number in centi-meter:");
		
		Scanner sc = new Scanner(System.in);
		centim=sc.nextDouble();
		
		double meter = centim/100;
		System.out.println(centim +"cm =" +meter+"m");
		
		double kilo_meter = centim/1000;
		System.out.println(centim +"cm =" +kilo_meter+"km");
		
		
	}

}
