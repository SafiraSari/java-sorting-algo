public class SelectionSort {
    public static void main(String[] args) {

        /*
        With Selection Sort, on each traversal, we're selecting the largest element to move to the sorted partition.
        - Time Complexity O(n^2) - Quadratic
        - Unstable
        - In place
        - Much less swapping compared to bubble sort (only 1 swap/traversal)
         */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Printing Values
        System.out.println("BEFORE SORTING WITH SELECTION SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        // Selection Sort
        int largest = 0;
        for (int i = 0; i < intArray.length; i++){
            for (int j = 1; j < intArray.length - i; j++){
                if (intArray[j] > intArray[largest]){
                    largest = j;
                }
            }
            swap(intArray, largest, intArray.length - i - 1);
            largest = 0;
        }

        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH SELECTION SORT:");
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
