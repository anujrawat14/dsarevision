
// Merge Sort using Extra Space
//TC=O(nlogn) SC=o(n)

import java.util.Arrays;

class Main {

    static int[] mergeSort(int arr[]) {

        // Base condition: array with 0 or 1 element is already sorted
        if (arr.length <= 1) {
            return arr;
        }

        // Find the middle index to divide the array
        int mid = arr.length / 2;

        // Divide the array into two halves and sort them recursively
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge both sorted halves
        return merge(left, right);
    }

    static int[] merge(int first[], int second[]) {

        int i = 0;  // Pointer for first array
        int j = 0;  // Pointer for second array
        int k = 0;  // Pointer for new sorted array

        // Create a new array to store the merged sorted elements
        int newArr[] = new int[first.length + second.length];

        // Compare elements of both arrays and add the smaller element
        while (i < first.length && j < second.length) {

            if (first[i] <= second[j]) {
                newArr[k] = first[i];
                i++;
            } else {
                newArr[k] = second[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from the first array
        while (i < first.length) {
            newArr[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements from the second array
        while (j < second.length) {
            newArr[k] = second[j];
            j++;
            k++;
        }

        // Return the merged sorted array
        return newArr;
    }

    public static void main(String[] args) {

        int arr[] = {5, 1, 3, 2};

        // Sort the array using Merge Sort
        arr = mergeSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

