package comcalculator1;

abstract class CalculatorOperation {
	 public static double add(double num1,double num2) {
			double result=num1+num2;
			return result;
		}
	public static double sub(double num1,double num2) {
		double result=num1-num2;
		return result;
	}
	public static double mul(double num1,double num2) {
		double result=num1*num2;
		return result;
	}
	public static double div(double num1,double num2) {
		double result=num1/num2;
		return result;
	}
	public static double mod(int num1,int num2) {
		double result=(double)(num1*(float)((float)num2/100));
		return result;
	}
	
}

