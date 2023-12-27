package org.example.movezeroending;

public class MoveZeros {
    //  0  1  2  3  4
    // {0, 1, 0, 3, 12}
    // 1.  0 - 1 -> {1,0,0,3,12}  (begin -> 0, ending -> 1) // swap
    // 2.  0 - 0 -> {1,0,0,3,12}  (begin -> 1, ending -> 2) // no swap
    // 3.  0 - 3 -> {1,3,0,0,12}  (begin -> 1, ending -> 3)
    // 4.  0 - 12 -> {1,3,12,0,0}  (begin -> 2, ending -> 4)

    public void swapZeros(int[] list) {
        if (list.length < 2) return;

        int idxBeginning = 0;
        int idxEnding = 1;

        while (idxEnding <= list.length - 1) {
            if (list[idxBeginning] == 0 && list[idxEnding] != 0) {
                list[idxBeginning] = list[idxEnding];
                list[idxEnding] = 0;

                idxBeginning++;
                idxEnding++;
            } else if (list[idxBeginning] == 0) {
                idxEnding++;
            } else {
                idxBeginning++;
                idxEnding++;
            }

        }
    }
}
