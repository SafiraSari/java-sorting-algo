public class BubbleSort {
    public static void main(String[] args) {

        /*
        With Bubble Sort, the larger elements "bubble" to the top (right of the array)
        - Time Complexity: O(n^2) - quadratic
        - Stable
        - In place
         */

        // Printing Values
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("BEFORE SORTING WITH BUBBLE SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        // Bubble Sort
        for (int i = 0; i < intArray.length; i++){
            for (int j = 1; j < intArray.length - i; j++){
                if (intArray[i] > intArray[j]){
                    swap(intArray, i, j);
                }
            }
        }

        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH BUBBLE SORT:");
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
