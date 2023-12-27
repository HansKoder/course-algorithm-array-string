import org.example.palindrome.ExamplePalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamplePalindromeTest {

    ExamplePalindrome examplePalindrome = new ExamplePalindrome();

    @Test
    public void shouldBeTrueSince1001IsPalindrome () {
        assertTrue(examplePalindrome.thisNumberIsPalindrome(1001));
    }

    @Test
    public void shouldBeFalseSince1431IsPalindrome () {
        assertFalse(examplePalindrome.thisNumberIsPalindrome(1431));
    }

    @Test
    public void shouldBeTrueSince101IsPalindrome () {
        assertTrue(examplePalindrome.thisNumberIsPalindrome(101));
    }

}
