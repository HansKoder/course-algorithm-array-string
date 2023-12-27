package org.example.array2d;

public class SearchArray2D {

    /*+ Target = 2
    row 0 col 0 1
    row 0 col 1 3
    row 0 col 2 5
    row 1 col 0 10
    row 1 col 1 11
    row 1 col 2 16
     */
    public int [] getIndex (int[][] numbers, int target) {

        int currentPositionRow = 0; //
        int sizeOfColumn = numbers[0].length - 1; // 2

        boolean approximate = false;

        while (currentPositionRow < numbers.length) {
            int firstItem = numbers[currentPositionRow][0]; // 1
            int lastItem = numbers[currentPositionRow][sizeOfColumn]; // 5

            // 1 == 2 || 5 == 2
            if (firstItem == target || lastItem == target) {
                return new int[] {currentPositionRow, firstItem == target ? 0: sizeOfColumn};
            } else if (target > firstItem && target < lastItem) { // 2 > 1 && 2 < 5
                approximate = true;
                break;
            } else {
                currentPositionRow++; // 1
            }
        }

        if (!approximate) return new int[] {-1};

        int low = 0;
        int high = sizeOfColumn; // 0
        int half;

        // 0 <= -1 exit of loop
        while (low <= high) {
            // 0 + (0 - 0) / 2 = 0
            half = low + (high - low) / 2; // 0

            // 1 == 2
            if (numbers[currentPositionRow][half] == target) return new int[] {currentPositionRow, half};

            // 1 < 2
            if (numbers[currentPositionRow][half] < target) {
                low = half+1;
            } else {
                high = half -1; // high = -1
            }
        }

        return new int[] {-1}; // return this.
    }

}
