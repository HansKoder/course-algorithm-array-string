package org.example.anagram;

import java.util.HashMap;
import java.util.Optional;


public class Anagram {

    public int countOccurrences (String text, String word) {
        if (word.isEmpty() || word.length() > text.length()) return 0;

        /**
         * Map of word within a hashMap
         * Character -> For being match with the character of text
         * Integer -> Last position (Index)
         */
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), -1);
        }

        int begin = -1;
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i); // x
            Optional<Integer> lastIndex = Optional.ofNullable(map.get(c));

            if (lastIndex.isEmpty() || lastIndex.get() > begin) {
                begin = i;
                continue;
            }

            map.put(c, i);

            if (i - begin == word.length()) {
                count++;
                begin = i;
            }
        }

        return count;
    }

}
