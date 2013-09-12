import java.util.Random;

public class mean {
	private static Random r = new Random(5345);

	public static void main(String[] args) {
		int[] randomArray = makeRandom(1000, 100);
		System.out.print("The average of the array is ");
		System.out.println(mean(randomArray) + ".");

		System.out.print("The average from index 40 to index 45 is ");
		System.out.println(meanofRange(randomArray, 40, 45) + ".");
	}

	public static double mean(int[] a) {
		int meanSubtotal = 0;
		int mean = 0;
		for (int i=0; i<a.length; i++) {
			meanSubtotal = a[i] + meanSubtotal;
		}
		mean = meanSubtotal / a.length;

		return mean;
	}

	public static double meanofRange(int[] a, int start, int end) {
		double total = 0.0;
		for (int i = start; i <= end; i++) {
			total += a[i];
		}

		return total / (end - start + 1);
	}

	public static int[] makeRandom(int size, int range) {
		int[] a = new int [size];

		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(range+1);
		}

		return a;
	}
}