public class ShellSort {
    public static void main(String[] args) {

        /*
        With Shell Sort, it is a variation of Insertion Sort. If the sequence of values is almost sorted, then
        insertion sort runs in almost linear time --> less shifting.
        Shell sort with a gap value larger than 1, than reducing it until it is 1 (then becomes an insertion sort).
        The gap (interval) determined can affect the time complexity.
        - Time Complexity: Worst is O(n^2), but can be better
        - In place
        - Unstable (vs Insertion Sort being stable)
        - Requires LESS shifting as insertion sort, so (usually) performs better
         */

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // 1st interval: 7/2 = gap of 3
        // 2nd interval: 3/2 = gap of 1

        // Printing Values
        System.out.println("BEFORE SORTING WITH SHELL SORT:");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        // Shell Sort

        for (int gap = intArray.length >> 1; gap > 0; gap /= 2){

            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }


        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH SHELL SORT:");
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
