package object;

public class objectCreation {
	
	int a=100;
	
	void m1()
	{
		System.out.println(++a);
	}

	public static void main(String[] args) {


		objectCreation obj = new objectCreation();
		System.out.println(obj.a);//100
		obj.m1();//101
	}

}
