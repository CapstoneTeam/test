package test666666;

import java.util.Arrays;

public class test {
	public static void main(String args[]) {
		test t = new test();
		int A[] = { 20, 30, 10, 90, 40,100,1 };
		System.out.println(Arrays.toString(A));
		t.bubblesort(A);
		System.out.println(Arrays.toString(A));

	}

	public void bubblesort(int[] A) {
		boolean swapped;
		int n = A.length;
		int i;
		do {
			swapped = false;
			for (i = 1; i <= n - 1; i++) {
				if (A[i - 1] > A[i]) {
					int temp;
					temp=A[i];
					A[i]=A[i-1];
					A[i-1]=temp;
					swapped=true;
				}
			}
			System.out.println(Arrays.toString(A));

		} while (swapped);

	}

	
}
