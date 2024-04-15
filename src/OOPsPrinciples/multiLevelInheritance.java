package OOPsPrinciples;

public class multiLevelInheritance {

	public static void main(String[] args) {
		subClass2 c= new subClass2();
		c.print_1();
		c.print_2();
		c.print_3();

	}

}
class Super {
    public void print_1()
    {
        System.out.println("I am parent");
    }
}
  
class subClass1 extends Super {
    public void print_2() { 
    	System.out.println("I am subClass 1"); }
}
  
class subClass2 extends subClass1 {
    public void print_3()
    {
        System.out.println("I am subClass 2");
    }
}
