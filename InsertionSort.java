public class InsertionSort implements SortingAlgorithm
{
	public void sort (int [] a)
	{
		int temp;

		for (int i = 1; i < a.length; i++)
    	{
        	int j = i - 1;
        	while (j >= 0 && a[j] > a[i] )
        	{
          	  temp = a[i];
          	  a[i] = a[j];
          	  a[j] = temp;
          	  i=j;
          	  j--;

        	}
    	}
	}
}