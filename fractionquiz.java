import java.util.Scanner;
import java.util.Random;

public class FractionDriver {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		boolean quit = false;
		int total = 0;
		int q = 0;
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!" + "\n");
		while(!(quit)){
			total += questionNcheck();
			q++;
		}
		Fraction lol = new Fraction(total,q);
		System.out.println("You answered " + lol.toString() + " correctly, for a score of " + toIntdiv(lol) + " percent!");
	}

	public static int questionNcheck(){
		int val = 0;
		String[] s = {" + ", " - ", " / ", " * "};
		int index = random.nextInt(s.length);
		String type = s[index];
		Fraction one = new Fraction();
		Fraction two = new Fraction();
		Fraction[] ans = {Fraction.add(one,two), Fraction.subtract(one,two), Fraction.divide(one,two), Fraction.multiply(one,two)};
		Fraction answ = ans[index];
		System.out.print(one.toString() + type + two.toString() + " = ");
		String a = in.nextLine();
		System.out.print("\n");
		Fraction ar = new Fraction(a);
		if(ar.equals(answ)){
			System.out.println("Correct!");
			val++;
		} else { 
			System.out.println("Wrong, the answer was " + answ.toString());
		}
		System.out.print("\n");
		return val;
	}
}
