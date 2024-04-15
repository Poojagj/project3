package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {
	
	public static void main(String[] args) {
		ArrayListClass alc = new ArrayListClass();
		alc.method1();
		alc.method2();
		alc.method3();
		alc.method4();
	}
	
	void method1(){
		
		 ArrayList<String> al = new ArrayList<>();
		 
	        al.add("Animal");
	        al.add("Cat");
	  
	        al.add(1, "Dog");

	        System.out.println(al);
	        al.set(1, "Horse");
	        System.out.println(al);
	        
	        al.remove(2);
	        al.remove("Horse");
	        System.out.println(al);
	        System.out.println("---------------");
	        
	}
	
	void method2(){
		
		 ArrayList<Integer> list = new ArrayList();
	        list.add(2);
	        list.add(4);
	        list.add(3);
	        list.add(1);
	        
	        System.out.println("\nIs List empty :"+list.isEmpty());
	        
	        System.out.println("\nBefore sorting list:");
	        System.out.println(list);
	        
	        Collections.sort(list);// note: data type should be similar.
	        System.out.println("after sorting list:");
	        System.out.println(list);
	        
	        Collections.shuffle(list);
	        System.out.println("after Shuffling list:");
	        System.out.println(list);
	        
	        System.out.println("\nList contains 5: "+list.contains(5));
	        
	        System.out.println("\nThe size is :" +list.size());
	        
	        list.clear();
	        System.out.println("\nAfter clearing size is :" +list.size());
	        System.out.println("---------------");
	        
	        
	}
	
	void method3(){
		
	ArrayList<String> arrlist = new ArrayList<String>();

    arrlist.add("A");
    arrlist.add("B");
    arrlist.add("C");
    arrlist.add("D");

    System.out.println("ArrayList: "+ arrlist);

    Iterator<String>iterator = arrlist.iterator();

    System.out.println("\nUsing Iterator:");
    
    while (iterator.hasNext()) {
    	
         System.out.println(iterator.next());
    }

	System.out.println("\nUsing forloop:");
	
	for(int i=0; i<arrlist.size();i++){
		
		System.out.println(arrlist.get(i));
	}
	
    System.out.println("\nUsing foreach loop:");
	
	for(Object e:arrlist){
		
		System.out.println(e);
	}
		
  }
	
	void method4(){
		ArrayList<String> arrlist = new ArrayList<String>();

	    arrlist.add("A");
	    arrlist.add("B");
	    arrlist.add("C");
	    arrlist.add("D");
	    
	    
	    ArrayList<String> arrlist_dupe = new ArrayList<String>();
	    arrlist_dupe.addAll(arrlist);
	    System.out.println(arrlist_dupe);
	    
	    Collections.sort(arrlist,Collections.reverseOrder());
	    System.out.println(arrlist);
	    
	
	}
}

