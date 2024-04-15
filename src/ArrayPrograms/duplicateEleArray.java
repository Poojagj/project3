package ArrayPrograms;

public class duplicateEleArray {

	public static void main(String[] args) {

		int [] arr =  {11, 26, 39, 44, 26, 78, 88, 88, 39};  
		
        System.out.println("Duplicate elements in given array: ");  
       
        for(int i = 0; i < arr.length; i++) {  
        	
            for(int j = i + 1; j < arr.length; j++) {  
            	
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  

	}
 }

}
}
