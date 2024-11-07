// Generates three integer random numbers in a given range,
// and prints them in increasing order.
// random * limit - keeps it's proportions
public class Ascend {
	public static void main(String[] args) {
		double lim = Integer.parseInt(args[0]);
		int n1 = (int) (Math.random() * lim);
		int n2 = (int) (Math.random() * lim);
		int n3 = (int) (Math.random() * lim);
		int min = Math.min(n1, Math.min(n2, n3));
        int max = Math.max(n1, Math.max(n2, n3));
        int mid = n1 + n2 + n3 - min - max;
		System.out.println(min + " " + mid + " " + max);


	}
}
// java Ascend.java 13

