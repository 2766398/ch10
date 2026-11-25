public class Fraction{
	
	//instance variables
	private int numerator, denominator;
	
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
		int slash = a.indexOf("/");
		if(Integer.parseInt(a.substring(slash+1))!=0){
			denominator = Integer.parseInt(a.substring(slash+1));
		} else {
			denominator = 1;
			System.out.println("denominator cannot be 0");
		} 
		numerator = Integer.parseInt(a.substring(0,slash));
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	public double toDouble(){
		return (double) numerator/denominator;
	}
	
	public int numerator(){
		return numerator;
	}
	
	public int denominator(){
		return denominator;
	}
	
	public void setNum(int a){
		numerator = a;
	}
	
	public void setDenom(int a){
		denominator = a;
	}
	
	public void reduce(){
		int divisor = gcf(numerator, denominator);
		numerator = numerator/divisor;
		denominator = denominator/divisor;
	}
			
	public static Fraction multiply(Fraction a, Fraction b){
		int n = a.numerator()*b.numerator();
		int d = a.denominator()*b.denominator();
		Fraction temp = new Fraction(n, d);
		temp.reduce();
		return temp;
	}
	
	public static Fraction divide(Fraction a, Fraction b){
		int n = a.numerator()*b.denominator();
		int d = a.denominator()*b.numerator();
		Fraction temp = new Fraction(n, d);
		temp.reduce();
		return temp;
	}
	
	public static Fraction add(Fraction a, Fraction b){
		int ft = a.numerator*b.denominator+b.numerator*a.denominator;
		int fb = a.denominator*b.denominator;
		Fraction temp = new Fraction(ft, fb);
		temp.reduce();
		return temp;
	}
		
	public static Fraction subtract(Fraction a, Fraction b){
		int ft = a.numerator*b.denominator-b.numerator*a.denominator;
		int fb = a.denominator*b.denominator;
		Fraction temp = new Fraction(ft, fb);
		temp.reduce();
		return temp;
	}
	
	public static int gcf (int a, int b){
		while(a!=b){
			if(a>b){
				a=a-b;
			} else {
				b=b-a;
			}
		}
		return a;
	}
}
