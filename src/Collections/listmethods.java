package Collections;

import java.util.ArrayList;
import java.util.List;

public class listmethods {

	public static void main(String[] args) {
		
		listmethods lm = new listmethods();
		lm.method1();
		lm.method2();
		lm.method3();
		lm.method4();

	}
	
	void method1(){
		List<String> al = new ArrayList<>();
		 
        al.add("Anil");
        al.add("Priya");
        al.add(1, "Chandu");
        System.out.println(al);
        
        al.set(2, "jassi");
        System.out.println(al);
        
        System.out.println("---------------");


	}
	
	void method2(){
		
		List<Integer> numbers = new ArrayList<>();
		
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
 
        // use indexOf() to find the first occurrence of an element in the list
        int index = numbers.indexOf(2);
        System.out.println(
            "The first occurrence of 2 is at index " + index);
 
        // use lastIndexOf() to find the last occurrence of  an element in the list
        int lastIndex = numbers.lastIndexOf(2);
        System.out.println(
            "The last occurrence of 2 is at index "+ lastIndex);
        System.out.println("---------------");
	}
	
	void method3(){
		
		 List<String> al = new ArrayList<>();
		
	        al.add("Dogs");
	        al.add("Cats");
	 
	        al.add(1, "Horse");
	 
	        System.out.println("Initial ArrayList " + al);
	 
	        al.remove(1);
	 
	        System.out.println("After the Index Removal " + al);
	 
	        al.remove("Dogs");
	 
	        System.out.println("After the Object Removal " + al);
	        System.out.println("---------------");
	}

	
	void method4(){
		
		List<String> al = new ArrayList<>();

		al.add("Anil");
        al.add("Priya");
        al.add("Chandu");
 
        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);
 
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);
        
        boolean isPresent = al.contains("Priya");
    
        System.out.println("Is Priya present in the list?: "+ isPresent);
        System.out.println("---------------");
	}
}
