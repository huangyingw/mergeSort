mergeSort.exe : mergeSort.o
	g++ -o mergeSort.exe mergeSort.o
mergeSort.o : mergeSort.cc mergeSort.h
	g++ -c mergeSort.cc 
clean :
	rm mergeSort.exe mergeSort.o
