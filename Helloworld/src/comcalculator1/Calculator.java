package comcalculator1;

public class Calculator extends CalculatorOperation{  
	
	public static void Normalcalculator(double A,double B,int c) {
		
		switch(c) {
		case 1: System.out.println(add(A,B));
		          break;
		case 2: System.out.println(sub(A,B));
        		  break; 
		case 3: System.out.println(mul(A,B));
        		  break; 
		case 4: System.out.println(div(A,B));
        		  break; 
		case 5: System.out.println(mod((int)A,(int)B));
        		  break; 
		          
		}
		
	}
	
}
