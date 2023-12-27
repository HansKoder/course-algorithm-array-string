import org.example.getNumber.GetNumber;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetNumberTest {

    private GetNumber getNumber = new GetNumber();

    @Test
    public void shouldGetTheTargetOfListOfNumbers () {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(9, getNumber.getTarget(list,9));
    }

    @Test
    public void shouldGetLessOneSinceThereIsNotAnyMatch() {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(-1, getNumber.getTarget(list,100));
    }

}
