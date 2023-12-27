package org.example.inversestring;

import java.util.Stack;

public class ExerciseReverseString {

    public void reverseString (char[] s) {

        int idxBeginning = 0;
        int idxEnding = s.length - 1;

        while (idxEnding > idxBeginning) {
            char temp = s[idxBeginning];

            s[idxBeginning] = s[idxEnding];
            s[idxEnding] = temp;

            idxEnding--;
            idxBeginning++;
        }

    }

    public void reverseStringWithStack (char[] s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }

        int i = 0;
        while (!stack.empty()) {
            s[i] = stack.pop();
            i++;
        }
    }

}
