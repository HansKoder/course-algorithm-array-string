package org.example.getNumber;

public class GetNumber {

      // 1,2,3,4,5,6,7,8,9,10  target 9
      // 5 == 9
      // 5 <= 9
      // 6,7,8,9,10
      // 8
      // 8 <= 9
      // 9,10
      // 9 == 9
      // return 9..
      public int getTarget (int[] list, int target) {

            int left = 0;
            int right = list.length - 1;

            int middle;

            while (left <= right) {
                  middle = Math.round(left + (right - left) / 2);
                  if (list[middle] == target) {
                        return list[middle];
                  } else if (list[middle] < target) {
                        left = middle + 1;
                  }else {
                        right = middle + 1;
                  }
            }

            return -1;
      }

}
