import org.example.inversestring.ExerciseReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseReverseStringTest {

    ExerciseReverseString object = new ExerciseReverseString();

    @Test
    public void shouldReverseHelloWithStack () {
           char[] s = {'h', 'e', 'l', 'l', 'o'};

           object.reverseStringWithStack(s);
           assertEquals('o', s[0]);
           assertEquals('l', s[1]);
           assertEquals('l', s[2]);
           assertEquals('e', s[3]);
           assertEquals('h', s[4]);
    }

    @Test
    public void shouldReverseHannah () {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};

        object.reverseString(s);
        assertEquals('h', s[0]);
        assertEquals('a', s[1]);
        assertEquals('n', s[2]);
        assertEquals('n', s[3]);
        assertEquals('a', s[4]);
        assertEquals('H', s[5]);
    }

}
