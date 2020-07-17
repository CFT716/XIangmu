

public class Sort {

	public static void main(String[] args) {
		int[] A = { 10, 52, 4, 78, 85 };
		System.out.println("≈≈–Ú«∞:");
		for (int a : A) {
			System.out.print(a + " ");
		}
		int temp1;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					temp1 = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp1;
				}
			}
		}
		System.out.println();
		System.out.println("…˝–Ú≈≈–Ú∫Û:");
		for (int b : A) {
			System.out.print(b + " ");
		}
		for (int i = 0; i < A.length / 2; i++) {
			int t = A[i];
			A[i] = A[A.length - i - 1];
			A[A.length - i - 1] = t;
		}
		System.out.println();
		System.out.println("Ωµ–Ú≈≈–Ú∫Û:");
		for (int c : A) {
			System.out.print(c + " ");
		}

	}
}