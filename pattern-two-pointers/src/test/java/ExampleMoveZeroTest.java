import org.example.movezeroending.MoveZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExampleMoveZeroTest {

    private MoveZeros moveZeros = new MoveZeros();

    @Test
    public void shouldSwapTwoZerosIntoList () {
        int[] list = {0,1,0, 3, 12};

        int[] expected = {1,3, 12, 0, 0};
        moveZeros.swapZeros(list);
        assertArrayEquals(expected, list);
    }

    @Test
    public void shouldDoNothingSinceJustThereIsOneItem () {
        int[] list = {0};

        int[] expected = {0};
        moveZeros.swapZeros(list);
        assertArrayEquals(expected, list);
    }

    @Test
    public void shouldDoNothingSinceThereIsNotAnyZero () {
        int[] list = { 1, 4, 3, 12};

        int[] expected = {1, 4, 3 , 12};
        moveZeros.swapZeros(list);
        assertArrayEquals(expected, list);
    }

    @Test
    public void shouldSwapOnePosition () {
        int[] list = { 0, 40, 5, 0};

        int[] expected = {40, 5, 0, 0};
        moveZeros.swapZeros(list);

        assertArrayEquals(expected, list);
    }

}
