public class MergeSort {
	public static void main(String[] args) {
		new MergeSort();
	}

	public int data[] = { 10, 9, 8, 7, 6, 5, 8, 4, 3, 2, 1 };

	public MergeSort() {
		merge_sort(0, data.length - 1);
		for (int i = 0; i <= data.length - 1; i++)
			System.out.print(data[i] + ",");
	}

	public void merge(int low, int mid, int high) {
		int h, i, j, k;
		int b[] = new int[50];
		h = low;
		i = low;
		j = mid + 1;

		while ((h <= mid) && (j <= high)) {
			if (data[h] <= data[j]) {
				b[i] = data[h];
				h++;
			} else {
				b[i] = data[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				b[i] = data[k];
				i++;
			}
		} else {
			for (k = h; k <= mid; k++) {
				b[i] = data[k];
				i++;
			}
		}
		for (k = low; k <= high; k++)
			data[k] = b[k];
	}

	public void merge_sort(int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			merge_sort(low, mid);
			merge_sort(mid + 1, high);
			merge(low, mid, high);
		}
	}
}
