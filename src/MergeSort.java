public class MergeSort {
	public int a[] = { 23, 342, 42, 83, 3288, 3288, 42, 6843, 424, 341, 83242 };

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

		merge_sort(1, a.length - 1);
		System.out.println();
		System.out.println("So, the sorted list (using MERGE SORT) will be :");
		System.out.println();
		System.out.println();

		for (i = 1; i <= a.length - 1; i++)
			System.out.print(a[i] + "    ");

	}

	public static void main(String[] args) {
		new MergeSort();
	}
}
