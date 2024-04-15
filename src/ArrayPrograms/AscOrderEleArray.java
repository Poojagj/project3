package ArrayPrograms;

public class AscOrderEleArray {

	public static void main(String[] args) {
		AscOrderEleArray asc = new AscOrderEleArray();
		asc.method1();
		asc.method2();
	
		}
	
	void method1(){
		
		int a[] = { 5 , 7 ,23, 6 , 8 ,99, 56};
		
		int temp;
		
		for(int i =0 ; i<a.length;i++){
			
			for(int j =i+1 ; j<a.length;j++){
			
			if(a[i]>a[j]){
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		System.out.print("Ascending Order ie elements of Array is : ");
			for(int i = 0;i<a.length;i++){
				
				System.out.print(a[i]+" ");
			}
			
		
	}
	
	void method2(){
       int a[] = { 5 , 7 ,23, 6 , 8 ,99, 56};
		
		int temp;
		
		
		for(int i =0 ; i<a.length;i++){
			
			for(int j =i+1 ; j<a.length;j++){
			
			if(a[i]<a[j]){
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		
		System.out.print("\nDescending Order ie elements of Array is : ");
			for(int i = 0;i<a.length;i++){
				
				System.out.print(a[i]+" ");
			}
	}

	}


