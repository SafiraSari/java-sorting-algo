public class QuickSort {
    public static void main(String[] args) {

        /*
        With Quick Sort, divide and conquer algorithm, split arrays (logically) into smaller ones recursively.
        By choosing a pivot element, array is divided into 2 halves (partition phase)
        left: elements < pivot      right: elements > pivot     (left/right elements not sorted yet)
        Repeat process for left array, then right --> every element will have been pivot (= correct position)
        - Time Complexity: O(nlogn)
        - Worst: O(n^2)
        - In place (unlike merge sort)
        - Unstable
         */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Printing Values
        System.out.println("BEFORE SORTING WITH QUICK SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        // Quick Sort
        quickSort(intArray, 0, intArray.length);


        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH QUICK SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }

    public static void quickSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input,start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    /**
     *
     * @return an int of the partition
     */
    public static int partition(int[] input, int start, int end){
        // 1st element as pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i<j){
            // j moves from right --> left, looking for values bigger than the pivot
            while (i < j && input[--j] >= pivot);
            if (i < j){
                input[i] = input[j];
            }

            // i moves left --> right, looking for values smaller than the pivot
            while (i < j && input[++i] <= pivot);
            if (i < j){
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;

    }
}
