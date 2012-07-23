import java.util.Scanner;

public class MergeSort {
	public int a[] = new int[50];

	public void merge_sort(int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			merge_sort(low, mid);
			merge_sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	public void merge(int low, int mid, int high) {
		int h, i, j, k;
		int b[] = new int[50];
		h = low;
		i = low;
		j = mid + 1;

		while ((h <= mid) && (j <= high)) {
			if (a[h] <= a[j]) {
				b[i] = a[h];
				h++;
			} else {
				b[i] = a[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				b[i] = a[k];
				i++;
			}
		} else {
			for (k = h; k <= mid; k++) {
				b[i] = a[k];
				i++;
			}
		}
		for (k = low; k <= high; k++)
			a[k] = b[k];
	}

	public MergeSort() {
		int num, i;

		System.out.println("             MERGE SORT PROGRAM            ");

		System.out.println();
		System.out.println();
		System.out
				.println("Please Enter THE No. OF ELEMENTS you want to sort[THEN PRESS ENTER]:");
		num = new Scanner(System.in).nextInt();
		System.out.println();
		System.out.println("Now, Please Enter the (" + num
				+ ") nos. [THEN PRESS ENTER]:");
		for (i = 1; i <= num; i++) {
			a[i] = new Scanner(System.in).nextInt();
		}
		merge_sort(1, num);
		System.out.println();
		System.out.println("So, the sorted list (using MERGE SORT) will be :");
		System.out.println();
		System.out.println();

		for (i = 1; i <= num; i++)
			System.out.print(a[i] + "    ");

	}

	public static void main(String[] args) {
		new MergeSort();
	}
}
