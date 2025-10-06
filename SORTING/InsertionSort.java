package SORTING;

public class InsertionSort {

    // Insertion Sort Method
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = current;
        } 
    }

    // Print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
