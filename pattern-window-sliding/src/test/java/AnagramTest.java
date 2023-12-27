import org.example.anagram.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    private Anagram anagram = new Anagram();

    @Test
    public void shouldGetThreeOccurrencesSinceThereAreThreeTimesTheWordGOT () {
        String text = "gotxxotgxdogt";
        String word = "got";

        assertEquals(3, anagram.countOccurrences(text, word));
    }

    @Test
    public void shouldGetZeroSinceWordIsEmpty () {
        String text = "gotxxotgxdogt";
        String word = "";

        assertEquals(0, anagram.countOccurrences(text, word));
    }

    @Test
    public void shouldGetZeroSinceTheLengthOfWordIsGreaterOfText () {
        String text = "go";
        String word = "got";

        assertEquals(0, anagram.countOccurrences(text, word));
    }


    @Test
    public void shouldGetOneOccurrencesSinceThereAreOnceTheWordGOT () {
        String text = "gotggolotpgop";
        String word = "got";

        assertEquals(1, anagram.countOccurrences(text, word));
    }
}
