public class CountingSort {
    public static void main(String[] args) {

        /*
        With Counting Sort, it counts the number of occurrences of each value without using comparisons.
        Limitations: Values need to be discrete & non-negative (no floats/strings), and within a specific range.
        - Time Complexity: O(n) since we are making assumptions about the data
        - Not in-place
         */

        // Values between 1-10 inclusively --> counting array of length 10
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        // Printing Values
        System.out.println("BEFORE SORTING WITH COUNTING SORT:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        // Counting Sort
        int[] countArray = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++){
            countArray[intArray[i] - 1]++;
        }

        // Printing Values
        System.out.println("\n\nCOUNTING ARRAY:");
        for (int i = 0; i < countArray.length; i++) {
            System.out.print(countArray[i] + " ");
        }

        // With counting array, rewrite numbers
        int j = 0;
        for (int i = 0; i< countArray.length; i++){
            while (countArray[i] > 0){
                intArray[j++] = i + 1;
                countArray[i]--;
            }
        }


        // Printing Values
        System.out.println("\n\nAFTER SORTING WITH COUNTING SORT:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }

}
