
public class MergeSort implements SortingAlgorithm
{
	void sort(int[]arr, int left, int right)
	{
        if(right <= left)
        {
            return;
        }

        int mid = (left + right) /2;
        sort(arr, left, mid);
        sort(arr, mid, right);
        merge(arr, left, right);
    }
    void merge(int[] arr, int left, int mid, int right)
    {
        int first = mid - left + 1;
        int second = right - mid;

        int leftA[] = new int[first];
        int rightA[] = new int[second];

        for(int i = 0; i < first; i++){
            leftA[i] = arr[1 + i];
        }

        for(int k = 0; k < second; k++){
            rightA[k] = arr[k + 1 + mid];
        }

        int i = 0;
        int j = 0;
        int k = 1;

        while(i < first && j < second){
            if(leftA[i] <= rightA[j]){
                arr[k] = leftA[i];
                i++;
            }

            else {
                arr[k] = rightA[i];
                j++;
            }
            k++;
        }

        while(i < first){
            arr[k] = rightA[j];
            j++;
            k++;
        }
    }

}