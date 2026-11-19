public class Fraction{
	
	//instance variables
	int numerator, denominator;
	
	//constructor
	public Fraction (){ //default
		numerator = 1;
		denominator = 1;
	}

	public Fraction (int n, int d){ //parameterized
		if(d!=0){
			denominator = d;
		} else {
			denominator = 1;
			System.out.println("denominator cannot be 0");
		} 
		numerator = n;
	}
	
	public Fraction (String a){ //default
		if(Integer.parseInt(a.substring(a.indexOf("/")))!=0){
			denominator = Integer.parseInt(a.substring(a.indexOf("/")));
		} else {
			denominator = 1;
			System.out.println("denominator cannot be 0");
		} 
		numerator = Integer.parseInt(a.substring(0,a.indexOf("/")));
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	public int numerator(){
		return numerator;
	}
	
	public int denominator(){
		return numerator;
	}
		
	public static Fraction mult (Fraction a, Fraction b){
		int n = a.numerator()*b.numerator();
		int d = a.denominator()*b.denominator();
		return new Fraction(n,d); 
	}
	
	public static Fraction divide (Fraction a, Fraction b){
		int n = a.numerator()*b.denominator();
		int d = a.denominator()*b.numerator();
		return new Fraction(n,d);
	}
	
	public static Fraction gcf (int a, int b){
		while(a!=b){
			if(a>b){
				a=a-b;
			} else {
				b=b-a;
			}
		}
		return a;
	
}
			
			

