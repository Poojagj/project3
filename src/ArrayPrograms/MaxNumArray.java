package ArrayPrograms;

public class MaxNumArray {

	public static void main(String[] args) {
		int [] arr ={60 , 20 , 30 , 10 , 50 };  
        
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
        
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  

	

}
