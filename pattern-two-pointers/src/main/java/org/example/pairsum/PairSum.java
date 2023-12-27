package org.example.pairsum;

import java.util.List;

public class PairSum {

    public int[] getPairSumWithoutTwoPointers (int[] numbs, int target) {
        int size = numbs.length;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (i == j) continue;

                if (numbs[i] + numbs[j] == target) {
                    return new int[] {numbs[i], numbs[j]};
                }

                if (numbs[i] + numbs[j] > target) break;
            }
        }

        return new int[] {};
    }

    public int[] getPairSumWithTwoPointers (List<Integer> numbs, int target) {

        int low = 0;
        int high = numbs.size() - 1;

        while (low < high) {
            if (numbs.get(low) + numbs.get(high) == target) {
                return new int[] {numbs.get(low), numbs.get(high)};
            }

            if (numbs.get(low) + numbs.get(high) < target) {
                low++;
            } else {
                high--;
            }
        }

        return new int[] {};
    }

}
