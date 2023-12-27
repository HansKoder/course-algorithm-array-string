import org.example.max.GFG;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GFGTest {

    private GFG gfg = new GFG();

    @Test
    public void shouldReturnMaxSum () {

        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;

        assertEquals(24, gfg.maxSum(arr, n, k));
    }

    @Test
    public void shouldReturnMaxSum2 () {

        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;

        assertEquals(24, gfg.maxSumWindowSliding(arr, n, k));
    }

}
