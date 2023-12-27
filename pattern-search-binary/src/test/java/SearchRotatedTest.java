import org.example.searchRotated.SearchRotated;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchRotatedTest {

    private SearchRotated searchRotated = new SearchRotated();

    @Test
    public void shouldReturnTheTargetEqualFour () {
        int[] list = {4,5,6,7,0,1,2};
        assertEquals(0, searchRotated.getTarget(list, 4));
    }

    @Test
    public void shouldReturnLessOneSinceThereIsNotAnyThreeWithInList() {
        int[] list = {4,5,6,7,0,1,2};
        assertEquals(-1, searchRotated.getTarget(list, 3));
    }

    @Test
    public void should () {
        int[] list = {3,4, 0,1};

        assertEquals(3, searchRotated.getTarget(list,1));
    }

}
