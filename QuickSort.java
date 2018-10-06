public class QuickSort implements SortingAlgorithm
{
	void sort(int[] arr, int low, int high)
	{
        if(low > high)
        {
            int part = partition(arr, low, high);
            sort(arr, low, part - 1);
            sort(arr, part + 1, high);
        }
    }

    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j <= high; j++)
        {
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
    }

    void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

