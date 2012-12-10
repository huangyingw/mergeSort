public class test {
	static public void main(String[] args) {
		int[] data = { 1 };
		MergeSort mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 2, 1 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 3, 2, 1 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 4, 3, 2, 1 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 4, 3, 2, 1, 5 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 4, 3, 2, 8, 1, 5 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 9, 4, 3, 2, 8, 1, 5 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 9, 4, 3, 2, 8, 1, 5, 12 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 9, 4, 3, 2, 8, 1, 5, 12, 3 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 9, 9, 4, 3, 2, 8, 1, 5, 12, 3 };
		mergeSort.mergeSort();
		mergeSort.Print();

		mergeSort.data = new int[] { 9, 9, 9, 9, 9, 9 };
		mergeSort.mergeSort();
		mergeSort.Print();
	}
}
