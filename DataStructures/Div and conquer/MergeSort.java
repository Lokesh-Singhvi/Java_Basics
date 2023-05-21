/*merge sort
public class MergeSort {
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);// left part
        MergeSort(arr, mid + 1, ei);// rigt part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1;// iterator for rigt part
        int k = 0;// iterator for temp arr
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part me agar someting remian
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part k liye
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for(k=0,i=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        MergeSort(arr, 0, arr.length - 1);
    }
}*/
//QUICK SORT

/*public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei);
        QuickSort(arr, si, pidx - 1);// left
        QuickSort(arr, pidx + 1, ei);// rigt
    }

    public static int partition(int arr[], int si, int ei) {
        int x = arr[ei];
        int i = si - 1; // jage banana un elements k liye jo pivot se small
        for (int j = si; j < ei; j++) {
            if (arr[j] <= x) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = x;
        arr[ei] = arr[i];// pivot=arr[i]
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        QuickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}*/
//practice ques 1
public class MergeSort {
    public static void PrintArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort(String arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid);// left part
        MergeSort(arr, mid + 1, ei);// rigt part
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from left subarray, if any
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // Copy remaining elements from right subarray, if any
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // Copy elements from temp array back to original array
        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
    }

    

    public static void main(String args[]) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        MergeSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }
}