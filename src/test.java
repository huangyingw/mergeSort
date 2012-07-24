public class test {
	static public void main(String[] args) {
		int[] data = { 1, 2, 3, 4 };
		MergeSort mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		data = new int[] { 4, 3, 2, 1 };
		mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		data = new int[] { 4, 3, 2, 1, 5 };
		mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		data = new int[] { 4, 3, 2, 8, 1, 5 };
		mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		data = new int[] { 9, 4, 3, 2, 8, 1, 5 };
		mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		data = new int[] { 9, 4, 3, 2, 8, 1, 5, 12 };
		mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

		data = new int[] { 9, 4, 3, 2, 8, 1, 5, 12, 3 };
		mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();

	}
}
