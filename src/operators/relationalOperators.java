package operators;

public class relationalOperators {

	public static void main(String[] args) {
		
		
        int var1 = 5;
        int var2 = 10;
        int var3 = 5;
      
        //== operator
        System.out.println("var1 == var2: " + (var1 == var2));//f
        System.out.println("var1 == var3: " + (var1 == var3));//t
        
        // > operator
        System.out.println("var1 > var2: " + (var1 > var2));//f
        System.out.println("var3 > var1: " + (var3 > var1));//f
        
        // < operator
        System.out.println("var1 < var2: " + (var1 < var2));//t
        System.out.println("var2 < var3: " + (var2 < var3));//f
        
        // >=/<= operator
        System.out.println("var1 >= var2: " + (var1 >= var2));//5>=10 //f
        System.out.println("var2 >= var3: " + (var2 >= var3));// 10>=5 //t
        
        System.out.println("var1 <= var2: " + (var1 <= var2));//5<=10 //t
        System.out.println("var2 <= var3: " + (var2 <= var3));// 10<=5 //f
        
        //!= Operator
        System.out.println("var1 != var2: "+ (var1 != var2)); //5!=10 //t
        System.out.println("var1 != var3: "+ (var1 != var3)); // 5!=5 // f
        
    }
    
        



}
