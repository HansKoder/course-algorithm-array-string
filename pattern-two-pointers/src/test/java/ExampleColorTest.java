import org.example.reverseColors.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleColorTest {

    Color color = new Color();

    @Test
    public void shouldSwapSomeColors () {
        int[] colors = {2,0,2,1,1,0};

        color.reverse(colors);

        assertEquals(0,colors[0]);
        assertEquals(0,colors[1]);
        assertEquals(1,colors[2]);
        assertEquals(1,colors[3]);
        assertEquals(2,colors[4]);
        assertEquals(2,colors[5]);
    }

}
