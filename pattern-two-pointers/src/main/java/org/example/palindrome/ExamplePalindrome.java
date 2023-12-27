package org.example.palindrome;

public class ExamplePalindrome {

    public boolean thisNumberIsPalindrome (int number) {
        String numberTxt = Integer.toString(number);

        int idxBeginning = 0;
        int idxEnding = numberTxt.length() - 1;

        while (idxEnding > idxBeginning) {
            if (numberTxt.charAt(idxBeginning) != numberTxt.charAt(idxEnding)) return false;

            idxBeginning++;
            idxEnding--;
        }

        return true;
    }

}
