/**
 * Created by warrior on 5/22/2016.
 */
public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int i = 0, j = 0, k = 0;
        int mergelist[] = new int[array1.length + array2.length];
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergelist[k] = array1[i];
                k++;
                i++;
            } else {
                mergelist[k] = array2[j];
                k++;
                j++;
            }
        }
        while (i < array1.length) {
            mergelist[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            mergelist[k] = array2[j];
            j++;
            k++;
        }
        return mergelist;
    }

    public static int[] mergeRecursive(int[] inputArray, int pivot) {
        int[] output = inputArray;
        if (inputArray.length < 2)
            return output;
        pivot = inputArray.length / 2;
        System.out.println("arr1 " + pivot);
        System.out.println("arr2 " + (inputArray.length - pivot));
        int arr1[] = new int[pivot], arr2[] = new int[inputArray.length - pivot];
        for (int i = 0; i < pivot; i++) {
            arr1[i] = inputArray[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = inputArray[j + pivot];
        }
        arr1 = mergeRecursive(arr1, pivot);
        arr2 = mergeRecursive(arr2, arr2.length);
        printArray(arr1);
        printArray(arr2);
        output = merge(arr1, arr2);
        System.out.println("merge");
        printArray(output);
        return output;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {38, 27, 43, 3, 9, 82, 10};
        int arr[] = {38}, arr2[] = {27, 43};
        int output[];
        output = mergeRecursive(arr1, 7);
//        output = merge(arr, arr2);
        for (int x : output) {
            System.out.print(x + " ");
        }
    }
}
