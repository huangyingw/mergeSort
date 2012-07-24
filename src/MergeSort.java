class MergeSort {
	public int[] data;

	MergeSort(int[] data) {
		this.data = data;
	}

	void Initial() {

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

	public void mergeEffecient(int low, int mid, int high) {
		int left, index, right;
		int newArr[] = new int[high - low + 1];
		left = low;
		index = 0;
		right = mid + 1;

		while (left <= mid && right <= high) {
			if (data[left] <= data[right]) {
				newArr[index++] = data[left++];
			} else {
				newArr[index++] = data[right++];
			}
		}
		if (left > mid) {
			for (int k = right; k <= high; k++) {
				newArr[index++] = data[k];
			}
		} else {
			for (int k = left; k <= mid; k++) {
				newArr[index++] = data[k];
			}
		}
		index = 0;
		for (int k = low; k <= high; k++)
			data[k] = newArr[index++];
	}

	public void mergeSort() {
		// TODO Auto-generated method stub
		mergeSort(0, data.length - 1);
	}

	void mergeSort(int left, int right) {
		if (left < right) {
			int pivot = (left + right) / 2;
			mergeSort(left, pivot);
			mergeSort(pivot + 1, right);
			// mergeEffecient(left, pivot, right);
			mergeEffecient(left, pivot, right);
			// System.out.print("Now mergeSort," + left + "," + right + "->");
			// Print(left, right);

		}
	}

	int Partition(int left, int right) {
		return (left + right) / 2;
	}

	void Print() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ",");
		}
		System.out.println();
	}

	void Print(int l, int r) {
		for (int i = l; i <= r; i++) {
			System.out.print(data[i] + ",");
		}
		System.out.println();
	}
}
