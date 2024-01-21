public class InsertionSort {
    public static void main(String[] args) {

        /*
        With Insertion Sort, we search for the insertion position. Left to right, we traverse the array and insert
        unsorted numbers at the correct position.
        - Time Complexity: O(n^2) - quadratic
        - In-place
        - Stable
         */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Printing Values
        System.out.println("BEFORE SORTING WITH INSERTION SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        // Insertion Sort
        for (int i = 1; i < intArray.length; i++){
            int current = intArray[i];
            int j = i - 1;                              // References previous number in array

            while (j >= 0 && intArray[j] > current) {   // Stop when start is reached, or find bigger num

                //swap(intArray, j+1, j);
                j--;                                    // working towards beginning of array
            }
            intArray[j+1] = current;
        }


        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH INSERTION SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }

    /**
     * Method that swaps the values of 2 elements in an array
     * @param array Array of Int
     * @param i     Index 1
     * @param j     Index 2
     */
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
