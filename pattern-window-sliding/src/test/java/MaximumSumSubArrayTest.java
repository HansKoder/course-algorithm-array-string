import org.example.sum.MaximumSumSubArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumSubArrayTest {

    private MaximumSumSubArray object = new MaximumSumSubArray();

    @Test
    public void shouldReturnEightLikeResponse () {
        int[] numbers = {3,5,2,1,7};
        int k = 2;

        assertEquals(8, object.getMaxSum(numbers,k));
    }

    @Test
    public void shouldReturnZeroSinceKisGreaterThanSizeOfList () {
        int[] numbers = {3,5};
        int k = 3;

        assertEquals(0, object.getMaxSum(numbers, k));
    }

    @Test
    public void shouldReturnZeroSinceThereIsJustOneItemIntoList () {
        int[] numbers = {3};
        int k = 1;

        assertEquals(0, object.getMaxSum(numbers, k));
    }

    @Test
    public void shouldReturnTwentyOneLikeResponse () {
        int[] numbers = {3, 5, 6, 2, 1, 8, 10,3};
        int k = 3;

        assertEquals(21, object.getMaxSum(numbers, k));
    }

}
