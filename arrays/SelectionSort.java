package arrays;

public class SelectionSort {

	public static void main(String[] args)
	{
		int a[] = {5,2,-1,6,3};
		int n = a.length;
		
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			for(int j=i; j<n; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			int temp =a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
		
		for(int item: a)
		{
			System.out.print(item+ " ");
		}
		
	}

}
