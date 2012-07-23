class MergeSort {
	private int[] data;

	MergeSort(int[] data) {
		this.data = data;
	}

	void Initial() {

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

	void Merge(int l, int m, int r) {
		int index = 0;
		int i = l;
		int j = m + 1;
		while (i <= m && j <= r) {
			data[index++] = (data[i] < data[j]) ? data[i++] : data[j++];
		}
		while (i <= m) {
			data[index++] = data[i++];
		}
		while (j <= r) {
			data[index++] = data[j++];
		}
		int count = 0;
		for (i = l; count < index; count++, i++) {
			data[i] = data[count];
		}
	}

	void Divide(int len) {
		for (int i = 1; i < data.length; i = i + 2 * len) {
			if (i + 2 * len - 1 < data.length) {
				Merge(i, i + len - 1, i + 2 * len - 1);
			} else {
				Merge(i, i + len - 1, data.length - 1);
			}
		}
	}

	void Sort() {
		int unit;
		for (unit = 1; data.length > 2 * unit; unit *= 2) {
			Divide(unit);
		}
		Merge(0, unit, data.length - 1);
	}
}
