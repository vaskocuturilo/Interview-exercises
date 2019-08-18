package parsestring;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ParseStringTest {

    @Test
    public void parseStringWithCorrectData() {
        ParseString parseString = new ParseString();
        String actualString = "22h22h22";
        int[] expectedString = parseString.parseString(actualString);
        assertArrayEquals(new int[]{22, 22, 22}, expectedString);
    }

    @Test
    public void parseStringWithoutData() {
        ParseString parseString = new ParseString();
        String actualString = "";
        int[] expectedString = parseString.parseString(actualString);
        assertArrayEquals(null, expectedString);
    }
}