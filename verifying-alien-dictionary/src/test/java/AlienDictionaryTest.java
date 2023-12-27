import org.example.AlienDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlienDictionaryTest {

    private AlienDictionary alienDictionary = new AlienDictionary();

    @Test
    public void shouldReturnFalseSinceWordsIsNotOrdered () throws Exception {
        String alphabet = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words = {"habito", "hacer", "sonreir", "lectura"};

        assertFalse(alienDictionary.verify(alphabet, words));
    }

    @Test
    public void shouldReturnTrueSinceWordsIsOrdering () throws Exception{
        String alphabet = "hlabcdfgijkmnopqrstuvwxyze";
        String[] words = {"habito", "hacer", "lectura", "sonreir"};

        assertTrue(alienDictionary.verify(alphabet, words));
    }

    @Test
    public void shouldReturnErrorSinceAlphabetMustHave26Characters () throws Exception{
        String alphabet = "hla";
        String[] words = {"habito", "hacer", "lectura", "sonreir"};

        Exception exception = assertThrows(Exception.class, () -> {
            alienDictionary.verify(alphabet, words);
        });

        String expectedMessage = "alphabet must have 26 of length";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldReturnTrueSinceTheListOfWordsThereIsNotAnythingItem () throws Exception {
        String alphabet = "hlabcdfgijkmnopqrstuvwxyze";
        String[] words = {};

        assertTrue(alienDictionary.verify(alphabet, words));
    }


    @Test
    public void shouldReturnTrueSinceTheListOfWordsThereIsJustOneItem () throws Exception {
        String alphabet = "hlabcdfgijkmnopqrstuvwxyze";
        String[] words = {"habito"};

        assertTrue(alienDictionary.verify(alphabet, words));
    }

}
