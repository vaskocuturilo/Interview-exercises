package numberelement;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberElementTest {

    @Test
    public void getNumberOfIndexElement() {
        NumberElement numberElement = new NumberElement();
        numberElement.getNumberOfIndexElement(new int[]{1, 2, 3}, 2);
        assertEquals(1, numberElement.getNumberOfIndexElement(new int[]{1, 2, 3}, 2));
    }
}