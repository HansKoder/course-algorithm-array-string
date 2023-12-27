package org.example.sum;

public class MaximumSumSubArray {

    public int getMaxSum (int[] numbers, int k) {
        if (numbers.length == 1) return 0;
        if (k > numbers.length) return 0;

        int maxSum = 0;
        int windowSum = 0;
        int firstPosition = 0;

        for (int i = 0; i < numbers.length; i++) {
            windowSum += numbers[i];

            if ( (i - firstPosition) + 1 == k ) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= numbers[firstPosition];
                firstPosition++;
            }
        }

        return maxSum;
    }

}
