/**
 * Created by warrior on 5/16/2016.
 */
public class QuickSortSample {
    static int partition(int arr[], int left, int right)
    {
        int i = left, j = right, tmp;
        for (int x = left;x <= right; x++) {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
        int pivot = arr[(left + right) / 2];
//        int pivot = arr[left];
        System.out.println("pivot "+pivot+ " "+ (left+right)/2);
        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            System.out.println("i "+ i+ "j "+ j);
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
                for (int x: arr) {
                    System.out.print(x+" ");
                }
                System.out.println("swap");
            }

        }
        System.out.println("i "+ i);
        System.out.println("j "+ j);
        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
       /* for (int x: arr) {
            System.out.print(x+" ");
        }*/
        System.out.println("left "+ left+ "index "+ index );
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    public static void main(String[] args) {
        int[] array = {9,3,8,6,7,5,2};
//        int[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};
        quickSort(array,0,6);
        for (int y: array) {
            System.out.print(y+" ");
        }
    }
}
