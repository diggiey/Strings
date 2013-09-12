public class array {
	
	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10, 11};
		// doubleIt(a);
		
		// sum(a);
		
		// largest(a);
		
		closest(a);

		// int[] data = new int[10];
		// int x = 10;

		// for (int i=0; i < data.length; i++) {
		// 	data[i] = x;
		// 	x--;
		// }

		// for (int i=0; i < data.length; i++) {
		// 	System.out.println(data[i]);
		// }

		// for loop that sets countdown from 10.

	}

	// Double every number in the array
	public static int[] doubleIt(int[] a) {
		for (int i=0; i < a.length; i++) {
			a[i] *= 2;
		}

		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		return a;

	}

	// sum of even, odd, and all
	// prints out sum of even indeces, odd i's, and all
	
	public static int[] sum(int[] a) {
		int evenAnswer = 0;
		int oddAnswer = 0;
		for (int i=0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenAnswer += a[i];
			} else {
				oddAnswer += a[i];
			}

		}
		System.out.println(evenAnswer);
		System.out.println(oddAnswer);
		System.out.println(evenAnswer + oddAnswer);

		return a;
	}

	// two largest elements
	// prints them out
	
	public static int[] largest(int[] a) {
		int answer = 0;
		int answer2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > answer) {
				answer = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > answer2 && a[i] < answer) {
				answer2 = a[i];
			}
		}
		System.out.println(answer);
		System.out.println(answer2);
		return a;
	}

	// closest to zero
	// return the index of the number closest to zero in the array
	
	public static int[] closest(int[] a) {
		int answer = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > answer) {
				answer = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < answer) {
				answer = a[i];
			}
		}

		System.out.println(answer);
		return a;
	}

	// smash
	// takes two arrays and returns a and b together as one array

	public static int[] smash(int[] a) {

	}

	public static void printArray(int[] a) {
		for (int i=0; i < a.length; i++) {
			System.out.print(a[i] + "");
		}
		System.out.println();
	}

}