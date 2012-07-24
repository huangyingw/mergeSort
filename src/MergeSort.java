class MergeSort {
	private int[] data;

	MergeSort(int[] data) {
		this.data = data;
	}

	void Initial() {

	}

	private void merge(int left, int pivot, int right) {
		// TODO Auto-generated method stub
		int index = 0;
		int i = left;
		int j = pivot + 1;
		while (i <= pivot && j <= right) {
			data[index++] = (data[i] < data[j]) ? data[i++] : data[j++];
		}
		while (i <= pivot) {
			data[index++] = data[i++];
		}
		while (j <= right) {
			data[index++] = data[j++];
		}
		int count = 0;
		for (i = left; count < index; count++, i++) {
			data[i] = data[count];
		}
	}

	public void mergeEffecient(int low, int mid, int high) {
		int left, index, right;
		int newArr[] = new int[high - low + 1];
		left = low;
		index = 0;
		right = mid + 1;

		while (left <= mid && right <= high && index < newArr.length) {
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
			for (int k = left; k <= mid && index < newArr.length; k++) {
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
			mergeEffecient(left, pivot, right);
			System.out.print("Now mergeSort," + left + "," + right + "->");
			Print(left, right);

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
