import org.example.array2d.SearchArray2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchArray2DTest {

    private SearchArray2D searchArray2D = new SearchArray2D();

    @Test
    public void shouldGetPositionSinceTenIsLocatedOnTheSecondRecordLikeFirstItem () {
        int[][] numbers = new int[][] { {1,3, 5}, {10, 11, 16} };
        int target = 10;

        int[] response = searchArray2D.getIndex(numbers, target);

        assertEquals(2, response.length);
        assertEquals(1, response[0]);
        assertEquals(0, response[1]);
    }

    @Test
    public void shouldGetPositionSinceElevenIsLocatedOnTheSecondRecordLikeHalf () {
        int[][] numbers = new int[][] { {1,3, 5}, {10, 11, 16} };
        int target = 11;

        int[] response = searchArray2D.getIndex(numbers, target);

        assertEquals(2, response.length);
        assertEquals(1, response[0]);
        assertEquals(1, response[1]);
    }

    @Test
    public void shouldGetNegativeOneSinceTwentyIsGreaterThanLastItemOfList () {
        int[][] numbers = new int[][] { {1,3, 5}, {10, 11, 16} };
        int target = 20;

        int[] response = searchArray2D.getIndex(numbers, target);

        assertEquals(1, response.length);
        assertEquals(-1, response[0]);
    }

    @Test
    public void shouldGetNegativeOneSinceTwelveIsNotExistIntoList () {
        int[][] numbers = new int[][] { {1,3, 5}, {10, 11, 16} };
        int target = 12;

        int[] response = searchArray2D.getIndex(numbers, target);

        assertEquals(1, response.length);
        assertEquals(-1, response[0]);
    }

    @Test
    public void shouldGetNegativeOneSinceTwoIsNotExistIntoList () {
        int[][] numbers = new int[][] { {1,3, 5}, {10, 11, 16} };
        int target = 2;

        int[] response = searchArray2D.getIndex(numbers, target);

        assertEquals(1, response.length);
        assertEquals(-1, response[0]);
    }

}
