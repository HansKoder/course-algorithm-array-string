import org.example.longestsubstring.LongestSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest {

    LongestSubstring object = new LongestSubstring();

    @Test
    public void shouldBeThreeByABC () {
        String s = "abcabcbb";
        assertEquals(3,object.countWithoutRepeating(s));
    }

    @Test
    public void shouldBeFifteen () {
        String s = "jdkafnlcdsalkxcmpoiuytfccv";
        assertEquals(15,object.countWithoutRepeating(s));
    }

}
