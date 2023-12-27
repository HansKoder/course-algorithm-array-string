import org.example.differenceMaxAndMim.CalculateDifference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDifferenceTest {

    private CalculateDifference calc = new CalculateDifference();

    @Test
    public void shouldReturnSixDotFive () {
        int[] numbs = {3,8,9,15};
        int k = 2;
        assertEquals(6.5F, calc.differenceBetweenMaxAndMim(numbs, k));
    }

}
