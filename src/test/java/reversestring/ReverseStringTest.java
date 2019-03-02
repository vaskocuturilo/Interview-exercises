package reversestring;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseWithoutBuilder() {
        String text = "Hello world";
        assertEquals("dlrow olleH", ReverseString.reverseWithoutBuilder(text));
    }

    @Test
    public void reverseWithBuilder() {
        String text = "Hello world";
        assertEquals("dlrow olleH",ReverseString.reverseWithoutBuilder(text));
    }
}