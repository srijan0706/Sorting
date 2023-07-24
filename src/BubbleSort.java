import java.io.*;
public class BubbleSort {
	static void bsort(int arr[], int n)
    {
        int i, j, temp;
        boolean s;
        for (i = 0; i < n - 1; i++) {
            s = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    s = true;
                }
            }
            if (s == false)
                break;
        }
    }
	 static void printArray(int arr[], int size)
	    {
	        int i;
	        for (i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bsort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
	}

}
