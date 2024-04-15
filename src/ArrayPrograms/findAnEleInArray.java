package ArrayPrograms;

import java.util.Scanner;

public class findAnEleInArray {

	public static void main(String[] args) {
		
		int a[] = {10 , 20 ,30 ,40 ,50 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search");
		
		int n = sc.nextInt();
		int count =0;
		
		for(int i=0; i<a.length;i++){
			
			if(a[i]==n){
				
				count++;
			}
		}
		
		if(count>0){
			
			System.out.println("ele : " +n +" found");
		}else{
			
			System.out.println("ele : " +n +" not found");
		}

	}

}
