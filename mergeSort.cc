// MergeSort.cpp : 定义控制台应用程序的入口点。
//

#include<iostream>
using namespace std;
#include "mergeSort.h"

int main() 
{
  MergeSort<int> *mergeSort=new MergeSort<int>(29);
  mergeSort->data[0]=4;  
  mergeSort->data[1]=26; 
  mergeSort->data[2]=22; 
  mergeSort->data[3]=13; 
  mergeSort->data[4]=5;  
  mergeSort->data[5]=28;  
  mergeSort->data[6]=6;  
  mergeSort->data[7]=27;  
  mergeSort->data[8]=9;  
  mergeSort->data[9]=10;
  mergeSort->data[10]=19;
  mergeSort->data[11]=12;
  mergeSort->data[12]=20;
  mergeSort->data[13]=16;
  mergeSort->data[14]=11;
  mergeSort->data[15]=18;
  mergeSort->data[16]=24;
  mergeSort->data[17]=1; 
  mergeSort->data[18]=21;
  mergeSort->data[19]=17;
  mergeSort->data[20]=2; 
  mergeSort->data[21]=14;
  mergeSort->data[22]=23; 
  mergeSort->data[23]=15;
  mergeSort->data[24]=0;
  mergeSort->data[25]=8;
  mergeSort->data[26]=7;
  mergeSort->data[27]=3;
  mergeSort->data[28]=25;
  mergeSort->Sort();
  mergeSort->Print();
  return 0;
}
