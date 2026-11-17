public class Fraction{
	
	//instance variables
	int numerator, denominator;
	
	//constructor
	public Fraction (){ //default
		numerator = 1;
		denominator = 1;
	}

	public Fraction (int n, int d){ //default
		if(d!=0){
			denominator = d;
		} else {
			denominator = 1;
			System.out.println("denominator cannot be 0");
		} 
		numerator = n;
	}
}
