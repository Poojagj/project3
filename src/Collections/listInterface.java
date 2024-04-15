package Collections;

import java.util.List;
import java.util.ArrayList;

public class listInterface {

	public static void main(String[] args) {
		
		listInterface lt = new listInterface();
		lt.method1();
		lt.method2();
		lt.method3();
	}
	
	void method1(){
		
		//WAP to add elements of list2 into list1 at position 2
 
		 List<String> al = new ArrayList<String>();

		// Adding elements in the list1. 
		   al.add("Apple"); 
		   al.add("Mango"); 
		   al.add("Orange"); 
		   al.add("Grapes"); 
		   System.out.println("List1 contain: " +al); 

		// Create another list2 of String type. 
		   List<String> al2 = new ArrayList<String>(); 
		    al2.add("11"); 
		    al2.add("12"); 
		    al2.add("13"); 
		  System.out.println("List2 contain :"+al2); 

		// Adding list2 in list1 at 2nd position (index = 2) using addAll() method. 
		   al.addAll(2, al2); 
		   System.out.println("List1 after adding List2 at 2nd position: " +al); 
		   System.out.println("------------------------------------------------- "); 
		   
		  } 
	
	void method2(){
	//WAP to add both integer and string elements together
		
		List al = new ArrayList();  


		   al.add(10); 
		   al.add(20); 
		   al.add(30); 
		   al.add(40); 
		   al.add("Shubh"); 


		   al.add(4, 35); 
	
		   al.add(5, 45); 

		   System.out.println("Elements after adding: " +al); 
		   System.out.println("------------------------------------------------- ");
	}
	
	void method3(){
	// WAP  to find the index of a specific element in the list
		
		 List al = new ArrayList(); 

		   al.add("pen"); 
		   al.add("pencil"); 
		   al.add("ink"); 
		   al.add("notebook"); 
		   al.add("book"); 
		   al.add("paper"); 
 
		   System.out.println("First Element: " +al.get(0)); 
		   System.out.println("Fourth Element: " +al.get(3)); 
		   System.out.println("------------------------------------------------- ");
	}

	}


