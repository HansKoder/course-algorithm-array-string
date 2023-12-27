package org.example.differenceMaxAndMim;

public class CalculateDifference {

    // (3,8,9,15)
    // 3 -> window = 3
    // 8 -> window = 11, max = 11, min = 11, start = 1, window = 8
    // 9 -> window = 17, max = 17, min = 11, start = 2, window = 9
    // 15 -> window = 17, max = 17, min = 11, start = 2, window = 9
    public float differenceBetweenMaxAndMim (int[] numbs, int k) {

        float max = 0;
        float min = 0;

        float window = 0;

        int start = 0;

        // 3,8,9,15
        for (int i = 0; i < numbs.length; i++) {
            window += numbs[i]; // 24

            // 3 - 2 + 1 == 2
            if ( (i - start) + 1 == k ) {
                max = Math.max(max, window); // 24
                min = min == 0 ? window : Math.min(min, window); // 11

                window -= numbs[start]; // 24 - 9 = 15

                start++; // 3
            }
        }

        // 24 / 2 = 12 - 11 / 2 = 5.5 = 6.5
        return (max / 2) - (min / 2);
    }

}
