public class test {
	static public void main(String[] args) {
		int[] data = { 4, 26, 22, 13, 5, 28, 6, 27, 9, 10, 19, 12, 20, 16, 11,
				18, 24, 1, 21, 17, 2, 14, 23, 15, 0, 8, 7, 3, 25 };
		MergeSort mergeSort = new MergeSort(data);
		mergeSort.mergeSort();
		mergeSort.Print();
	}
}
