package org.example.searchRotated;

public class SearchRotated {

    // (3,4,0,1) k=1
    // 1 --> low=0 high=3 half=1 value=4 updated positions low=2 high=3
    // 2 --> low=2 high=3 half=2 value=4 updated positions low=3 high=3
    // 3 --> low=3 high=3 half=3 value=4 updated positions low=3 high=3
    public int getTarget (int[] numbers, int target) {
        int low = 0; // 3
        int high = numbers.length - 1; // 3
        int half;

        while (low <= high) {
            // 3 + (3 - 3) / 2 = 1.5
            half = low + (high - low) / 2; // 1

            // 4 == 1
            if (numbers[half] == target) return half;

            // 4 >= 3 (true)
            if (numbers[half] >= numbers[low]) {
                // 1 >= 3 && 1 < 4
                if (target >= numbers[low] && target < numbers[half]) {
                    high = half - 1;
                } else {
                    low = half + 1;
                }
            }else {
                if (target <= numbers[high] && target < numbers[half]) {
                    low = half + 1;
                } else {
                    high = half - 1;
                }
            }
        }

        return -1;
    }

}
