run : mergeSort.o
	g++ -o run mergeSort.o
mergeSort.o : mergeSort.cc mergeSort.h
	g++ -c mergeSort.cc 
clean :
	rm run mergeSort.o
