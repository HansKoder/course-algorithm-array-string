package org.example;


import java.util.HashMap;

public class AlienDictionary {

    private final int LENGTH_OF_ALPHABET = 26;
    private final int MAX_COUNT_OF_WORDS = 2;
    private final String MSG_ERROR_LENGTH_ALPHABET = "alphabet must have 26 of length";

    private HashMap<String, Integer> mapAlphabet = new HashMap<>();

    public Boolean verify (String alphabet, String[] words) throws Exception{
        if (alphabet.length() != LENGTH_OF_ALPHABET) throw new Exception(MSG_ERROR_LENGTH_ALPHABET);

        if (words.length < MAX_COUNT_OF_WORDS) return Boolean.TRUE;

        int count = 1;
        for (Character character : alphabet.toCharArray()) {
            mapAlphabet.put(character.toString(), count);
            count++;
        }

        for (int i = 0; i < words.length - 1; i++) {
            String wordA = words[i];
            String wordB = words[i + 1];

            if (wordA.equals(wordB)) continue;

            if (compare(wordA, wordB) == false) return false;
        }

        return true;
    }

    private Boolean compare (String wordA, String wordB) {
        int lengthMin = Math.min(wordA.length(), wordB.length());

        for (int i = 0; i < lengthMin; i++) {
            int valueA = mapAlphabet.get(String.valueOf(wordA.charAt(i)));
            int valueB = mapAlphabet.get(String.valueOf(wordB.charAt(i)));

            if (valueA < valueB) return Boolean.TRUE;
            if (valueA > valueB) return Boolean.FALSE;
        }

        return wordA.length() <= wordB.length();
    }

}
