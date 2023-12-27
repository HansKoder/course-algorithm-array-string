package org.example.reverseColors;

public class Color {

    public void reverse (int[] colors) {
        if (colors.length < 2) return;

        int pointerA = 0;
        int pointerB = 0;
        int pointerC = colors.length - 1;

        int RED = 0;
        int BLUE = 2;

        while (pointerB <= pointerC) {
            if (colors[pointerB] == RED) {
                if (pointerB == pointerA) {
                    pointerB++;
                    continue;
                }

                int temp = colors[pointerA];

                colors[pointerA] = colors[pointerB];
                colors[pointerB] = temp;

                pointerA++;
            } else if (colors[pointerB] == BLUE) {
                int temp = colors[pointerC];
                colors[pointerC] = colors[pointerB];
                colors[pointerB] = temp;

                pointerC--;
            } else {
                pointerB++;
            }

        }

    }

}
