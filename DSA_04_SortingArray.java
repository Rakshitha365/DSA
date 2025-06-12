import java.util.*;

public class DSA_04_SortingArray {
    public static void main(String[] args) {
        int[] arr1 = {13,46,24,52,20,9};
        int[] arr2 = {13,46,24,52,20,9};
        int[] arr3 = {13,46,24,52,20,9};
        System.out.println("original array: " + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println("selection sort: " + Arrays.toString(arr1));
        bubbleSort(arr2);
        System.out.println("bubble sort: " + Arrays.toString(arr2));
        insertionSort(arr3);
        System.out.println("insertion sort: " + Arrays.toString(arr3));
        
        int[] mergeArray = {3,1,2,4,1,5,2,6,4};
        System.out.println("original array: " + Arrays.toString(mergeArray));
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        System.out.println("merge sort: " + Arrays.toString(mergeArray));
        
        
        int[] quickArray = {4,6,2,5,7,9,1,3};
        System.out.println("original array: " + Arrays.toString(quickArray));
        quickSort(quickArray,0,quickArray.length - 1);
        System.out.println("quick sort: " + Arrays.toString(quickArray));


    }

    // take min in unsorted array
    // swap min and first ele in array
    // time complexity : O(n^2) in all cases
    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                if(arr[j] < arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    // push the max to last by adjacent swaps
    // time complexity : O(n^2) in worst and average cases
    // O(n) in best cases ---> sorted array as input
    public static void bubbleSort(int[] arr)
    {
        for(int i = arr.length - 1; i > 0; i--)
        {
            int didSwap = 0;
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
        }
    }

    // takes element and places it at correct position
    // time complexity : O(n^2) in worst and average cases
    // O(n) in best cases ---> sorted array as input
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
    }

    // merge sort : divide & merge
    // time complxity : O(N * log2 N)
    // time complexity : mergeSort --> O(log2 N)
    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low == high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }

    // time complexity : merge --> O(N) in worst case
    // space complexity : merge --> O(N) in worst case
    public static void merge(int[] arr, int low, int mid, int high)
    {
        int[] res = new int[high+1];
        int left = low;
        int right = mid+1;
        int i = 0;
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                res[i] = arr[left];
                left++;
            }
            else
            {
                res[i] = arr[right];
                right++;
            }
            i++;
        }
        while(left <= mid)
        {
            res[i] = arr[left];
            left++;
            i++;
        }
        while(right <= high)
        {
            res[i] = arr[right];
            right++;
            i++;
        }

        for(int j = low; j <= high; j++)
        {
            arr[j] = res[j-low];
        }
    }


    // Divide and Conquer method
    // pick pivot 
    // options : 1. 1st element     2. last element     3. median element       4. random element 
    // time complexity :  O(N * log N)
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low >= high) return;
        int partition = getPartition(arr,low,high);
        quickSort(arr, low, partition-1);
        quickSort(arr, partition+1, high);
    }

    public static int getPartition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j)
        {
            while(arr[i] >= pivot && i <= high)
            {
                i++;
            }
            while(arr[j] < pivot && j >= low)
            {
                j--;
            }
            if(i < j)
            {
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
