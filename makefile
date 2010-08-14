run : MergeSort.o
	g++ -o run MergeSort.o
MergeSort.o : MergeSort.cpp MergeSort.h
	g++ -c MergeSort.cpp
clean :
	rm run MergeSort.o
