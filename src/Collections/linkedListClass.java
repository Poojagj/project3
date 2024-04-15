package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListClass {

	public static void main(String[] args) {
		linkedListClass llc = new linkedListClass();
		llc.method1();

	}
	
	void method1(){
		LinkedList<String> ll = new LinkedList<>();
        ll.add("Animal");
        ll.add("Cat");
  
        ll.add(1, "Dog");

        System.out.println(ll);
        ll.set(1, "Horse");
        System.out.println(ll);
        
        ll.remove(1);
        ll.remove("Horse");
        System.out.println(ll);
        
        ll.addFirst("First");
        System.out.println(ll);
        
        ll.addLast("Last");
        System.out.println(ll);
        
        System.out.println("---------------");
      
	}

}
