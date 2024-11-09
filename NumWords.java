// Prints a given number using a hundreds, tens, and units notation.
// java NumWords.java 365
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int hun, tens, ones;
		ones = num % 10;
		tens = (num % 100) / 10;
		hun = num/100;
		System.out.println(hun + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}


	}

