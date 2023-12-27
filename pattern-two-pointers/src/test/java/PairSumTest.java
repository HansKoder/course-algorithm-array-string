import org.example.pairsum.PairSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairSumTest {

    private PairSum pairSum = new PairSum();

    @Test
    public void shouldReturnTwoNumbersWithoutTwoPointers () {
        int numbers[] = { 2, 3, 5, 8, 9, 10, 11 };
        int target = 17;

        int[] arr = pairSum.getPairSumWithoutTwoPointers(numbers, target);

        assertEquals(2, arr.length);
        assertEquals(8, arr[0]);
        assertEquals(9, arr[1]);
    }

    @Test
    public void shouldReturnTwoNumbersWithTwoPointers () {
        List<Integer> numbers = Arrays.asList(2,3,5,8,9,10,11);
        int target = 17;

        int[] arr = pairSum.getPairSumWithTwoPointers(numbers, target);

        assertEquals(2, arr.length);
        assertEquals(8, arr[0]);
        assertEquals(9, arr[1]);
    }

}
