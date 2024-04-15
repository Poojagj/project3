package ArrayPrograms;

import java.util.Scanner;

public class copyArray {

	public static void main(String[] args) {
		
		int a[]= new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in original array");
		
		for(int i=0;i<a.length;i++){
			
			a[i]=sc.nextInt();
		}
		
		System.out.println("Original array elements are:");
		
		for(int i = 0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
		}
		
		int b[] = new int[a.length];
		
		for(int i =0 ; i< b.length;i++){
			
			b[i]=a[i];
		}
		
		System.out.println("\nCopied Array elements are:");

		for(int i = 0;i<b.length;i++){
			
			System.out.print(b[i]+" ");
		}
		
		
		

	}

}
