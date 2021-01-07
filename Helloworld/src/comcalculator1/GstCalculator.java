package comcalculator1;

class GstCalculator
{
	 static double add(double value,double per) {
		double result= value+(value*(per/100));
		return result;
	}
	
	static double sub(double value,double per) {
		double a=100+per;
		double result= ((value*(100/a)));
		return result;
	}
	
	
}
