public class MergeSort {
    public static void main(String[] args) {

        /*
        With Merge Sort, divide and conquer algorithm, split arrays (logically) into smaller ones recursively.
        Splitting Phase: divide array into 2, left and right array. Keep splitting until 1 element/array.
        Merging Phase: Merge pairs(siblings) of arrays sorted --> many 2 element/array, until 1 big sorted array.
        - Time Complexity: O(nlogn)
        - Not in-place (uses temporary arrays for merging phase)
        - Stable
         */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Printing Values
        System.out.println("BEFORE SORTING WITH MERGE SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        // Merge Sort
        mergeSort(intArray, 0, intArray.length);


        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH MERGE SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }

    public static void mergeSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }
        int mid = (start + end) >> 1;           // partition

        mergeSort(input, 0, mid);          // left side
        mergeSort(input, mid, end);             // right side
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end){
        if (input[mid - 1] <= input[mid]) {     // merging sorted array
            return;
        }

        int i = start;  // 0
        int j = mid;    // 7
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while (i < mid && j < end){         // drop out of loop when left array passes mid, or right passes end
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }


        System.arraycopy(input, i, input, start + tempIndex, mid - i);  // only handles left array
        System.arraycopy(temp, 0, input, start, tempIndex);

    }

}
