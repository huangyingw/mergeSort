template <class Type> class MergeSort
{
private:
	int length;

public:
	Type* data;
	MergeSort<Type>(int len);
	void Initial();
	void Sort();
	void Merge(int l,int m,int r);
	void Print(int l,int r);
	void Divide(int len);//将数据按长度len分组合并
	void Print();
};

template <class Type> MergeSort<Type>::MergeSort(int len)
{
	length=len;
	data=new Type[length];
}

template <class Type> void MergeSort<Type>::Initial()
{

}

template <class Type> void MergeSort<Type>::Print()
{
	for(int i=0;i<length;i++)
	{
		cout<<data[i]<<",";
	}
	cout<<endl;
}

template <class Type> void MergeSort<Type>::Print(int l,int r)
{
	for(int i=l;i<=r;i++)
	{
		cout<<data[i]<<",";
	}
	cout<<endl;
}

template <class Type> void MergeSort<Type>::Merge(int l,int m,int r)
{
	Type* R1=new Type[r-l+1];
	int index=0;
	int i=l;
	int j=m+1;
	while(i<=m&&j<=r)
	{
		R1[index++]=(data[i]<data[j])?data[i++]:data[j++];
	}
	while(i<=m)
	{
		R1[index++]=data[i++];
	}
	while(j<=r)
	{
		R1[index++]=data[j++];
	}
	for(int count=0,i=l;count<index;count++,i++)
	{
		data[i]=R1[count];
	}
}

template <class Type> void MergeSort<Type>::Divide(int len)//将数据按长度len分组合并
{
	for(int i=1;i<length;i=i+2*len)
	{
		if(i+2*len-1<length)
		{
			Merge(i,i+len-1,i+2*len-1);
		}
		else
		{
			Merge(i,i+len-1,length-1);
		}
	}
}

template <class Type> void MergeSort<Type>::Sort()
{
	int i;
	for(i=1;length>2*i;i=2*i)
	{
		//将数据按长度i分组
		Divide(i);
	}
	Merge(0,i,length-1);
}
