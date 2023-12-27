package org.example.longestsubstring;

import java.util.HashMap;
import java.util.Optional;

public class LongestSubstring {

    public int countWithoutRepeating (String s) {
        if (s.length() < 2) return 0;

        int begin = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            Optional<Integer> opt = Optional.ofNullable(map.get(s.charAt(i)));
            if ( opt.isPresent() && begin <= opt.get() ) {
                begin = i;
            }

            map.put(s.charAt(i), i);
            maxCount = Math.max(maxCount, (i - begin) + 1);
        }

        return maxCount;
    }

}
