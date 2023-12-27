package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {


    private static HashMap<String, Integer> getMapOfLetters() {
        HashMap<String, Integer> map = new HashMap<>();

        String[] valuesOfLetters = {"ab", "cde", "fgh", "ijk", "lmn", "opq", "rst", "uvw", "xyz"};

        for (int i = 0; i < valuesOfLetters.length; i++) {
            map.put(valuesOfLetters[i], i + 1);
        }

        return map;
    }


    private static Integer getValueOfMapByConstaintKey(String expected, Set<Map.Entry<String, Integer>> entries) {
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().contains(expected)) {
                return entry.getValue();
            }
        }

        return -1;
    }

    public static int countSubstrings(String input_str) {
        // Write your code here
        input_str = input_str.toLowerCase();

        int countEmptyExtraordinary = 0;
        HashMap<String, Integer> mapOfValues = getMapOfLetters();

        Set<Map.Entry<String, Integer>> entries = mapOfValues.entrySet();

        int pointerInit = 0;
        int pointerEnd = 1;

        int countOfLetters = 1;

        String wordTemporal = "";
        while (countOfLetters <= input_str.length()) {

            wordTemporal = input_str.substring(pointerInit, pointerEnd);

            Integer sum = 0;
            for (int i = 0; i < wordTemporal.length(); i++) {
                sum += getValueOfMapByConstaintKey(String.valueOf(wordTemporal.charAt(i)), getMapOfLetters().entrySet());
            }

            if (sum % wordTemporal.length() == 0) {
                countEmptyExtraordinary++;
            }

            if (pointerEnd == input_str.length()) {
                countOfLetters++;

                pointerInit = 0;
                pointerEnd = countOfLetters;
            } else {
                pointerInit++;
                pointerEnd++;
            }
        }

        return countEmptyExtraordinary;
    }

    public static void main(String[] args) {
        int count = countSubstrings("abcd");

        System.out.println("count " + count);
    }

}
