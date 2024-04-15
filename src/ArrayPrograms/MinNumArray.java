package ArrayPrograms;

public class MinNumArray {

	public static void main(String[] args) {
		  int [] arr = {60 , 20 , 30 , 10 , 50 };   
	        int min = arr[0];  
	       
	        for (int i = 1; i < arr.length; i++) {  
	       
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        
	        System.out.println("Smallest element present in given array: " + min);  
	    }  

	

}
